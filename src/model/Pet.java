package model;

public class Pet {

	public final static String DOG = "Dog";

	public final static String CAT = "Cat";

	public final static String BIRD = "Bird";

	//attributes
	private String name;

	private Pet typePet;

	private int age;

	private double weight;

	private ClinicalR clinicalR;

	//builder
	public Pet (String name, Pet typePet, int age, double weight, ClinicalR clinicalR) {

		this.name = name;

		this.typepet = typePet;

		this.age = age;

		this.weight = weight;

		this.clinicalR = clinicalR;

	}	

	//getters
	public String getName (){
        
        return name; }

    public double getWeight() {
    
        return weight; }

    public Pet getTypePet() {
	
		return typePet; }
    
    public int getAge() {
    
        return age; }

    public ClinicalR getClinicalR() {
    
        return clinicalR; }

    //setters
    public void setName (String name) {

        this.name = name; }

    public void setWeight (double weight) {

        this.weight = weight; }    
    
    public void setTypePet (Pet typePet) {

        this.typepet = typepet; } 

    public void setAge (int age ) {

        this.age = age; } 

    public void setClinicalR (int age ) {

        this.clinicalR = clinicalR; } 


    public String newClinicalHistory(){
    	msg = "";
    
    	return msg;
    }


}