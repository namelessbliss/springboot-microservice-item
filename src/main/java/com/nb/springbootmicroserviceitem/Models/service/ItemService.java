package com.nb.springbootmicroserviceitem.Models.service;

import com.nb.springbootmicroserviceitem.Models.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();

    public Item findById(Long id, int cantidad);
}
