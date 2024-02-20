package org.chrisferdev.webapp.ear.ejb.repositories;

import org.chrisferdev.webapp.ear.ejb.entities.Usuario;

import java.util.List;

public interface UsuarioRepository {
    List<Usuario> listar();
}
