import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç elemanlı dizi oluştmak istediğinizi giriniz: ");
        int n = input.nextInt();

        int[] list = new int[n];

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Eleman: ");
            list[i-1] = input.nextInt();
        }

        System.out.println(Arrays.toString(list));

        for (int j = 0; j < n-1; j++) {
            for (int k = 0; k < n-j-1 ; k++) {
                int value = list[k];
                if (list[k] > list[k + 1]) {
                    list[k] = list[k + 1];
                    list[k + 1] = value;
                }
            }
        }
        System.out.println("Küçükten büyüğe sıralanmış dizi : " + Arrays.toString(list));
    }
}