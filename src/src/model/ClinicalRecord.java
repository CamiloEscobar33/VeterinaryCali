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
	 * [Pet description]
	 * @param  nameOwner [description]
	 * @param  idOwner   [description]
	 * @param  namePet   [description]
	 * @return           [description]
	 */
	public Pet (String nameOwner, int idOwner, String namePet) {

		this.nameOwner = nameOwner;

		this.idOwner = idOwner;

		this.namePet = namePet;

		clinicalH = new ArrayList<ClinicalH>();
	
	}	

	//getters
	/**
	 * [getNameOwner description]
	 * @return [description]
	 */
	public String getNameOwner (){
        
        return nameOwner; }

    /**
     * [getIdOwner description]
     * @return [description]
     */
    public int getIdOwner() {
    
        return idOwner; }

    /**
     * [getNamePet description]
     * @return [description]
     */
    public String getNamePet() {
	
		return namePet; }

	/**
	 * [getClinicalH description]
	 * @return [description]
	 */
	public ArrayList<ClinicalH> getClinicalH () {

    	return clinicalH; }
    
    //setters
    /**
     * [setNameOwner description]
     * @param nameOwner [description]
     */
    public void setNameOwner (String nameOwner) {

        this.nameOwner = nameOwner; }
    
    /**
     * [setIdOwner description]
     * @param idOwner [description]
     */
    public void setIdOwner (int idOwner) {

        this.idOwner = idOwner; }    
    
    /**
     * [setNamePet description]
     * @param namePet [description]
     */
    public void setNamePet (String namePet) {

        this.namePet = namePet; } 
    /**
     * [setclinicalH description]
     * @param clinicalH [description]
     */
    public void setclinicalH (ArrayList<ClinicalH> clinicalH) {

    	this.clinicalH = clinicalH; }

}