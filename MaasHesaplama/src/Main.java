public class Main {
    public static void main(String[] args) {

        Employee c1 = new Employee("Kemal", 2000.0,45,1985);
        System.out.println(c1.toString());
        System.out.println("Vergi : " + c1.tax());
        System.out.println("Bonus : " + c1.bonus());
        System.out.println("Maaş Artışı : " + c1.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Maaş : " + (c1.salary-c1.tax()+c1.bonus()));
        System.out.println("Toplam Maaş : " + (c1.salary + c1.raiseSalary()));

        System.out.println("==================");

        Employee c2 = new Employee("Ahmet", 2200.0, 40,2010);
        System.out.println(c2.toString());
        System.out.println("Vergi : " + c2.tax());
        System.out.println("Bonus : " + c2.bonus());
        System.out.println("Maaş Artışı : " + c2.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Maaş : " + (c2.salary-c2.tax()+c2.bonus()));
        System.out.println("Toplam Maaş : " + (c2.salary + c2.raiseSalary()));


    }
}