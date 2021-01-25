/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facade;

import com.dto.ProductoDto;
import com.dto.ProductoDto1;
import java.util.List;

/**
 *
 * @author stive
 */
public interface ProductoFacade {
    
    ProductoDto listarProductoService();
    ProductoDto1 listarProductoId(int id);
    
}
