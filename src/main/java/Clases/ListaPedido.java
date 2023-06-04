package Clases;

import java.util.ArrayList;

public class ListaPedido {
    NodoPedido cabeza;

    public ListaPedido() {
        this.cabeza = null;
    }

    public void agregar(Pedido pedido) {
        NodoPedido nuevoNodo = new NodoPedido(pedido);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoPedido nodoActual = cabeza;
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }
            nodoActual.siguiente = nuevoNodo;
        }
    }

    public void imprimir() {
        NodoPedido nodoActual = cabeza;
        while (nodoActual != null) {
            Pedido pedido = nodoActual.pedido;
            System.out.println("Numero de Pedido: " + pedido.getNumeroPedido());
            System.out.println("Departamento de Origen: " + pedido.getDepartamentoOrigen());
            System.out.println("Departamento de Destino: " + pedido.getDepartamentoDestino());
            System.out.println("Fecha de Envio: " + pedido.getFechaInicio());
            System.out.println("Cliente: " + pedido.getCliente());
            System.out.println("Repartidor: " + pedido.getRepartidor());
            System.out.println("Vehiculo: " + pedido.getVehiculo());
            System.out.println("Cajas de Producto: " + pedido.getCajasProducto());
            System.out.println("Numero de Cajas"+pedido.getNumeroCajas());
            System.out.println("Estado de Pedido"+pedido.getEstado());
            nodoActual = nodoActual.siguiente;
        }
    }

    public ArrayList<Pedido> obtenerPedidos() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        NodoPedido nodoActual = cabeza;
        while (nodoActual != null) {
            pedidos.add(nodoActual.pedido);
            nodoActual = nodoActual.siguiente;
        }
        return pedidos;
    }

    public Pedido obtenerPedidoPorCliente(String cliente) {
        NodoPedido actual = cabeza;
        while (actual != null) {
            if (actual.pedido.getCliente().equals(cliente)) {
                return actual.pedido;
            }
            actual = actual.siguiente;
        }
        return null; // Usuario no encontrado
    }
}
