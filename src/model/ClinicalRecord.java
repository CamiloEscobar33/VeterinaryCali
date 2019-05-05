package model;

import java.utili.ArrayList;


public class ClinicalRecord {

	//attributes
	private String nameOwner

	private int idOwner;

	private String namePet;

	//relation
	private ArrayList<ClinicalH> clinicalH;

	//builder
	/**
	 * the builder allows create a arrayList of Clinical History.
	 * @param  nameOwner - enter the name of Owner of pet.
	 * @param  idOwner  - enter the id of owner.
	 * @param  namePet  - enter the name of pet or pets.
	 * @return - the objects creats.
	 */
	public Pet (String nameOwner, int idOwner, String namePet) {

		this.nameOwner = nameOwner;

		this.idOwner = idOwner;

		this.namePet = namePet;

		clinicalH = new ArrayList<ClinicalH>();
	
	}	

	//getters
	/**
	 * Allows to obtain the name of owner.
	 * @return String - the name of owner of the pet.
	 */
	public String getNameOwner (){
        
        return nameOwner; }

    /**
     * Allows to obtain the id od owner.
     * @return int - the id of owner.
     */
    public int getIdOwner() {
    
        return idOwner; }

    /**
     * Allows to obtain the name of pet of the owner.
     * @return String - the name of pet.
     */
    public String getNamePet() {
	
		return namePet; }

	/**
	 * Allows to obtain the clinical History of pet.
	 * @return ArrtList<CLinicalH> - a ArryList of clinical history.
	 */
	public ArrayList<ClinicalH> getClinicalH () {

    	return clinicalH; }
    
    //setters
    /**
     * Allows to change the name of owner.
     * @param nameOwner - enter the name of owner you want to change.
     */
    public void setNameOwner (String nameOwner) {

        this.nameOwner = nameOwner; }
    
    /**
     * Allows to change the id of the owner.
     * @param idOwner - enter the id you want to change.
     */
    public void setIdOwner (int idOwner) {

        this.idOwner = idOwner; }    
    
    /**
     * Allows to change the name of pet.
     * @param namePet - enter the name of the pet you want to change.
     */
    public void setNamePet (String namePet) {

        this.namePet = namePet; } 
    /**
     * Allows to change the arrayList of clinical History.
     * @param clinicalH -  enter the arrayLsit of clinical history you want to change.
     */
    public void setclinicalH (ArrayList<ClinicalH> clinicalH) {

    	this.clinicalH = clinicalH; }

}