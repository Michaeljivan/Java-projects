/**
 * @author jivanm
 */
public class EatSleepCode {
	
	public static void print(String s){
		System.out.println(s);
	}
	
	public static void eat(){
		print("Eating");
	}
	
	public static void sleep(){
		print("Sleeping");
	}
	
	public static void code(){
		print("Coding");
	}
	
	
	public static void main(String[] args) {
		boolean alive = true;
		int days = 0;
		do{
			if(days <= 7){
				eat();
				code();
				sleep();				
				days++;
				print("end of day " + days);
			}
			if (days == 7){alive = false;}
		}while(alive);

	}	
}
