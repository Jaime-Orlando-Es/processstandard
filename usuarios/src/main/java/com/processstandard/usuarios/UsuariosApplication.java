package com.processstandard.usuarios;

import com.processstandard.usuarios.model.Usuario;
import com.processstandard.usuarios.service.UsuarioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UsuariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsuariosApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UsuarioService usuarioService) {
        return args -> {
            Usuario usuario = new Usuario();
            usuario.setNombre("Jos\u00e9 Estupi\u00f1\u00e1n");
            usuario.setArea("Producci\u00f3n");
            usuario.setUsuario("jestupinan");
            usuario.setContrasena("je12345");
            
             if (usuarioService.obtenerTodos().stream().noneMatch(u -> u.getUsuario().equals("jestupinan"))) {
            usuarioService.crearUsuario(usuario);
            System.out.println("✅ Usuario insertado desde Java");
            } else {
            System.out.println("ℹ️ Usuario ya existe, no se insertó.");
          }
        };
    }
}