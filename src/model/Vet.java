package model;

import java.util.ArrayList;

public class Vet {
    
    public final static int MAX = 8;

	//attributes
	private String name;

	//relations
	private Miniroom[] miniroom;

	private ArrayList<Owner> owners;

    private ArrayList<Service> serviceVet;

	//builder
    /**
     * [Vet description]
     * @param  name [description]
     * @return      [description]
     */
    public Vet (String name) {

    	this.name = name;

    	miniroom = new Miniroom [MAX];

    	owners = new ArrayList<Owner>();
  	
        serviceVet = new ArrayList<Service> serviceVet;

    }

    //getters
    /**
     * [getname description]
     * @return [description]
     */
    public String getname() {
    
    	return name; }

    /**
     * [getOwners description]
     * @return [description]
     */
    public ArrayList<Owner> getOwners() {

    	return owners; }

    //setters
    /**
     * [setname description]
     * @param name [description]
     */
    public void setname(String name) {
    
    	this.name = name; }

    /**
     * [setOwners description]
     * @param owners [description]
     */
    public void setOwners(ArrayList<Owner> owners) {

    	this.owners = owners; }

    /**
     * [addOwner description]
     * @return [description]
     */
    public String addOwner() {

       String msg = "";

        return msg;
    }

    /**
     * [availableRoom description]
     * @return [description]
     */
    public String availableRoom() {

        String msg = "";

        return msg;
    }

    /**
     * [dataOwnerPetInpatient description]
     * @return [description]
     */
    public String dataOwnerPetInpatient() {

        String msg = "";

        return msg;
    }

    /**
     * [highInpatient description]
     * @return [description]
     */
    public String highInpatient() {

        String msg = "";

        return msg;
    }

    /**
     * [numberRoomPet description]
     * @return [description]
     */
    public int numberRoomPet() {

        int msg = "";

        return msg;
    }

    /**
     *Description This method allows to update the basic data of a veterinary client, these data include, address and phone number.
     *pre: The client was created before.
     *post: The address and /or phone number of the client is updated.
     *@param The new address of the client. This param could be empty.
     *@param The new phone number of the client. This param could be empty.
     */
    public void updateData(String direction, int phone){

        

    }
    

}