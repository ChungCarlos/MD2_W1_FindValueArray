import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] arrName = {"ChungCarlos","Leo","Maria"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name’s student:");
        String input_name = scanner.next();

        boolean check = false;
        for (String s : arrName) {
            if (s.equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + s);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println(" Not found " + input_name + " in the list.");
        }
    }
}