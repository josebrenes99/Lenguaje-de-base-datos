package com.Proyecto.service;

import com.Proyecto.domain.Carrito;


public interface CarritoService {
    
    public Carrito getCarrito(Carrito carrito);
    
    public Carrito getCarritoCliente(long idCliente);
}
