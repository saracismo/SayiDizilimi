import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Sayı_Siralama {
    public static void main(String[] args) {

        int x, y, z;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz: ");
        x = inp.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        y = inp.nextInt();

        System.out.print("3. Sayıyı Giriniz: ");
        z = inp.nextInt();

        if ((x > y) && (x > z)) {
            if (y > z) {
                System.out.println("x > y > z");
            }
         else{
            System.out.println("x > z > y ");
        }
        }
        else if ((y > x) && (y > z)) {
            if (x > z) {
                System.out.println("y > x > z");
            } else {
                System.out.println("y > z > x");
            }
        } else {
            if (x > y) {
                System.out.println("z > x > y");
            } else {
                System.out.println(" z > y > x");
            }
        }

    }
}