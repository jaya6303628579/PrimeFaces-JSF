package com.example.repository;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer {

    private EntityManagerFactory entityManagerFactory;

    public EntityManagerProducer() {
        entityManagerFactory = Persistence.createEntityManagerFactory("DU");
    }

    @Produces
    @ApplicationScoped
    public EntityManager createEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
    
    
    public void closeEntityManager(@Disposes EntityManager entityManager) {
        if (entityManager.isOpen()) {
            entityManager.close();
        }
    }
}