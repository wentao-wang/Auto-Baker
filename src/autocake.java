
public class autocake {
	/**
	* Opens a new 10-gallon milk jug.
	*
	* @return long time elapsed since 1970 from when jug was opened 
	*/
	private long openTime = getTime();
	long openMilkJug(){
		milklevel = 10;
		return System.currentTimeMillis()-openTime;
	}
	
	/**
	* Get time elapsed since 1970.
	*
	* @return long time elapsed since 1970 
	*/
	long getTime(){
		return System.currentTimeMillis();
	}
	/**
	* Loads an egg into the egg cracker.
	*@param shipmentID
	*a unique identifier of the egg shipment
	*@param eggIndex
	*index for the egg, from 1-24.
	*@return Nothing
	*/
	void LoadEgg(int shipmentID, int eggIndex){
		
	}
	
	/**
	* Always assumes an egg is available, automatically adds egg to cake mix. *
	* @return Nothing
	*/
	void CrackEgg(){
		
	}
	
	/**
	* Checks the milk level.
	*
	* @return double milk in gallons left in the current jug */
	double CheckMilkLevel(){
		return milklevel;
	}
	
	/**
	* Pours milk into mix. *
	* @param key
	* the key
	* @return boolean false if there's not enough milk, otherwise return true. */
	boolean PourMilk(double cups){
		if(milklevel >= cups){
			milklevel-=cups;
			return true;
		}else{
			return false;
		}
	}
	
	/**
	* These have unlimited supply. Pour ingredient into bowl. *
	* @param cups
	* the number of cups to pour into mix.
	* @return Nothing */
	
	void PourFlour(double cups){}
	void PourChocolate(double cups){}
	void PourBlueberry(double cups){}
	void PourNaturalFlavor(double cups){}
	void PourYellowSubstance(double cups){}
	void mix(double min){}
	void bake(double min){}
	private int milklevel;

}
