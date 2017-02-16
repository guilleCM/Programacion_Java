package org.foobarspam.MedicineClash.Patient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.foobarspam.MedicineClash.Medicine.Medicine;
import org.foobarspam.MedicineClash.fecha.Fecha;

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
    public Collection<Fecha> clash(Collection<String> medicineNames) {
        return clash(medicineNames, 90);
    }

    public Collection<Fecha> clash(Collection<String> medicineNames, int daysBack) {
        //takes as arguments a list of medicine names, and how
    	//many days before today to consider, (defaults to the 
    	//last 90 days). It should return a collection of days 
    	//on which all the medicines were being taken during this time.
    	Collection<Fecha> medicinesTaken = new ArrayList<>();
    	Fecha fecha1 = new Fecha(1,1,1900);
    	medicinesTaken.add(fecha1);
    	int[] fecha = Fecha.fechaLocal();
    	for (String medicine : medicineNames) {
    	}
        return medicinesTaken;
    }

}