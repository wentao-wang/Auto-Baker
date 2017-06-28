import java.util.Scanner;
//assume one cup of milk is one gallon
public class AutoBakerMk2 {
	private static autocake cook = new autocake();
	private static eggprovider egg = new eggprovider();
	private static int countEgg = 24;
	
	//order cake
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please input cake type");
		String type = in.nextLine();
		System.out.println("please input cake size");
		String size = in.nextLine();
		in.close();
		if(type.equals("blueberry")){
			blueBerry(size);
		}
		if(type.equals("chocolate")){
			chocolate(size);
		}
		if(type.equals("lemon")){
			lemon(size);
		}
	}

	//make blueBerry cake
	private static void blueBerry(String s){
		if(s.equals("small")){
		cook.PourFlour(4);
			//check if egg is perfect
			int i = 0;
			while(i<3){
				if(countEgg == 0){
					egg = new eggprovider();
					countEgg = 24;
				}
				if(!egg.IsCracked(egg.shipmentNumber, countEgg)){
					cook.LoadEgg(egg.shipmentNumber, countEgg);
					cook.CrackEgg();
					countEgg--;
					i++;
				}else{
					countEgg--;	
				}
			}
			//pour milk
			if(cook.openMilkJug() < 3600000){
				if(cook.CheckMilkLevel()>=1){
					cook.PourMilk(1);
				}else{
					cook.openMilkJug();
					cook.PourMilk(1);
				}
			}else{
				cook.openMilkJug();
				cook.PourMilk(1);
			}
			cook.PourBlueberry(1);
			cook.mix(5);
			cook.bake(30);
			
		}
		if(s.equals( "large")){
			//....almost same code as above
		}
		
	}
	
	//make chocolate cake, almost same code as above
	private static void chocolate(String s){
		//...
	}
	
	//make lemon cake,almost same code as above 
	private static void lemon(String s){
		//...
	}
}
