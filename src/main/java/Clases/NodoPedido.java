package Clases;

public class NodoPedido {
    Pedido pedido;
    NodoPedido siguiente;

    public NodoPedido(Pedido pedido){
        this.pedido = pedido;
        this.siguiente = null;
    }
}