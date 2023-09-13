package com.app.test.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.test.model.Visit;
import com.app.test.model.Pet;
import com.app.test.model.PetOwner;
import com.app.test.model.VisitScheduler;
import com.app.test.model.Veterian;
import com.app.test.model.Appointment;
import com.app.test.model.VaccineScheduler;
import com.app.test.model.Image;

@Entity(name = "AppointmentVetpetappointment")
@Table(schema = "\"test\"", name = "\"AppointmentVetpetappointment\"")
@Data
public class AppointmentVetpetappointment{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"Appointment_Id\"")
	private Integer appointment_Id;

    
    @Column(name = "\"Pet_ownerId\"")
    private Integer pet_ownerId;
 
}