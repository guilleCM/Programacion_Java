package org.foobarspam.MedicineClash.Prescription;

import java.util.Calendar;
import java.util.Date;

public class Prescription {
    
    private Calendar dispenseDate = Calendar.getInstance();
    private int daysSupply = 30;
    
    public Calendar getDispenseDate() {
    	return this.dispenseDate;
    }
    
    public Prescription(Calendar dispenseDate, int daysSupply) {
        this.dispenseDate = dispenseDate;
        this.daysSupply = daysSupply;
    }

}