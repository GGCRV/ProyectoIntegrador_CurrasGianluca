package com.portafolioapgc.gc.Interface;

import com.portafolioapgc.gc.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona ();
    
    //Guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findePersona(Long id);

    public Persona findPersona(long l);
}
