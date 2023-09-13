package com.app.test.repository;


import com.app.test.model.Visit;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class VisitRepository extends SimpleJpaRepository<Visit, String> {
    private final EntityManager em;
    public VisitRepository(EntityManager em) {
        super(Visit.class, em);
        this.em = em;
    }
    @Override
    public List<Visit> findAll() {
        return em.createNativeQuery("Select * from \"test\".\"Visit\"", Visit.class).getResultList();
    }
}