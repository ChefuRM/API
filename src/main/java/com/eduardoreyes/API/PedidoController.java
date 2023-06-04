package com.eduardoreyes.API;

import Clases.ListaPedido;
import Clases.Pedido;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    ListaPedido listaPedido;

    public PedidoController(ListaPedido listaPedido) {
        this.listaPedido = listaPedido;
    }

    @PostMapping("/add")
    ResponseEntity<String> Add(@RequestBody Pedido pedido) {
        try {
            Pedido newPedido = pedido;
            listaPedido.agregar(newPedido);
            listaPedido.imprimir();
            return ResponseEntity.status(HttpStatus.CREATED)
                    .header("Content-Type", "application/json")
                    .body("{\"message\": \"Pedido agregado exitosamente.\"}");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .header("Content-Type", "application/json")
                    .body("{\"message\": \"Algo sucedio al tratar de agregar el Pedido, Error: " + ex.getMessage() + ".\"}");
        }
    }

    @GetMapping
    public ArrayList<Pedido> obtenerPedidos() {
        return listaPedido.obtenerPedidos();
    }
}
