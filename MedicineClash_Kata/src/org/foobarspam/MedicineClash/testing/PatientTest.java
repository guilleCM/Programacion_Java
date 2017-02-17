package org.foobarspam.MedicineClash.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import org.foobarspam.MedicineClash.Patient.*;
import org.foobarspam.MedicineClash.Medicine.*;
import org.foobarspam.MedicineClash.Prescription.*;
import org.foobarspam.MedicineClash.fecha.Fecha;

public class PatientTest {
	Prescription prescription, prescription2, prescription3;
	Medicine medicine, medicine2, medicine3;
	Patient sickPatient;
	Fecha fecha1;
	
	@Before
	public void setUp(){
		fecha1 = new Fecha(1,2,2017);
		prescription = new Prescription(fecha1, 3);
		prescription2 = new Prescription(fecha1, 7);
		medicine = new Medicine("Paracetamol");
		medicine2 = new Medicine("Ibuprofeno");
		medicine3 = new Medicine("Mucosan");
		medicine.addPrescription(prescription);
		medicine2.addPrescription(prescription2);
		sickPatient = new Patient();
		sickPatient.addMedicine(medicine);
		sickPatient.addMedicine(medicine2);
	}
	
	@Test
	public void testGetDispenseDate() {
		assertEquals(fecha1, prescription.getDispenseDate());
	}
	
	
	@Test
	public void testGetMedicines() {
		assertTrue(sickPatient.getMedicines().contains(medicine));
		assertFalse(sickPatient.getMedicines().contains(medicine3));
	}
	
	@Test
	public void testClash() {
		ArrayList<String> medicinas = 
		Collection<String> consulta = new ArrayList<>();
		consulta.add("Paracetamol");
		System.out.println(sickPatient.clash(consulta));
	}

}