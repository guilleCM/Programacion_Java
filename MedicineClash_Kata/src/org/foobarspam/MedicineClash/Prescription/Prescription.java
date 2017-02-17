package org.foobarspam.MedicineClash.Prescription;

import java.util.ArrayList;

import org.foobarspam.MedicineClash.fecha.Fecha;

public class Prescription {
    //propiedades
    private Fecha dispenseDate = new Fecha();//por defecto {1,1,1900}
    private int daysSupply = 30;
    private ArrayList<Fecha> daysOfSupply = new ArrayList<>();

    //constructores
    public Prescription(Fecha dispenseDate, int daysSupply) {
        this.dispenseDate = dispenseDate;
        this.daysSupply = daysSupply;
        expectedDaysOfSupply();
    }

    //getters
    public Fecha getDispenseDate() {
    	return this.dispenseDate;
    }
    
    public ArrayList<Fecha> getDaysOfSupply() {
    	return this.daysOfSupply;
    }
    
    public int getDaysSupply() {
    	return this.daysSupply;
    }
    
    //metodos    
    private void expectedDaysOfSupply() {
    	int remainDays = getDaysSupply();
    	Fecha currentDate = getDispenseDate();
    	while (remainDays != 0) {
    		this.daysOfSupply.add(currentDate);
    		currentDate.incrementarFecha(1);
    		remainDays--;
    	}
    }
    
}