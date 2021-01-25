/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.dto.Carrito;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author stive
 */
@ManagedBean
@Named(value = "carritoController")
@SessionScoped
public class CarritoController implements Serializable {

    Carrito carrito= new Carrito();
    
    /**
     * Creates a new instance of CarritoController
     */
    public CarritoController() {
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    
    
    
}
