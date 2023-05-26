package Clases;

public class NodoUsuario {
    Usuario usuario;
    NodoUsuario siguiente;

    public NodoUsuario(Usuario usuario){
        this.usuario = usuario;
        this.siguiente = null;
    }
}
