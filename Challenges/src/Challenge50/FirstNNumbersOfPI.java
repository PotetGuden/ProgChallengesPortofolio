package Challenge50;

public class FirstNNumbersOfPI {
    public static void main(String[] args) {
        calculateNNumbersInPI(5);
        calculateNNumbersInPI(10);
        calculateNNumbersInPI(15);
    }

    public static void calculateNNumbersInPI(int n){
        double pi = 0;

        for (int i = 100000; i > 0; i--) { // the larger (i)
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
            if (i == 1) {
                pi *= 4;
                System.out.printf("%."+n+"f\n", pi);
            }
        }
    }
}
