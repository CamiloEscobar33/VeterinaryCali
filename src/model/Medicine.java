package model;

public class Medicine {

	//attributes
	private String name;

	private double dose;

	private double costDose;

	private int frequencyOfDose;

    //builder
    /**
     * the builder allows create a medicine of a pet.
     * @param  name - enter the name of the medicine.
     * @param  dose - enter the dose of medicine.
     * @param  costDose - enter the cost of doses
     * @param  frequencyOfDose - enter the frequency of the dose of the medicine.
     * @return - the objectos create.
     */
	public Medicines (String name, double dose, double costDose, int frequencyOfDose) {

		this.name = name;

		this.dose = dose;

		this.costDose = costDose;

		this.frequencyOfDose = frequencyOfDose;

	}	

	//getters
    /**
     * Allows to obtain the name of medicine.
     * @return String - the name of medicine. 
     */
	public String getName (){
        
        return name; }

    /**
     * Allows to obtain the dose of medicine.
     * @return double -  the dose of medicine.
     */
    public double getDose() {
    
        return dose; }

    /**
     * Allows to obtain the cost of dose of the medicine.
     * @return double - the cost of dose of the medicine.
     */
    public double getCostDose() {
	
		return costDose; }
    
    /**
     * Allows to obtain the frequency of dose of the medicine.
     * @return int - the frequency of the doses of medicine.
     */
    public int getFrequencyOfDose() {
    
        return frequencyOfDose; }

    //setters
    /**
     * Allows to change the name of the medicine.
     * @param name - enter the nombre you want to change.
     */
    public void setName (String name) {

        this.name = name; }

    /**
     * Allows to change the dose of the medicine.
     * @param dose - enter the dose you want to change.
     */
    public void setDose (double dose) {

        this.dose = dose; }    
    
    /**
     * Allows to change the cost the dose of the medicine.
     * @param costDose - enter the cost of dose you want to change.
     */
    public void setCostDose (double costDose) {

        this.costDose = costDose; } 

    /**
     * Allows to change the frequency of dose of the medicine.
     * @param frequencyOfDose - enter the frequency of dose you want to change.
     */
    public void setFrequencyOfDose (int frequencyOfDose) {

        this.frequencyOfDose = frequencyOfDose; } 
}