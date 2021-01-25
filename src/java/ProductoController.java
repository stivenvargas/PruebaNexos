/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import javax.ejb.EJB;
import javax.faces.context.FacesContext;

/**
 *
 * @author stive
 */
@ManagedBean
@Named(value = "productoController")
@SessionScoped
public class ProductoController implements Serializable {
    
    ProductoDto listProduct= new ProductoDto();
    ProductoFacadeImpl facadeImpl= new ProductoFacadeImpl();
    ProductoDto1 productoDto1= new ProductoDto1();
    List<Carrito> listaCarrito= new ArrayList<>();
    int item;
    double totalPagar=0.0;
    int cantidad= 0;
    int contador=0;

    /**
     * Creates a new instance of ProductoController
     */
    public ProductoController() {
         facadeImpl= new ProductoFacadeImpl();
    }
    
    public String init(){
        try {
            listProduct= facadeImpl.listarProductoService();
         return "home";
        } catch (Exception e) {
            System.out.println("Error metodo int: " +e.getMessage());
            return "inicio";
        }
    }
    
    public void consultarProducto(int id){
        try {
            productoDto1= facadeImpl.listarProductoId(id);
            item= item+1;
            Carrito carrito= new Carrito();
            carrito.setItem(item);
            carrito.setIdProducto(productoDto1.getIdProducto());
            carrito.setNombre(productoDto1.getNombres());
            carrito.setDescripcion(productoDto1.getDescripcion());
            carrito.setPrecioCompra(productoDto1.getPrecio());
            carrito.setCantidad(cantidad +1);
            carrito.setSubTotal(cantidad*productoDto1.getPrecio());
            listaCarrito.add(carrito);
            contador= listaCarrito.size();
        } catch (Exception e) {
            
        }
    }
    
    public void hacerCompra(){
        
    }
    
    public String verCarrito(){
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
    
    
    
    
}
