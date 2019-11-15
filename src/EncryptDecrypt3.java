import java.util.Scanner;

public class EncryptDecrypt3 {

    /**
     *
     * @param toEncrypt
     *               this is a String input to be encrypted, offset by the integer input
     * @param bitShift
     *               this is an int input that dictates how many characters the input string is to be shifted by for encryption
     * @return outputString - A string encrypted based on the bitShift input8
     *
     */
    public static String encrypt (String toEncrypt, int bitShift){
        String outputString = "";
        for (int i = 0; i < toEncrypt.length(); i++){
            outputString += (charConverter(toEncrypt.charAt(i), bitShift));
        }

        return outputString;
    }

    public static String decrypt (String toDecrypt, int bitShift){
        String outputString = "";
        for (int i = 0; i < toDecrypt.length(); i++){
            outputString += (charConverter(toDecrypt.charAt(i), -bitShift));
        }
        return outputString;
    }

    public static char charConverter(char x, int bitShift) {
        if (!isValidChar(x))
            return x;
        int pos = (int)x;
        if (bitShift < 0){
            if (pos < 32 - bitShift){
                pos+= ((126-32) +1);
            }
        }
        int newPos = pos + bitShift;

        if (newPos > 126){
            newPos = (newPos % 126) + 32;
        }

        return (char)newPos;
    }

    public static boolean isValidChar(char a){
        int valueOfChar = (int)a;
        return (32 <= a && a <= 126);
    }

    public static String encryptDecrypt(String type, String message, int bitShift){

        switch (type) {
            case "enc":
                return encrypt(message, bitShift);
            case "dec":
                return decrypt(message, bitShift);
            default:
                return "Please specify either 'enc' or 'dec'";
        }
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String message = scanner.nextLine();
        int shift = scanner.nextInt();
        System.out.println(encryptDecrypt(type, message, shift));
    }
}
