package cl.duoc.integraciondb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.integraciondb.model.entities.Persona;
import cl.duoc.integraciondb.model.repository.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;
    
    public List<Persona> getAll(){
        return personaRepository.findAll();
    }

    public Persona add(Persona persona){
        return personaRepository.save(persona);
    }
    
    
}
