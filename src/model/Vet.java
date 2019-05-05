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
     * the builder allows create mini rooms, owners, services.
     * @param  name - the name of veterinary.
     * @return  the objects creates.
     */
    public Vet (String name) {

    	this.name = name;

    	miniroom = new Miniroom [MAX];

    	owners = new ArrayList<Owner>();
  	
        serviceVet = new ArrayList<Service> serviceVet;

    }

    //getters
    /**
     * Allows to obtain the name of veterinary.
     * @return the name of veterinary.
     */
    public String getname() {
    
    	return name; }

    /**
     * Allows to obtain the owners of the pets.
     * @return the object owner.
     */
    public ArrayList<Owner> getOwners() {

    	return owners; }

    //setters
    /**
     * Allows to change the name of veterinary aunque se que este set no es necesario jaja(El sueño).
     * @param name - enter the name you want to change.
     */
    public void setname(String name) {
    
    	this.name = name; }

    /**
     * Allows to change the Owner.
     * @param owners - enter the Owner you want to change.
     */
    public void setOwners(ArrayList<Owner> owners) {

    	this.owners = owners; }

    /**
     * Allows add a Owner to arryList of Owners
     * @param  name - the name of owner.
     * @param  id  - the id of owner.
     * @param  direction - the direction of owner.
     * @param  phone  - the phone of owner.
     * @return String - The message that 
     */
    public String addOwner(String name, int id, String direction, int phone) {

       String msg = ""; boolean oe = true;

       for(int i = 0; i < owners.size() && oe = true; i++){
       	if(owners.get(i) == null){
       		add.(new Owner(name, id, direction, phone));
       		msg = "Se ha agregado correctamente el dueño";
       		oe = false;
       	}
       }

        return msg;
    }

    /**
     * Allows look that rooms are free.
     * @return String - the numbers the rooms free.
     */
    public String availableRoom() {

        String msg = ""; 

        for(int i = 0; i < miniroom.length; i++){
        	if(miniroom[i] == null){
        		msg = "los cuartos libres son " + miniroom[i];
        	} else {
        		msg = "no hay mini cuartos libres."
        	}
        }

        return msg;
    }

    /**
     * Allows to obtain datas of Owner of pet.
     * @return String - Data the Owner.
     */
    public String dataOwnerPetInpatient() {

        String msg = "";

        return msg;
    }

    /**
     * Allows sign out to a pacient.
     * @return String - sign out of the inpatient.
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
     *@param direction - the new address of the client. This param could be empty.
     *@param phone - the new phone number of the client. This param could be empty.
     */
    public void updateData(String direction, int phone){

        

    }
    

}