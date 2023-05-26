package com.eduardoreyes.API;

import Clases.ListaUsuario;
import Clases.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final ListaUsuario listaUsuario;
    public AuthController(ListaUsuario listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    @PostMapping
    public Map<String, String> login(@RequestBody Usuario request) {
        String nombre = request.getNombre();
        String contraseña = request.getPassword();

        Usuario usuario = listaUsuario.obtenerUsuarioPorNombre(nombre);
        if (usuario != null && usuario.getPassword().equals(contraseña)) {
            // Autenticación exitosa
            String token = "HUASYF79Y9A7YNC9Y9FAYCFYDICHAUHDUIAYD79AHD79AHDN9A9D8A9D8AUS80";
            Map<String, String> response = new HashMap<>();
            response.put("token", token);
            return response;
        } else {
            // Autenticación fallida
            throw new IllegalArgumentException("Nombre de usuario o contraseña incorrectos");
        }
    }
}
