public class Main {

    static boolean isPalindrom (int n) {

        int sayi =n, sonBasamak, yeniSayi=0;

        while (sayi != 0 ) {

            sonBasamak = sayi % 10;
            yeniSayi = (yeniSayi *10) + sonBasamak;
            sayi/=10;
        }

        if ( n == yeniSayi) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(4004));
    }
}