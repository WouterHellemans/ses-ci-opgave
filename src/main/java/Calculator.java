import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        if (args.length == 2 ) {
            int een = Integer.parseInt(args[0]);
            int twee = Integer.parseInt(args[1]);
            System.out.println(calculate(een, twee));
        }
        else {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nVoer eerste getal in\n");
            int een = Integer.parseInt(sc.nextLine());
            System.out.println("\nVoer tweede getal in\n");
            int twee = Integer.parseInt(sc.nextLine());
            sc.close();
            System.out.println(calculate(een, twee));
        }
    }

    public static int calculate(int x, int y) {
        return x + y;
    }
}
