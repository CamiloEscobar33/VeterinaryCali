package model;

public class Pet {

    //contans 
	public final static String DOG = "Dog";

	public final static String CAT = "Cat";

	public final static String BIRD = "Bird";

	//attributes
	private String name;

	private Pet typePet;

	private int age;

	private double weight;

	//relation
    private ClinicalRecord clinicalR;

	//builder
    /**
     * [Pet description]
     * @param  name    [description]
     * @param  typePet [description]
     * @param  age     [description]
     * @param  weight  [description]
     * @return         [description]
     */
	public Pet (String name, Pet typePet, int age, double weight) {

		this.name = name;

		this.typepet = typePet;

		this.age = age;

		this.weight = weight;

        clinicalR = new ClinicalRecord();
	}	

	//getters
    /**
     * [getName description]
     * @return [description]
     */
	public String getName (){
        
        return name; }

    /**
     * [getWeight description]
     * @return [description]
     */
    public double getWeight() {
    
        return weight; }

    /**
     * [getTypePet description]
     * @return [description]
     */
    public Pet getTypePet() {
	
		return typePet; }
    
    /**
     * [getAge description]
     * @return [description]
     */
    public int getAge() {
    
        return age; }
    /**
     * [getClinicalR description]
     * @return [description]
     */
    public ClinicalR getClinicalR() {
    
        return clinicalR; }

    //setters
    /**
     * [setName description]
     * @param name [description]
     */
    public void setName (String name) {

        this.name = name; }

    /**
     * [setWeight description]
     * @param weight [description]
     */
    public void setWeight (double weight) {

        this.weight = weight; }    
    
    /**
     * [setTypePet description]
     * @param typePet [description]
     */
    public void setTypePet (Pet typePet) {

        this.typepet = typepet; } 

    /**
     * [setAge description]
     * @param age [description]
     */
    public void setAge (int age ) {

        this.age = age; } 

    /**
     * [setClinicalR description]
     * @param age [description]
     */
    public void setClinicalR (int age ) {

        this.clinicalR = clinicalR; } 

    /**
     * [newClinicalHistory description]
     * @return [description]
     */
    public String newClinicalHistory(){
    	msg = "";
    
    	return msg;
    }


}