package org.foobarspam.MedicineClash.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.MedicineClash.Prescription.Prescription;
import org.foobarspam.MedicineClash.fecha.Fecha;
import org.junit.Test;

public class PrescriptionTest {

	@Test
	public void testGetDaysOfSupply() {
		Fecha fecha1 = new Fecha(1,2,2017);
		Prescription test1 = new Prescription(fecha1, 4);
		

		ArrayList<Fecha> expected = new ArrayList<>();
		expected.add(fecha1);
		fecha1.incrementarFecha(1);
		expected.add(fecha1);
		fecha1.incrementarFecha(1);
		expected.add(fecha1);
		fecha1.incrementarFecha(1);
		expected.add(fecha1);
		
		assertEquals(expected, test1.getDaysOfSupply());
	}

}
