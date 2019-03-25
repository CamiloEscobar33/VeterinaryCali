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
    public void setName (String name) {

        this.name = name; }

    public void setId (int id) {

        this.id = id; }    
    
    public void setDiretion (String diretion) {

        this.diretion = diretion; } 

    public void setPhone (int phone ) {

        this.phone = phone; } 

    public void setPets (ArrayList<Pet> pets) {

        this.pets = pets; }

    public String addPet(){

        int msg = "";

        return msg; 

    }
}