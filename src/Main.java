import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cycline c1 = new Cycline("asd", 50, "yellow");
        System.out.println(c1.getColor());
        System.out.println(c1.Area());

    }
}
