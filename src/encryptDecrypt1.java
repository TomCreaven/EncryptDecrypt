import sun.lwawt.macosx.CPrinterDevice;

public class encryptDecrypt1 {

//    public class Main {

    public static char charConverter(char x) {
        int pos = (int)x;
        int newPos = Math.abs(pos-122) + 97;
        if (x == ' ' || x =='!')
            return x;
        return (char)newPos;
    }

    public static char charConverter2(char x, int bitShift) {
        if (x == ' ' || x =='!')
            return x;
        int pos = (int)x;
        int newPos = pos + bitShift;

        if (newPos > 122){
            newPos = (newPos % 122) + 96;
        }
        return (char)newPos;
    }
    public static String encrypt(String inputString){
        String resultString = "";
        inputString = inputString.toLowerCase();
        for (int i =0; i <inputString.length(); i++){
            resultString += charConverter2(inputString.charAt(i),1);

        }

        return resultString;
    }

    public static void main(String[] args) {
        System.out.println(charConverter2('a', 1));
        String message = "we found a treasure!";
        System.out.println(encrypt(message));
//        String str1 = "aaabbcccdaa";
//        String str2 = " ";
//
//        for (int i = 0; i < str1.length(); i++) {
//            char ch = str1.charAt(i);
//            if (ch != str2.charAt(str2.length() - 1)) {
//                str2 += ch;
//            }
//        }
    }
}

