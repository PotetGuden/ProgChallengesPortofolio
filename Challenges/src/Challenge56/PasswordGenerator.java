package Challenge56;

import java.util.ArrayList;
import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        passwordGenerator(15,true, true,false,true);
    }

    public static void passwordGenerator(int passwordLength, boolean doUpperCase, boolean doLowercase, boolean doSpecial, boolean doInt){
        Random random = new Random();

        String generatedPassword = "";

        String[] allPossibleCharacters = new String[4];
        allPossibleCharacters[0] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        allPossibleCharacters[1] = "abcdefghijklmnopqrstuvwxyz";
        allPossibleCharacters[2] = "!#¤%&/()=@£$";
        allPossibleCharacters[3] = "1234567890";

        ArrayList<String> checkedCharacters = new ArrayList<String>();

        if(doUpperCase){
            checkedCharacters.add(allPossibleCharacters[0]); // adds Uppercase letters into the array
        }
        if(doLowercase){
            checkedCharacters.add(allPossibleCharacters[1]); // adds Lowercase letters into the array
        }
        if(doSpecial){
            checkedCharacters.add(allPossibleCharacters[2]); // adds Special letters into the array
        }
        if(doInt){
            checkedCharacters.add(allPossibleCharacters[3]); // adds String(Integer) into the array
        }

        // adds one by one character into the generatedPassword string, (passwordLength) times.
        for(int i = 0; i < passwordLength; i++){
            /*
                Saves the index for which checkedCharacters[i] we're going into, so we can get the length of
                the string connected to that index.
            */
            int currentIndexInArray = random.nextInt(checkedCharacters.size());
            // Simplyfied   -    checkedCharacters.get(1).charAt(5);
            generatedPassword += checkedCharacters.get(currentIndexInArray).charAt(random.nextInt(checkedCharacters.get(currentIndexInArray).length()));
        }

        System.out.println(generatedPassword);
    }

}
