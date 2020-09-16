package Challenge46;

public class CharOccurrencesInAString {

    public static void main(String[] args){
        checkCharOccurrencesString("abbcccdddd");
        checkCharOccurrencesString("abcd abcd");
        checkCharOccurrencesString("qwertyqwerty");
    }

    private static void checkCharOccurrencesString(String string){
        int count = 0 ;
        System.out.println("The current string is: " + string);

        // O(n^2) - not good performance with a larger "n", but it works
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if(string.charAt(i)==string.charAt(j)){
                    count++;
                }
            }
            System.out.println("The letter: '" + string.charAt(i) + "' has " + count + " occurrences");
            count = 0;
        }
        System.out.println("");

    }
}
