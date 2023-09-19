import java.util.Scanner;

public class Main {

    static double power (double a, double b) {

        if (b == 0) {  // recursive fonksiyondan çıkma koşulu.
            return 1;
        } else if (b<0) {   // b negatif değer alırsa işlem yapılıyor.
            return 1/(a * power(a,(-b-1))) ;
        } else {   // b sayısı pozitif değerse;
            return a * power(a,(b-1));
        }
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        double a = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        double b = input.nextInt();

        System.out.println(power(a,b));
    }
}