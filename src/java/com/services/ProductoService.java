/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.dto.ProductoDto;
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
public class ProductoService {
    
    @GET
    @Produces("application/json")
    ProductoDto listarProductoService() throws MalformedURLException{
        ProductoDto productos= new ProductoDto();
        try {
            URL url = new URL("http://localhost:8080/webService/webresources/restProduct/list"); 
            Client client= ClientBuilder.newClient();
            return productos= client.target("http://localhost:8080/webService/webresources/restProduct/list")
                    .request(MediaType.APPLICATION_JSON).get(ProductoDto.class);
         } catch (Exception e) {
             e.getMessage();
             return null;
        }
        
    }
}
