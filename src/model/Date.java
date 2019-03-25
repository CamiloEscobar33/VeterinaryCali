package Model;

public class Date {

    //attributes
	private int day;

	private int month;
    
    private int year;

    //builder
    public Date(int day, int month, int year) {

    	this.day = day;

    	this.month = month;

    	this.year = year;
    }

    //getters
    public double getday() {
	
		return day; }
    
    public double getMonth() {
    
        return month; }

    public double getyear() {
	
		return year; }
    
    //setters
    public void setDay (int day ) {

        this.day = day; 
    }

    public void setMonth (int month ) {

        this.month = month;

    }

     public void setYear (int year ) {

        this.year = year;
    }
}