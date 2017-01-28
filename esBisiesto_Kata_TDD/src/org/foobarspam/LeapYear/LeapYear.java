package org.foobarspam.LeapYear;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LeapYear {
	private int year = 0;
	
	public LeapYear() {
		//Constructor por defecto ==> Año Actual
		DateFormat df = new SimpleDateFormat("yyyy");
		Date dateobj = new Date();
		int currentYear = Integer.parseInt(df.format(dateobj));
		this.year = currentYear;
	}
	
	public LeapYear(int year){
		this.year = year;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public boolean isLeapYear(){
		return (getYear() % 4 == 0 && (getYear() % 100 != 0 || getYear() % 400 == 0));
	}
}
