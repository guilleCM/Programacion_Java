package org.foobarspam.MedicineClash.Medicine;
import java.util.ArrayList;
import java.util.Collection;

import org.foobarspam.MedicineClash.Prescription.Prescription;

public class Medicine {
    
    private Collection<Prescription> prescriptions = new ArrayList<Prescription>();
    
    private final String name;

    public Medicine(String name) {
        this.name = name;
    }
    public void addPrescription(Prescription prescription) {
        this.prescriptions.add(prescription);
    }
}