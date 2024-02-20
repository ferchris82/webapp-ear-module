package org.chrisferdev.webapp.ear.ejb.repositories;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.chrisferdev.webapp.ear.ejb.entities.Usuario;

import java.util.List;

@RequestScoped
public class UsuarioRepositoryImpl implements UsuarioRepository{
    @Inject
    private EntityManager em;

    @Override
    public List<Usuario> listar() {
        return em.createQuery("FROM Usuario", Usuario.class).getResultList();
    }
}
