import java.math.BigInteger;
public class Playground {

    public static char charConverter(char x) {
        int pos = (int)x;
        int newPos = Math.abs(pos-122) + 97;
        return (char)newPos;
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) > -1;
    }


    public static void main(String[] args) {
        System.out.println(gcd(3,7));
        for (int i = 96; i <= 122; i++){
            String message = "Char is equal to";

            System.out.println("Char: " + (char)i);
            System.out.println(isVowel((char)i));
        }




    }
}
