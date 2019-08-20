import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class idk {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something!!!! Get to the CHOPPA!!!");
        String input = scanner.nextLine();
        System.out.println("You entered: \"" + input + "\"");

        String not = "";
        if (!StringUtils.isNumeric(input))
            not = " not";
        System.out.println("\"" + input + "\" is" + not + " a number");

        System.out.println("Flipped Case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));
        System.out.println("Has this many 0's" + StringUtils.countMatches(input, "0"));
    }
}
