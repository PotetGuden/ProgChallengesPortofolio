package Challenge63;

import java.util.Random;

public class RandomNamePicker {
    public static void main(String[] args) {
        String[] names1 = {"Mark", "James", "Jostein", "Sofie", "Elisabeth"};
        randomNamePicker(names1);
    }

    private static void randomNamePicker(String[] names){
        //System.out.println(names[(int)Math.random()*names.length]); // Printing a random name from input

        Random random = new Random();
        System.out.println(names[random.nextInt(names.length)]);

    }
}
