/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facade;

import com.dto.ProductoDto;

/**
 *
 * @author stive
 */
public class pruebaWebService {
    public static void main(String[] args) {
        try {
            ProductoDto p= new ProductoDto();
        ProductoFacadeImpl servicio= new ProductoFacadeImpl();
        System.out.println("Consumiendo servicio" );
        p= servicio.listarProductoService();
            System.out.println("se ha consumido el servicio correctamente:  nombre primerProducto:" 
                    + p.getProductos().get(0).getNombres());
        } catch (Exception e) {
            System.out.println("Error al consumir servicio : " + e.getMessage() + e);
        }
        
    }
    
}
