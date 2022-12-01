
import java.util.Scanner;

public class PrettyHeader {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a message to print: ");
        String msg = in.nextLine();
//        String msg = "Returns the substring starting from the specified index i.e beginIndex and extends to the character";
        SafeInput.prettyHeader(msg);
    }
}
