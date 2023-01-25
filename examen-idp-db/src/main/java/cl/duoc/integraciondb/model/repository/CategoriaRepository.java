package cl.duoc.integraciondb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.integraciondb.model.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    
}
