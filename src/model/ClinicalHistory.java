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
	public ClinicalHistory(String type, String status, double weight, String symptom, String diagnosis) {

		this.weight = weight;

		this.symptom = symptom;	

		this.diagnosis = diagnosis;	

		this.type = type;  

		this.status = status;

		drugsPrecription = new ArrayList<DrugsPrecription>;

	}

	//getters
    public double getdateEntry() {
	
		return dateEntry; }
    
    public double getsymptom() {
    
        return symptom; }

    public double getdiagnosis() {
	
		return diagnosis; }
    
    public double getdrugsPrecription() {
	
		return drugsPrecription; }

    public ArrayList<DrugsPrecription> get drugsPrecription () {

    	return drugsPrecription; }


    //setters
    public void setdateEntry (int dateEntry ) {

        this.dateEntry = dateEntry; }

    public void setSymptom (int symptom ) {

        this.symptom = symptom;  }

    public void setdiagnosis (int diagnosis ) {

        this.diagnosis = diagnosis; }

    public void setdrugsPrecription (int drugsPrecription ) {

        this.drugsPrecription = drugsPrecription; }

    public void sethospitalizations (ArrayList<DrugsPrecription> drugsPrecription) {
    
    	this.hospitalizations = hospitalizations; }
    

    public double costInptient(){

    	double costInptient = 0.0;

    	return costInptient; }

    public double costDrugs(){

    	double costDrug = 0.0;

    	return costDrug; }

}