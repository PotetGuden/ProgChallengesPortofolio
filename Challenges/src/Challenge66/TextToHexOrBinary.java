package Challenge66;

public class TextToHexOrBinary {
    public static void main(String[] args) {
        binHexConverter("1111 0101 0101 0011");
    }

    private static void binHexConverter(String string){
        string = string.replaceAll("\\s+", "");  // \\s removes whitespace characters from the string, which includes " "
        System.out.println(string);

        int decimal = Integer.parseInt(string,2);
        String hexStr = Integer.toString(decimal,16);

        System.out.println(decimal);
        System.out.println(hexStr);
    }
}
