package com.gestion.productos.servicio;

import com.gestion.productos.modelo.Producto;
import com.gestion.productos.repositorio.ProductoRepositotrio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {

    @Autowired
    private ProductoRepositotrio productoRepositotrio;

    public List<Producto> listarProductos(){
        return productoRepositotrio.findAll();
    }

    public void guardarProductos(Producto producto){

        productoRepositotrio.save(producto);
    }

    public Producto obtenerProductoPorId(Integer id){
        return productoRepositotrio.findById(id).get();
    }
    public void eliminarProducto(Integer id){

        productoRepositotrio.deleteById(id);

    }

}
