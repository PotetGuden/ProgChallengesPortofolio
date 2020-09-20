package Challenge66;

import java.util.Scanner;

public class TextToHexOrBinary {
    public static void main(String[] args) {

        preQuestions();
        //binHexConverter(input, hexOrBinary);
        //binHexConverter("1111 0101 0101 0011");
    }

    private static void preQuestions(){
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter a binary number: ");
        String input = s.nextLine();
        System.out.println("Do you want the decimal or hex representation of your number? write 'd' for decimal or 'h' for hex");
        String checkForHexOrBinary = s.nextLine();
        //boolean hexOrBinary = true; // Hex == True, Binary == False
        if(checkForHexOrBinary.equals("h")){
            binHexConverter(input, true);
        } else if( checkForHexOrBinary.equals("d")){
            binHexConverter(input, false);
        } else{
            System.out.println("You have to enter a valid letter.");
            preQuestions();
        }


    }

    private static void binHexConverter(String string, boolean HexOrBinary){
        string = string.replaceAll("\\s+", "");  // \\s removes whitespace characters from the string, which includes " "

        int decimal = Integer.parseInt(string,2);
        String hexStr = Integer.toString(decimal,16);

        if(HexOrBinary){
            System.out.println(hexStr);
        } else{
            System.out.println(decimal);
        }


    }
}
