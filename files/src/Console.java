import java.util.Scanner;

public class Console {
    static private Scanner in = new Scanner(System.in);
    
    static public String inputText(String msg) {
        System.out.println(msg);
        
        return in.nextLine();
    }

    static public int inputNumber(String msg) {
        System.out.println(msg);

        return in.nextInt();
    }
}
