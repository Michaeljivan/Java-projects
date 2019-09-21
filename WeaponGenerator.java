// Weapon Generator based off my favorite game Borderlands 3
import java.util.Random;

public class WeaponGenerator
{
    public static void main(String[] args)
    {       
        for (int i =1; i < 6; i++) {
            System.out.println(generateWeapon());
        }
    }


    public static String generateWeapon()
    {
        String [] weaponTypes = {"shotgun", "smg", "handgun", "sniper", "launcher"};
        String [] elements = {"fire", "corrosion", "electric"};
        Random randgen = new Random();
        int weaponIndex = randgen.nextInt(weaponTypes.length);
        int elementIndex = randgen.nextInt(elements.length);
        int damage = randgen.nextInt(1000);

        return "type "+ elements[elementIndex] +" "+ weaponTypes[weaponIndex] + " damage "+ damage;
    }
}
