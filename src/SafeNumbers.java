
import java.util.Scanner;
public class SafeNumbers {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = SafeInput.getInt(in, "Enter your favorite integer");
        double favDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.printf("Your favorite integer is %d and your favorite double is %f.", favInt, favDouble);
    }
}
