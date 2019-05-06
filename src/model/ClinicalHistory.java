package model;

import java.utili.ArrayList;

public class ClinicalHistory {

	public final static String OPEN = "Open";

	public final static String CLOSED = "Closed";


	//attributes
	private String type;
	private String status;
	private String symptom;
	private String diagnosis;
	private double weight;
	
	
	//relations 
	private ArrayList<DrugsPrecription> drugsPrecription;

	private Date dateEntry;

	private Date dateExit;

	//builder
	/**
	 * the builder allows creat a arrayList of medicine
	 * @param  type - 
	 * @param  status - enter if is closed or open the Clinical history.
	 * @param  weight  - enter the weight of pet. 
	 * @param  symptom - enter the symptom have the pet.
	 * @param  diagnosis - enter the diagnosis of pet have.
	 * @return  - the object creats.
	 */
	public ClinicalHistory(String type, String status, double weight, String symptom, String diagnosis) {

		this.weight = weight;

		this.symptom = symptom;	

		this.diagnosis = diagnosis;	

		this.type = type;  

		this.status = status;

		drugsPrecription = new ArrayList<DrugsPrecription>;

		dateEntry = new Date(day, month, year);

		dateExit = new Date(day, month, year);

	}

	//getters
	/**Allows to obtain the date entry the pet.
	 * @return double - the date entry of the pet.  
	 */
    public Date getdateEntry() {
	
		return dateEntry; }

    /**Allows to obtain the symptom of pet.
	 * @return String - the sympton.
	 */
    public String getsymptom() {
    
        return symptom; }

    /**Allows to obtain the diagnisis of pet.
	 * @return String - the diagnosis of the pet.
	 */
    public String getdiagnosis() {
	
		return diagnosis; }

	/**Allows to obtain the status of the pet.
	 * @return String - the status of the pet.
	 */
    public String getStatus() {
	
		return status; }

    
    /**Allows to obtain the date of exit of pet.
	 * @return Date - the Date that pet exit of the veterinary. 
	 */
    public Date getDateExit() {
	
		return dateExit; }

	/**Allows to obtain the arrayList of medicine of the pets.
	 * @return ArrayList<Medicine> - the arrayList of medicine of the pets.
	 */
    public ArrayList<Medicine> getDrugsPrecription () {

    	return drugsPrecription; }


    //setters
    /**Allows to change the date Entry to veterinary.
     * @param dateEntry - enter the date you want to change.
     */
    public void setdateEntry (int dateEntry ) {

        this.dateEntry = dateEntry; }

    /**Allows to change the symptom of the pet.
     * @param symptom - enter the symptom you want to change.
     */
    public void setSymptom (int symptom ) {

        this.symptom = symptom;  }

    /**Allows to change the diagnosis of the pet.
     * @param diagnosis - enter the diagnosis you want to change.
     */
    public void setdiagnosis (int diagnosis ) {

        this.diagnosis = diagnosis; }
    

    /**Allows to change the arrayList of medicine.
     * @param drugsPrecription - enter the arrayList of medicine you want to change.
     */
    public void setDrugsPrecription (ArrayList<Medicine> drugsPrecription) {
    
    	this.drugsPrecription = drugsPrecription; }
    
    /**Allows to obtain the cost of inpatient of a pet inpatient.
     * @return double -  the cost of the inpatient the pet.
     */
    public double costInpatient(){

    	double costInptient = 0.0;

    	return costInptient; }

    /**Allows to obtain the cost of the drugs.
     * @return double - the cost of the drugs.
     */
    public double costDrugs(){

    	double costDrug = 0.0;

    	return costDrug; }

}