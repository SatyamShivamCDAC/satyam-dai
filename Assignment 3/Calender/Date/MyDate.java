package com.cdac.util;

public class MyDate {

    private int dd;
    private int month;
    private int year;

    public MyDate(int dd, int month, int year) {
        this.dd = dd;
        this.month = month;
        this.year = year;
    }
    
    public String toString(){
    	return String.format("%d/%d/%d",dd,month,year);
    }
    
    
}
