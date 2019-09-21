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
        String [] types = {"shotgun", "smg", "handgun", "sniper", "launcher"};
        Random randgen = new Random();
        int weaponIndex = randgen.nextInt(types.length);
        int damage = randgen.nextInt(1000);

        return "type " + types[weaponIndex] + " damage "+damage;
    }
}
