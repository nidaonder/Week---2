public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("A",10,90,85,30);
        Fighter f2 = new Fighter("B" , 15,100,85,30);

        Match match = new Match(f1,f2,85,100);
        match.Run();
    }
}