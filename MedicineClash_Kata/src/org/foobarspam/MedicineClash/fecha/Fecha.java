package org.foobarspam.MedicineClash.fecha;

public class Fecha {
	
	//Propiedades
	private int day = 1;
	private int month = 1;
	private int year = 1900;
	private int[] currentDate = {1,1,1900};
	
	//Constructores
	public Fecha() {
	}
	public Fecha(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.currentDate = new int[] {day, month, year};
	}
	
	//getters
	public int[] getCurrentDate() {
		return this.currentDate;
	}
	
	//setters
	public void setDate(int day, int month, int year) {
		int[] thirtyOneDaysMonth = {1,3,5,7,8,10,12};
		int[] thirtyDaysMonth = {4, 6, 9, 11};
		if (isIn(month, thirtyOneDaysMonth)) {
			if (day<=31 && day>=1) {
				this.day = day;
				this.month = month;
				this.year = year;
				this.currentDate = new int[] {day, month, year};
			} 
		}
		if (isIn(month, thirtyDaysMonth)) {
			if (day<=30 && day>=1) {
				this.day = day;
				this.month = month;
				this.year = year;
				this.currentDate = new int[] {day, month, year};
			}
		}
		if (month == 2) {
			if (day<=28 && day>=1) {
				this.day = day;
				this.month = month;
				this.year = year;
				this.currentDate = new int[] {day, month, year};
			}
		}
	}
	
	
	//metodos
	public static boolean isIn(int month, int[] months) {
		for (int i = 0; i<months.length; i++) {
			if (months[i] == month) {
				return true;
			}
		}
		return false;
	}
	
	private int daysOfMonth(int month) {
		int[] daysPerMonth = {
				31, //Enero
			    28, //Febrero
			    31, //Marzo
			    30, //Abril
			    31, //Mayo
			    30, //Junio
			    31, //Julio
			    31, //Agosto
			    30, //Septiembre
			    31, //Octubre
			    30, //Noviembre
			    31  //Diciembre
		};
		return daysPerMonth[month];
	}
	
	public void incrementarFecha(int days) {
	/*
	 * recibe un entero que representa un número de días 
	 * e incrementa la fecha en dicha cantidad de dias.
	 */
		int[] date = getCurrentDate();
		int currentDay = date[0];
		int month = date[1];
		int maxDaysMonth = daysOfMonth(month);
		while (days+currentDay>maxDaysMonth) {
			month++;
			days = days - currentDay;
		}
	}

}
