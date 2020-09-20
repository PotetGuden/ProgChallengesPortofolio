package Challenge66;

import java.util.Scanner;

public class TextToHexOrBinary {
    public static void main(String[] args) {
        preQuestions();
    }

    private static void preQuestions(){
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter a binary number: ");
        String input = s.nextLine();
        System.out.println("Do you want the decimal or hex representation of your number? write 'd' for decimal or 'h' for hex");
        String checkForHexOrBinary = s.nextLine();

        if(checkForHexOrBinary.equals("h")){
            binHexConverter(input, true);
        } else if( checkForHexOrBinary.equals("d")){
            binHexConverter(input, false);
        } else{
            System.out.printf("You have to enter a valid letter. Do you want to try again? y/n? ");
            String startOver = s.nextLine();
            if(startOver.equals("y")){
                preQuestions();
            } else{
                System.out.println("The application has been shut down..");
            }
        }
    }

    private static void binHexConverter(String string, boolean HexOrBinary){
        string = string.replaceAll("\\s+", "");  // \\s removes whitespace characters from the string, which includes " "

        int decimal = Integer.parseInt(string,2);
        String hexStr = Integer.toString(decimal,16);

        if(HexOrBinary){                    // If the boolean value is true -> print the hex format else print decimal
            System.out.println(hexStr);
        } else{
            System.out.println(decimal);
        }
    }
}
