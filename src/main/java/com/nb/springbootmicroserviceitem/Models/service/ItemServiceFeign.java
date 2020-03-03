package com.nb.springbootmicroserviceitem.Models.service;

import com.nb.springbootmicroserviceitem.Models.Item;
import com.nb.springbootmicroservicecommons.Models.Entity.Producto;
import com.nb.springbootmicroserviceitem.clientes.ProductoClienteRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("serviceFeign")
@Primary //Permite que se injecte por defecto en el controller
public class ItemServiceFeign implements ItemService {

    @Autowired
    private ProductoClienteRest clienteFeign;

    @Override
    public List<Item> findAll() {
        return clienteFeign.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, int cantidad) {
        return new Item(clienteFeign.detalle(id), cantidad);
    }

    @Override
    public Producto save(Producto producto) {

        return clienteFeign.crear(producto);
    }

    @Override
    public Producto update(Producto producto, long id) {
        return clienteFeign.update(producto, id);
    }

    @Override
    public void delete(long id) {
        clienteFeign.eliminar(id);
    }
}
