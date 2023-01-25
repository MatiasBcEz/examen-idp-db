package cl.duoc.integraciondb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.integraciondb.model.entities.Instrumento;


public interface InstrumentoRepository extends JpaRepository<Instrumento, Integer>{
    
}
