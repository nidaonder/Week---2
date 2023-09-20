import java.util.Scanner;

public class Main {

    static boolean isPrime(int number, int divisor, int counter) {
        if (number == divisor ) {      // Kullanıcıdan aldığımız sayı ve bölen sayımız birbirine eşit olduğunda program bitiyor.
            counter++;
            if (counter == 2) {
                return true;
            }
            else{                     // Eğer 2'den fazla tamsayı bölen varsa method false dönüyor.
                return false;
            }
        }else{
            if (number % divisor == 0) {
                counter++;
            }
            return isPrime(number,divisor+1,counter);  // Recursive method.
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        if(isPrime(number,1, 0)){   // divisor=bölen olduğu için 1'den başlatılıyor.
            System.out.println("Sayiniz asaldir.");
        }else{
            System.out.println("Sayiniz asal degildir.");
        }
    }
}