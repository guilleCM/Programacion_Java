package org.foobarspam.MedicineClash.Medicine;
import java.util.ArrayList;
import java.util.Collection;

import org.foobarspam.MedicineClash.Prescription.Prescription;

public class Medicine {
    //Propiedades de clase
    private Collection<Prescription> prescriptions = new ArrayList<Prescription>();
    
    private final String name;

    //Constructores
    public Medicine(String name) {
        this.name = name;
    }
    
    //setters
    
    //getters
    public String getName() {
    	return this.name;
    }
    
    //Metodos
    public void addPrescription(Prescription prescription) {
        this.prescriptions.add(prescription);
    }
}