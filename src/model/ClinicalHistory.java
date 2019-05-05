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
	 * @return  - the object create.
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

    /**Allows to obtain 
	 * @return double - the
	 */
    public String getsymptom() {
    
        return symptom; }

    /**
	 * @return [description]
	 */
    public String getdiagnosis() {
	
		return diagnosis; }

	/**
	 * @return [description]
	 */
    public String getStatus() {
	
		return status; }

    
    /**
	 * @return [description]
	 */
    public Date getDateExit() {
	
		return dateExit; }

	/**
	 * @return [description]
	 */
    public ArrayList<Medicine> getDrugsPrecription () {

    	return drugsPrecription; }


    //setters
    /**
     * @param dateEntry [description]
     */
    public void setdateEntry (int dateEntry ) {

        this.dateEntry = dateEntry; }
    /**
     * @param symptom [description]
     */
    public void setSymptom (int symptom ) {

        this.symptom = symptom;  }

    /**
     * @param diagnosis [description]
     */
    public void setdiagnosis (int diagnosis ) {

        this.diagnosis = diagnosis; }
    

    /**
     * @param drugsPrecription [description]
     */
    public void setDrugsPrecription (ArrayList<Medicine> drugsPrecription) {
    
    	this.drugsPrecription = drugsPrecription; }
    
    /**
     * @return [description]
     */
    public double costInptient(){

    	double costInptient = 0.0;

    	return costInptient; }

    /**
     * @return [description]
     */
    public double costDrugs(){

    	double costDrug = 0.0;

    	return costDrug; }

}