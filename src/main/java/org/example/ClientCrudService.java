package org.example;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientCrudService {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Client client) {
        entityManager.persist(client);
    }

    public Client findById(Long id) {
        return entityManager.find(Client.class, id);
    }

    public void delete(Client client) {
        entityManager.remove(client);
    }
}

