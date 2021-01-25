/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dto;

import java.io.InputStream;
import java.util.ArrayList;

/**
 *
 * @author stive
 */
public class ProductoDto {
    private ArrayList<ProductoDto1> productos;

    public ProductoDto() {
    }

    public ArrayList<ProductoDto1> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoDto1> productos) {
        this.productos = productos;
    }
    
    
    
}
