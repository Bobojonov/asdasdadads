package codingCompetitive;

public class Box {
    public static void main(String args[]) {
        Machii mac = new Machii();
        Machii mac1 = mac;
        mac1.x = 6;
        System.out.println(mac.x);
        System.out.println("The value of x is: " + mac1.x);
    }
}
