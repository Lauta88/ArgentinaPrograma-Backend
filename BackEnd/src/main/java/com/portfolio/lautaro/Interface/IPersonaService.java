
package com.portfolio.lautaro.Interface;

import com.portfolio.lautaro.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer una persona 
    public List<Persona > getPersona();
    
    //guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto por id
    public void deletePersona(Long id);
            
    //buscar persona por id
    public  Persona findPersona(Long id);       
}
