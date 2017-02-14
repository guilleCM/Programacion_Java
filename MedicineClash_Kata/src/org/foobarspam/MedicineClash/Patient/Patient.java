package org.foobarspam.MedicineClash.Patient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.foobarspam.MedicineClash.Medicine.Medicine;

public class Patient {

	//Propiedades
    private Collection<Medicine> medicines = new ArrayList<Medicine>();

    public void addMedicine(Medicine medicine) {
        this.medicines.add(medicine);
    }

    //getters
    public Collection<Medicine> getMedicines() {
    	return this.medicines;
    }
    
    //metodos
    public Collection<Date> clash(Collection<String> medicineNames) {
        return clash(medicineNames, 90);
    }

    public Collection<Date> clash(Collection<String> medicineNames, int daysBack) {
        // TODO: implement this method
        return null;
    }

}