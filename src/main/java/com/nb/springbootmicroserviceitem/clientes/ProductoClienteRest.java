package com.nb.springbootmicroserviceitem.clientes;

import com.nb.springbootmicroserviceitem.Models.Item;
import com.nb.springbootmicroserviceitem.Models.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.Port;
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
