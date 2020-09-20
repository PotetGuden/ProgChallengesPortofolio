package Challenge63;

import java.util.Random;

public class RandomNamePicker {
    public static void main(String[] args) {
        String[] names = {"Mark", "James", "Jostein", "Sofie", "Elisabeth"};
        randomNamePicker(names);
    }

    private static void randomNamePicker(String[] names){
        Random random = new Random();
        System.out.println(names[random.nextInt(names.length)]);
    }
}
