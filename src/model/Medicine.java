package model;

public class Medicine {

	//attributes
	private String name;

	private double dose;

	private double costDose;

	private int frequencyOfDose;

    //builder
	public Medicines (String name, double dose, double costDose, int frequencyOfDose) {

		this.name = name;

		this.dose = dose;

		this.costDose = costDose;

		this.frequencyOfDose = frequencyOfDose;

	}	

	//getters
	public String getName (){
        
        return name; }

    public double getDose() {
    
        return dose; }

    public double getCostDose() {
	
		return costDose; }
    
    public int getFrequencyOfDose() {
    
        return frequencyOfDose; }

    //setters
    public void setName (String name) {

        this.name = name; }

    public void setDose (double dose) {

        this.dose = dose; }    
    
    public void setCostDose (double costDose) {

        this.costDose = costDose; } 

    public void setFrequencyOfDose (int frequencyOfDose) {

        this.frequencyOfDose = frequencyOfDose; } 
}