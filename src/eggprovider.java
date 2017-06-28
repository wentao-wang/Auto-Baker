
public class eggprovider {
	/**
	* Request for 24 eggs. 
	* 
	* @param key
	*      the key
	* @return int shipmentNumber a unique identifier of the egg shipment
	*/
	int shipmentNumber = OrderEggs();
	
	/**
	* EggIndex would be from 1 to 24. A bug in the library crashes the program with index out of bounds.
	* 
	* @param shipmentNumber
	*	 a unique identifier of the egg shipment
	*@param eggIndex
	*	 index for the egg, from 1-24.
	*@return Boolean true if cracked, false otherwise
	*/
	boolean IsCracked(int shipmentNumber, int eggIndex) {
		return eggs[eggIndex-1];
	}


	private int OrderEggs() {
		eggs = new boolean[24];
		return (int)(Math.random()*Integer.MAX_VALUE);
	}
	
	boolean[] eggs ;
}