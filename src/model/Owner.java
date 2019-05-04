package model;

import java.util.ArrayList;

public class Owner {

    //attributes
	private String name;

	private int id;

	private String diretion;

	private int phone;

    //relations 
    private ArrayList<Pet> pets;


    //builder
    /**
     * [Owner description]
     * @param  name     [description]
     * @param  id       [description]
     * @param  diretion [description]
     * @param  phone    [description]
     * @return          [description]
     */
	public Owner (String name, int id, String diretion, int phone) {

		this.name = name;

		this.id = id;

		this.diretion = diretion;

		this.phone = phone;

        pets = new ArrayList<Pet>();
	}	

	//getters
	public String getName (){
        
        return name; }

    public int getId() {
    
        return id; }

    public String getDiretion() {
	
		return diretion; }
    
    public int getPhone() {
    
        return phone; }

    public ArrayList<Pet> getPets () {

        return pets; }


    //setters
    /**
     * [setName description]
     * @param name [description]
     */
    public void setName (String name) {

        this.name = name; }

    /**
     * [setId description]
     * @param id [description]
     */
    public void setId (int id) {

        this.id = id; }    
    
    /**
     * [setDiretion description]
     * @param diretion [description]
     */
    public void setDiretion (String diretion) {

        this.diretion = diretion; } 
    /**
     * [setPhone description]
     * @param phone [description]
     */
    public void setPhone (int phone ) {

        this.phone = phone; } 
    /**
     * [setPets description]
     * @param pets [description]
     */
    public void setPets (ArrayList<Pet> pets) {

        this.pets = pets; }

    /**
     * [addPet description]
     * @return [description]
     */
    public String addPet(){

        int msg = "";

        return msg; 

    }
}