package org.foobarspam.MedicineClash.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import org.foobarspam.MedicineClash.Patient.*;
import org.foobarspam.MedicineClash.Medicine.*;
import org.foobarspam.MedicineClash.Prescription.*;

public class PatientTest {
	Prescription prescription, prescription2, prescription3;
	Medicine medicine, medicine2, medicine3;
	Patient sickPatient;
	
	@Before
	public void setUp(){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		String day1 = "01/01/2017";
		
		Calendar prueba = Calendar.getInstance();
		prueba.set(2017, 1, 1);
		
		prescription = new Prescription(prueba, 5);
		prescription2 = new Prescription(prueba, 4);
		medicine = new Medicine("Paracetamol");
		medicine2 = new Medicine("Ibuprofeno");
		medicine.addPrescription(prescription);
		medicine2.addPrescription(prescription2);
		sickPatient = new Patient();
		sickPatient.addMedicine(medicine);
		sickPatient.addMedicine(medicine2);
	}
	
	@Test
	public void testGetDispenseDate() {
		assertEquals("", prescription.getDispenseDate().getTime());
	}
	
	@Test
	public void testGetMedicines() {
		assertTrue(sickPatient.getMedicines().contains(medicine));
		assertFalse(sickPatient.getMedicines().contains(medicine3));
	}
	
	

}