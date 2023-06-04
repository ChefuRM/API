package Clases;

public class Pedido {
    private static int contadorID = 0;
    int numeroPedido;
    String departamentoOrigen;
    String departamentoDestino;
    String fechaInicio;
    String cliente;
    String repartidor;
    String vehiculo;
    String numeroCajas;
    String cajasProducto;
    String estado;

    public Pedido(String departamentoOrigen, String departamentoDestino, String fechaInicio, String cliente, String repartidor, String vehiculo, String cajasProducto, String numeroCajas, String estado) {
        this.numeroPedido = generarID();
        this.departamentoDestino = departamentoDestino;
        this.departamentoOrigen = departamentoOrigen;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
        this.repartidor = repartidor;
        this.vehiculo = vehiculo;
        this.cajasProducto = cajasProducto;
        this.numeroCajas = numeroCajas;
        this.estado = estado;

    }

    private static int generarID() {
        return ++contadorID;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getDepartamentoOrigen() {
        return departamentoOrigen;
    }

    public String getDepartamentoDestino() {
        return departamentoDestino;
    }

    public String getCliente() {
        return cliente;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getRepartidor() {
        return repartidor;
    }

    public String getVehiculo() {
        return vehiculo;
    }
    public String getNumeroCajas() {
        return numeroCajas;
    }

    public String getCajasProducto() {
        return cajasProducto;
    }

    public String getEstado() {
        return estado;
    }
}
