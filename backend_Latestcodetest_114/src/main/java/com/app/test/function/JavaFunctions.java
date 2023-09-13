package com.app.test.function;

import com.app.test.model.Visit;
import com.app.test.model.Pet;
import com.app.test.model.PetOwner;
import com.app.test.model.VisitScheduler;
import com.app.test.model.Veterian;
import com.app.test.model.Appointment;
import com.app.test.model.VaccineScheduler;
import com.app.test.model.Image;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.test.repository.AppointmentRepository;
import com.app.test.repository.PetOwnerRepository;
import com.app.test.repository.VeterianRepository;
import com.app.test.repository.VisitRepository;
import com.app.test.repository.VaccineSchedulerRepository;
import com.app.test.repository.ImageRepository;
import com.app.test.repository.PetRepository;
import com.app.test.repository.VisitSchedulerRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
