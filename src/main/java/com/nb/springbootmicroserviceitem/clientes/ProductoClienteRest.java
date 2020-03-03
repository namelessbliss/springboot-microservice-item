package com.nb.springbootmicroserviceitem.clientes;

import org.springframework.cloud.openfeign.FeignClient;
import com.nb.springbootmicroservicecommons.Models.Entity.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "servicio-productos")
public interface ProductoClienteRest {

    @GetMapping("/listar")
    public List<Producto> listar();

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable long id);

    @PostMapping("/crear")
    public Producto crear(@RequestBody Producto producto);

    @PutMapping("/editar/{id}")
    public Producto update(@RequestBody Producto producto, @PathVariable long id);

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable long id);
}
