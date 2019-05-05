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

    private double height;

    private int id;

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
	public Pet (String name, Pet typePet, int age, double weight, int id, double height) {

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

    /**
     * [getId description]
     * @return [description]
     */
    public int getId() {
    
        return id; }

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
     * [setId description]
     * @param id [description]
     */
    public void setId (int id) {

        this.id = id; }    

    //Metodos funcionales.
    /**
     * [newClinicalHistory description]
     * @return [description]
     */
    public String newClinicalHistory(){
    	msg = "";
    
    	return msg;
    }

    /**
     *Description This method allows to calculate the body mass index for a pet.
     *pre: The pet was created before and its attributes height and weight are not null neither height must be zero.
     *post: The BMI is calculated.
     *@return The pet body mass index. Returns -1 if the height is zero  due to the division on zero does not exist.
     */
    public double imcPet(){
        double imc = 0.0;

        imc = weight / (height * height);

        return imc;
    }



}