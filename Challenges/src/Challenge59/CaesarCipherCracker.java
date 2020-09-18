package Challenge59;

import java.lang.reflect.MalformedParameterizedTypeException;

public class CaesarCipherCracker {
    public static void main(String[] args) {
        CaesarCipherConverter(1,"jeg heter saa");
    }

    public static void CaesarCipherConverter(int n, String string){ // N = how many letters to the right in alphabet it should replace each character with.
        char[] charsInString = string.toCharArray();
        char[] newString = new char[string.length()];

        String alphabet = " abcdefghijklmnopqrstuvwxyz";

        // O(n^2) - bad performance, should improve this in the future.
        for(int i = 0; i < charsInString.length; i ++){
           for(int j = 0; j < alphabet.length(); j++){
               if(charsInString[i] == alphabet.charAt(0)){
                   newString[i] = ' ';
                   i++;
                   j=0;
                   System.out.println(newString[i]);
               }
               if(charsInString[i] == alphabet.charAt(j)){
                   if(j > alphabet.length()-n){
                        j = 0;
                   }
                   newString[i] = alphabet.charAt(j+3);
                   System.out.println(newString[i]);
                   if(i==12){
                   }else{
                       i++;
                       j=0;
                   }
               }
           }
        }


    }
}
