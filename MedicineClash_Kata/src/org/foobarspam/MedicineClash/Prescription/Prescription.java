package org.foobarspam.MedicineClash.Prescription;

import org.foobarspam.MedicineClash.fecha.Fecha;

public class Prescription {
    //propiedades
    private Fecha dispenseDate = new Fecha();
    private int daysSupply = 30;
    private int[] lastDaySupply = Fecha.fechaLocal();

    //constructores
    public Prescription(Fecha dispenseDate, int daysSupply) {
        this.dispenseDate = dispenseDate;
        this.daysSupply = daysSupply;
        this.lastDaySupply = setLastDaySupply(daysSupply);
    }

    //getters
    public Fecha getDispenseDate() {
    	return this.dispenseDate;
    }
    
    public int[] getLastDaySupply() {
    	return this.lastDaySupply;
    }
    
    //metodos
    private int[] setLastDaySupply(int daysSupply) {
    	Fecha supplyDate = getDispenseDate();
    	supplyDate.incrementarFecha(this.daysSupply);
    	return  supplyDate.getCurrentDate();
    }
}