import java.util.Scanner;
import java.util.Random;
public class Pokemon{
	
	public static void prt(String s){
		System.out.println(s);
	}
	
	public static int attack(int attack_value){
		Random rand = new Random();
		int rand_num;
		int result;
		rand_num = rand.nextInt(11);
		
		result = attack_value * rand_num;
		return result;
	}
	
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		
		while(true){
			prt("A wild kangaroo appeared, how would you like to attack it?");
			prt("[c] cut [v] vault [b] bounce");
			String decision = input.next();
			
			switch(decision){
				case "c":
					prt("You used cut, and delt "+attack(1)+" damage.");
					break;
				case "v":
					prt("You used vault, and delt "+attack(2)+" damage.");
					break;
				case "b":		
					prt("You used bounce, and delt "+attack(3)+" damage.");
					break;
			}
		}
	}
}
