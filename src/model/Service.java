package model;

public class Service {

	//constant 
	public final static SHOWER_PET_VETERINARY String = "Shower pet veterinary";

	public final static SHOWER_PET_DOMILICE String = "Shower pet domilice";

	public final static NAIL_CUTTING String = "Nail cutting";

	public final static DENTAL_PROPHYLAXIS String = "Dental phophylaxis";

	public final static SPV double = 20000.0;

	public final static SPD double = 30000.0;

	public final static NC double = 12000.0;

	public final static DP double = 45000.0;

	//attributes
	private String typeService;

	private double cost;

	private int idPet;

	private int idOwner; 

	//Relation 
	private Date dateSevice;

	//builder
	
	/**
	 * @param  typeService [description]
	 * @param  cost        [description]
	 * @param  idPet       [description]
	 * @param  idOwner     [description]
	 * @param  day         [description]
	 * @param  month       [description]
	 * @param  year        [description]
	 * @return             [description]
	 */
	public Service (String typeService, double cost, int idPet, int idOwner, int day, int month, int year){

		this.typeService = typeService;

		this.cost = cost;

		this.idPet = idPet;

		this.idOwner = idOwner;

		dateSevice = new Date(day,month,year);
	
	}

	//getters
	/**Allows to obtain the type of service that the patient has.
	 * @return String-returns the type of service requested.
	 */
	public String getTypeService(){

		return typeService;	}

	/**Allows to obtain the cost.
	 * @return double-returns the cost of service.
	 */
	public double getCost(){

		return cost; }

	/**Allows to obtain the id of pet.
	 * @return int-returns the id of pet.
	 */
	public int getIdPet(){

		return idPet; }

	/**Allows to obtain the id of Owner of pet.
	 * @return int-returns the id of owner.
	 */
	public int getIdOwner(){

		return idOwner; }

	/**Allows to obtain the arryaList of pets.
	 * @return ArrayList<Pet>- returns the arrayList of pets.
	 */
	public ArrayList<Pet> getPets () {

        return pets; }

    //setters
    
    /**Allows to change the type of service. 
     * @param typeService - enter the type of service you want to change.
     */
    public void setTypeService (String typeService) {

        this.typeService = typeService; } 

    /**Allows to change the cost.
     * @param cost - enter the costo you want to change.
     */
    public void setCost (double cost) {

        this.cost = cost; }

    /**Allows to change the id of the Owner.
     * @param idOwner - enter the id of Owner you want to change.
     */
    public void setIdOwner (int idOwner) {

        this.idOwner = idOwner; } 

    /**Allows to change the id of the pet.
     * @param idPet - enter the id of pet you want to change.
     */
    public void setIdPet (int idPet) {

        this.idPet = idPet; }  

    /**Allows to change the List of the pets.
     * @param pets - enter the list you want to change.
     */
    public void setPets (ArrayList<Pet> pets) {

        this.pets = pets; }


}