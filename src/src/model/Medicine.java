package model;

public class Medicine {

	//attributes
	private String name;

	private double dose;

	private double costDose;

	private int frequencyOfDose;

    //builder
    /**
     * [Medicines description]
     * @param  name            [description]
     * @param  dose            [description]
     * @param  costDose        [description]
     * @param  frequencyOfDose [description]
     * @return                 [description]
     */
	public Medicines (String name, double dose, double costDose, int frequencyOfDose) {

		this.name = name;

		this.dose = dose;

		this.costDose = costDose;

		this.frequencyOfDose = frequencyOfDose;

	}	

	//getters
    /**
     * [getName description]
     * @return [description]
     */
	public String getName (){
        
        return name; }

    /**
     * [getDose description]
     * @return [description]
     */
    public double getDose() {
    
        return dose; }

    /**
     * [getCostDose description]
     * @return [description]
     */
    public double getCostDose() {
	
		return costDose; }
    
    /**
     * [getFrequencyOfDose description]
     * @return [description]
     */
    public int getFrequencyOfDose() {
    
        return frequencyOfDose; }

    //setters
    /**
     * [setName description]
     * @param name [description]
     */
    public void setName (String name) {

        this.name = name; }

    /**
     * [setDose description]
     * @param dose [description]
     */
    public void setDose (double dose) {

        this.dose = dose; }    
    
    /**
     * [setCostDose description]
     * @param costDose [description]
     */
    public void setCostDose (double costDose) {

        this.costDose = costDose; } 

    /**
     * [setFrequencyOfDose description]
     * @param frequencyOfDose [description]
     */
    public void setFrequencyOfDose (int frequencyOfDose) {

        this.frequencyOfDose = frequencyOfDose; } 
}