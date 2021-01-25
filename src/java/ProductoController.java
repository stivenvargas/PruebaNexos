/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Util.logCarritoCompras;
import com.dto.Carrito;
import com.dto.ProductoDto;
import com.dto.ProductoDto1;
import com.facade.ProductoFacadeImpl;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author stive
 */
@ManagedBean
@Named(value = "productoController")
@SessionScoped
public class ProductoController implements Serializable {

    ProductoDto listProduct = new ProductoDto();
    ProductoFacadeImpl facadeImpl = new ProductoFacadeImpl();
    ProductoDto1 productoDto1 = new ProductoDto1();
    List<Carrito> listaCarrito = new ArrayList<>();
    int item;
    double totalPagar = 0.0;
    int cantidad = 1;
    int contador = 0;
    private int testOk=0;
    logCarritoCompras log= new logCarritoCompras();

    /**
     * Creates a new instance of ProductoController
     */
    public ProductoController() {

    }

    @PostConstruct
    public void inicio() {
        try {
        facadeImpl = new ProductoFacadeImpl();
        listProduct = facadeImpl.listarProductoService();
        } catch (Exception e) {
            log.setLogError("error en metodo de Inicio, consultando lista de productos" + e.getMessage());
        }
    }

    public String init() {
        try {
            listProduct = facadeImpl.listarProductoService();
            return "home";
        } catch (Exception e) {
            System.out.println("Error metodo int: " + e.getMessage());
            log.setLogError("error al Iniciar" + e.getMessage());
            return "inicio";
        }
    }

    public int consultarProducto(int id) {
        try {
            productoDto1 = facadeImpl.listarProductoId(id);
            item = item + 1;
            Carrito carrito = new Carrito();
            carrito.setItem(item);
            carrito.setIdProducto(productoDto1.getIdProducto());
            carrito.setNombre(productoDto1.getNombres());
            carrito.setDescripcion(productoDto1.getDescripcion());
            carrito.setPrecioCompra(productoDto1.getPrecio());
            carrito.setCantidad(cantidad);
            carrito.setSubTotal(cantidad * productoDto1.getPrecio());
            listaCarrito.add(carrito);
            contador = listaCarrito.size();
        } catch (Exception e) {
            log.setLogError("error al consultar producto por id:" + e.getMessage());
            testOk= 1;
        }
        return testOk;
    }

    public String hacerCompra(int id) {
        try {
            totalPagar = 0.00;
            productoDto1 = facadeImpl.listarProductoId(id);
            item = item + 1;
            Carrito carrito = new Carrito();
            carrito.setItem(item);
            carrito.setIdProducto(productoDto1.getIdProducto());
            carrito.setNombre(productoDto1.getNombres());
            carrito.setDescripcion(productoDto1.getDescripcion());
            carrito.setPrecioCompra(productoDto1.getPrecio());
            carrito.setCantidad(cantidad + 1);
            carrito.setSubTotal(cantidad * productoDto1.getPrecio());
            listaCarrito.add(carrito);
            contador = listaCarrito.size();
            for (int i = 0; i < listaCarrito.size(); i++) {
                totalPagar = totalPagar + listaCarrito.get(i).getSubTotal();
            }
        } catch (Exception e) {
            log.setLogError("error al consultar producto por id:" + e.getMessage());
        }
        return "Carrito";
    }
    
    public void realizarPago(){
        try {
            if(!listaCarrito.isEmpty()){
            FacesMessage facesMessage= new FacesMessage(FacesMessage.SEVERITY_INFO, "Pago Exitoso", null);
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
            }else{
                FacesMessage facesMessage= new FacesMessage(FacesMessage.SEVERITY_ERROR, "Pago Exitoso", null);
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
            }
        } catch (Exception e) {
            log.setLogError("Error al realizar el pago:" + e.getMessage());
        }
    }

    public void eliminarProducto(int id) {
        for (int i = 0; i < listaCarrito.size(); i++) {
            if(listaCarrito.get(i).getIdProducto() == id){
                listaCarrito.remove(i);
            }
        }
    }

    public String verCarrito() {
        totalPagar = 0.00;
        for (int i = 0; i < listaCarrito.size(); i++) {
            totalPagar = totalPagar + listaCarrito.get(i).getSubTotal();
        }
        return "Carrito";
    }

    public ProductoDto getListProduct() {
        return listProduct;
    }

    public void setListProduct(ProductoDto listProduct) {
        this.listProduct = listProduct;
    }

    public ProductoDto1 getProductoDto1() {
        return productoDto1;
    }

    public void setProductoDto1(ProductoDto1 productoDto1) {
        this.productoDto1 = productoDto1;
    }

    public List<Carrito> getListaCarrito() {
        return listaCarrito;
    }

    public void setListaCarrito(List<Carrito> listaCarrito) {
        this.listaCarrito = listaCarrito;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getTestOk() {
        return testOk;
    }

    public void setTestOk(int testOk) {
        this.testOk = testOk;
    }

    
}
