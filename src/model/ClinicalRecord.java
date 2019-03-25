package model;

import java.utili.ArrayList;


public class ClinicalRecord {

	//attributes
	private String nameOwner

	private int idOwner;

	private String namePet;

	private ArrayList<ClinicalH> clinicalH;

	//builder
	public Pet (String nameOwner, int idOwner, String namePet) {

		this.nameOwner = nameOwner;

		this.idOwner = idOwner;

		this.namePet = namePet;

		clinicalH = new ArrayList<ClinicalH>;
	
	}	

	//getters
	public String getNameOwner (){
        
        return nameOwner; }

    public int getIdOwner() {
    
        return idOwner; }

    public String getNamePet() {
	
		return namePet; }

	public ArrayList<ClinicalH> getClinicalH () {

    	return clinicalH; }
    
    //setters
    public void setNameOwner (String nameOwner) {

        this.nameOwner = nameOwner; }

    public void setIdOwner (int idOwner) {

        this.idOwner = idOwner; }    
    
    public void setNamePet (String namePet) {

        this.namePet = namePet; } 

    public void setclinicalH (ArrayList<ClinicalH> clinicalH) {

    	this.clinicalH = clinicalH; }

}