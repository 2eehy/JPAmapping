package org.example.jpamapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class BurgerkingRepository {

    @PersistenceContext
    private EntityManager manager;


    public void save(Order order) {
        manager.persist(order);

    }
}
