/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facade;

import com.dto.ProductoDto;
import com.dto.ProductoDto1;
import com.services.ProductoService;
import java.net.MalformedURLException;
import java.net.URL;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author stive
 */
public class ProductoFacadeImpl implements ProductoFacade{

    ProductoService productoService;
    
    @GET
    @Produces("application/json")
    @Override
    public ProductoDto listarProductoService(){
        ProductoDto productos= new ProductoDto();
        try {
            Client client= ClientBuilder.newClient();
            return productos= client.target("http://localhost:8080/WebServiceCarroCompras/webresources/restProduct/list")
                    .request(MediaType.APPLICATION_JSON).get(ProductoDto.class);
         } catch (Exception e) {
             e.getMessage();
             return null;
        }
        
    }
    
    @GET
    @Produces("application/json")
    @Override
    public ProductoDto1 listarProductoId(int id){
        ProductoDto1 producto= new ProductoDto1();
        try {
            Client client= ClientBuilder.newClient();
            return producto= client.target("http://localhost:8080/WebServiceCarroCompras/webresources/restProduct/product/" + id)
                    .request(MediaType.APPLICATION_JSON).get(ProductoDto1.class);
         } catch (Exception e) {
             e.getMessage();
             return null;
        }
        
    }
    
}
