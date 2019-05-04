package Model;

public class MiniRoom {

    //attributes
	private boolean pet;

	//Relations
    private Pet petMiniRoom;

    //builder
    
    /**
     * [MiniRoom description]
     * @param  pet [description]
     * @return     [description]
     */
    public MiniRoom(boolean pet) {

    	this.pet = pet;

        petMiniRoom = new Pet();
    }

    //getters
    /**
     * [getPet description]
     * @return [description]
     */
    public boolean getPet() {
	
		return pet; }
       
    //setters
    /**
     * [setDay description]
     * @param pet [description]
     */
    public void setDay (boolean pet) {

        this.pet = pet; 
    }

    
}