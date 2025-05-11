package com.processstandard;

import com.processstandard.usuarios.model.Usuario;
import com.processstandard.usuarios.service.UsuarioService;
import com.processstandard.estandares.model.Estandar;
import com.processstandard.estandares.service.EstandarService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProcessstandardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProcessstandardApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UsuarioService usuarioService, EstandarService estandarService) {
        return args -> {
            // Usuario por defecto
            Usuario usuario = new Usuario();
            usuario.setNombre("José Estupiñán");
            usuario.setArea("Producción");
            usuario.setUsuario("jestupinan");
            usuario.setContrasena("je12345");

            if (usuarioService.obtenerTodos().stream().noneMatch(u -> u.getUsuario().equals("jestupinan"))) {
                usuarioService.crearUsuario(usuario);
                System.out.println("✅ Usuario insertado desde Java");
            } else {
                System.out.println("ℹ️ Usuario ya existe, no se insertó.");
            }

            // insertar estandar
            boolean yaExiste = estandarService.obtenerTodos().stream()
            .anyMatch(e -> e.getMaquina().equals("EXT-009") && e.getReferencia().equals("MUL456"));
            if (!yaExiste) {
                Estandar estandar = new Estandar();
                estandar.setMaquina("EXT-009");
                estandar.setReferencia("MUL456");
                estandarService.crear(estandar);
                System.out.println("✅ Estándar insertado desde Java");
            } else {
                System.out.println("ℹ️ Estándar ya existe, no se insertó.");
            }
        };
    }
}