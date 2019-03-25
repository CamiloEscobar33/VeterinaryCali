package model;

import java.util.ArrayList;

public class Vet {
    public final static int MAX = 8;

	//attributes
	private String name;

	//relations
	private Miniroom[] miniroom;

	private ArrayList<Owner> owners;

	//builder
    public Vet (String name) {

    	this.name = name;

    	miniroom = new Miniroom [MAX];

    	owners = new ArrayList<Owner>();
  	

    }

    //getters
    public String getname() {
    
    	return name; }

    public ArrayList<Owner> getOwners() {

    	return owners; }

    //setters
    public void setname(String name) {
    
    	this.name = name; }

    public void setOwners(ArrayList<Owner> owners) {

    	this.owners = owners; }


    public String addOwner() {

       String msg = "";

        return msg;
    }

    public String availableRoom() {

        String msg = "";

        return msg;
    }

    public String dataOwnerPetInpatient() {

        String msg = "";

        return msg;
    }

    public String highInpatient() {

        String msg = "";

        return msg;
    }

    public int numberRoomPet() {

        int msg = "";

        return msg;
    }
}