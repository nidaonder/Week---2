import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(Arrays.toString(list));
        System.out.println("Küçükten büyüğe sıralanmış liste;");
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        int low = list[0];
        int high = list[7];
        for (int i: list) {
            if ((i < n) && (i > low)) {
                    low = i;
            }
            if ((i > n) && (i < high)) {
                high = i;
            }
        }
        System.out.println("Gidiğiniz sayıdan küçük ve sayıya en yakın olan sayı : " + low);
        System.out.println("Girdiğiniz sayıdan büyük ve sayıya en yakın olan sayı : " + high);
    }
}