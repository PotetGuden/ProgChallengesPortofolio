package Challenge47;

public class TowerOfHanoi {

    public static void main(String[] args){
        towerOfHanoi(3, 'A', 'C', 'B');  // n is the amount of plates you want to move
    }
    // Recursive function
    static void towerOfHanoi(int n, char fromRod, char auxilaryRod, char destinationRod) {

        if(n == 1){
            System.out.println("Plate 1 was moved from " + fromRod + " to " + destinationRod);
            return;
        }

        towerOfHanoi(n-1, fromRod, destinationRod,auxilaryRod);
        System.out.println("Plate " + n + " was moved from " + fromRod + " to " + destinationRod);
        towerOfHanoi(n-1, auxilaryRod, fromRod, destinationRod);
    }
}
