// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10, 120, 85, 20);
        Fighter f2 = new Fighter("B", 15, 90, 90,30);
        Match m1 = new Match(f1,f2,85,100);
        m1.run();
    }
}