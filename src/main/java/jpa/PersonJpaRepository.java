package jpa;


import jdbc.Person;
import jpa.PersonJpa;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonJpaRepository {

    //Conect to the database
    @PersistenceContext
    EntityManager entityManager;

    public PersonJpa findById(int id) {
        return entityManager.find(PersonJpa.class, id);
    }

    public PersonJpa insert(PersonJpa personJpa){
        return entityManager.merge(personJpa);
    }

    public PersonJpa update(PersonJpa personJpa){
        return entityManager.merge(personJpa);
    }

    public void deleteById(int id){
        PersonJpa personJpa = findById(id);
        entityManager.remove(personJpa);
    }

    public List<PersonJpa> findAll(){
        TypedQuery<PersonJpa> namedQuery = entityManager.createNamedQuery("find_all", PersonJpa.class);
        return namedQuery.getResultList();
    }
}
