package com.nb.springbootmicroserviceitem.Models.service;

import com.nb.springbootmicroserviceitem.Models.Item;
import com.nb.springbootmicroservicecommons.Models.Entity.Producto;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();

    public Item findById(Long id, int cantidad);

    public Producto save(Producto producto);

    public Producto update(Producto producto, long id);

    public void delete(long id);
}
