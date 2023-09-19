import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {

    static int plus (int x, int y) {
        int result = x + y;
        System.out.println("Toplama işlemi = " + result);
        return result;
    }

    static int minus (int x, int y) {
        int result = x - y;
        System.out.println("Çıkarma işlemi = " + result);
        return result;
    }

    static int times (int x, int y) {
        int result = x * y ;
        System.out.println("Çarpma İşlemi = " + result);
        return result;
    }

    static int divided (int x, int y) {
        if (y == 0 ) {
            System.out.println("İkinci sayı 0'dan farklı olmalı!");
        }
        int result = x / y ;
        System.out.println("Bölme işlemi = " + result);
        return result;
    }

    static int power(int x, int y) {
        int result = 1;
        for (int i=1; i<=y; i++){
            result *= x;
        }
        System.out.println(x + " üzeri " + y + " işleminin sonucu = " + result);
        return result;
    }

    static int mod (int x, int y) {
        int result = x % y;
        System.out.println("Mod işleminin sonucu = " + result);
        return result;
    }

    static void calc (int x, int y) {
        if ((x>0) && (y>0)) {
        System.out.println("Çevresi = " + (2*(x+y)));
        System.out.println("Alanı = " + (x*y));
        } else {
            System.out.println("Lütfen geçerli bir sayı giriniz!");
        }
    }

    public static void main(String[] args) {

        int select;
        Scanner input = new Scanner(System.in);
        String menu = "1 - Toplama İşlemi\n"
                +"2 - Çıkarma İşlemi\n"
                +"3 - Çarpma İşlemi \n"
                +"4 - Bölme İşlemi\n"
                +"5 - Üs Alma İşlemi\n"
                +"6 - Mod Alma İşlemi\n"
                +"7 - Dikdörtgen Alan ve Çevre Hesabı\n"
                +"0 - Çıkış Yap" ;

        while (true) {
            System.out.print("Yapmak istediğiniz işlemi giriniz: ");
            select = input.nextInt();

            if (select == 0) {
                break;

            } else {

                System.out.print("İlk sayıyı giriniz: ");
                int x = input.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                int y = input.nextInt();

                switch (select) {
                    case 1:
                        plus(x, y);
                        break;
                    case 2:
                        minus(x, y);
                        break;
                    case 3:
                        times(x, y);
                        break;
                    case 4:
                        divided(x, y);
                        break;
                    case 5:
                        power(x, y);
                        break;
                    case 6:
                        mod(x, y);
                        break;
                    case 7:
                        calc(x, y);
                        break;
                    default:
                        System.out.println("Geçersiz bir sayı girdiniz!");
                }
            }
        }
    }
}