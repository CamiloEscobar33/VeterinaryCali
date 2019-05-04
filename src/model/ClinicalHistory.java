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


	//builder
	/**
	 * [ClinicalHistory description]
	 * @param  type      [description]
	 * @param  status    [description]
	 * @param  weight    [description]
	 * @param  symptom   [description]
	 * @param  diagnosis [description]
	 * @return           [description]
	 */
	public ClinicalHistory(String type, String status, double weight, String symptom, String diagnosis) {

		this.weight = weight;

		this.symptom = symptom;	

		this.diagnosis = diagnosis;	

		this.type = type;  

		this.status = status;

		drugsPrecription = new ArrayList<DrugsPrecription>;

	}

	//getters
	/**
	 * @return [description]
	 */
    public double getdateEntry() {
	
		return dateEntry; }

    /**
	 * @return [description]
	 */
    public double getsymptom() {
    
        return symptom; }

    /**
	 * @return [description]
	 */
    public double getdiagnosis() {
	
		return diagnosis; }
    
    /**
	 * @return [description]
	 */
    public double getdrugsPrecription() {
	
		return drugsPrecription; }

	/**
	 * @return [description]
	 */
    public ArrayList<DrugsPrecription> getDrugsPrecription () {

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
    public void setdrugsPrecription (int drugsPrecription ) {

        this.drugsPrecription = drugsPrecription; }

    /**
     * @param drugsPrecription [description]
     */
    public void sethospitalizations (ArrayList<DrugsPrecription> drugsPrecription) {
    
    	this.hospitalizations = hospitalizations; }
    
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