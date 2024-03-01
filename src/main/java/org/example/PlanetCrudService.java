package org.example;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class PlanetCrudService {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Planet planet) {
        entityManager.persist(planet);
    }

    public Planet findById(String id) {
        return entityManager.find(Planet.class, id);
    }

    public void delete(Planet planet) {
        entityManager.remove(planet);
    }
}
