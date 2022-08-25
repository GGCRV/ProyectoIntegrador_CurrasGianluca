package com.portafolioapgc.gc.Service;

import com.portafolioapgc.gc.Entity.Persona;
import com.portafolioapgc.gc.Interface.IPersonaService;
import com.portafolioapgc.gc.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findePersona(Long id) {
       Persona persona = ipersonaRepository.findById(id).orElse(null);
       return persona;
    }
    
}
