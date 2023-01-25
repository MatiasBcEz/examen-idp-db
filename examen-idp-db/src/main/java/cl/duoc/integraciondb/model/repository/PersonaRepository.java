package cl.duoc.integraciondb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.integraciondb.model.entities.Persona;


public interface PersonaRepository extends JpaRepository<Persona, Integer>{
    
}
