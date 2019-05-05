package Model;

public class Date {

    //attributes
	private int day;

	private int month;
    
    private int year;

    //builder
    /**
     * [Date description]
     * @param  day   [description]
     * @param  month [description]
     * @param  year  [description]
     * @return       [description]
     */
    public Date(int day, int month, int year) {

    	this.day = day;

    	this.month = month;

    	this.year = year;
    }

    //getters
    /**
     * [getday description]
     * @return [description]
     */
    public double getday() {
	
		return day; }
    
    /**
     * [getMonth description]
     * @return [description]
     */
    public double getMonth() {
    
        return month; }

    /**
     * [getyear description]
     * @return [description]
     */
    public double getyear() {
	
		return year; }
    
    //setters
    /**
     * [setDay description]
     * @param day [description]
     */
    public void setDay (int day ) {

        this.day = day; 
    }

    /**
     * [setMonth description]
     * @param month [description]
     */
    public void setMonth (int month ) {

        this.month = month;

    }

    /**
     * [setYear description]
     * @param year [description]
     */
    public void setYear (int year ) {

        this.year = year;
    }
}