import java.util.Scanner;

public class Encrypt2 {

    public static String encrypt (String toEncrypt, int bitShift){
        String outputString = "";
        toEncrypt = toEncrypt.toLowerCase();
        for (int i = 0; i < toEncrypt.length(); i++){
            outputString += (charConverter(toEncrypt.charAt(i), bitShift));
        }


        return outputString;
    }

    public static char charConverter(char x, int bitShift) {
        if (!isValidChar(x))
            return x;
        int pos = (int)x;
        int newPos = pos + bitShift;

        if (newPos > 122){
            newPos = (newPos % 122) + 96;
        }
        return (char)newPos;
    }

    public static boolean isValidChar(char a){
        int valueOfChar = (int)a;
        return (97 <= a && a <= 122);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        int shift = scanner.nextInt();
        System.out.println(encrypt(message, shift));

    }
}
