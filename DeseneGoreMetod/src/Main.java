import java.util.Scanner;

public class Main {

    public static void byPattern(int x, int y, boolean control) {
        if (x > 0 && control) {   // Başlangıçta x<0 olana kadar sayıdan 5 çıkartılır
            System.out.print(x + " ");
            byPattern(x-5, y,true);
        } else {
            if (x <= y) {   //  x<0 olduktan sonra x=n olana kadar 5 eklenir.
                System.out.print(x + " ");
                byPattern(x+5, y,false);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");   // Kullanıcıdan sayıyı aldık.
        int n = input.nextInt();

        byPattern(n,n,true);
    }
}