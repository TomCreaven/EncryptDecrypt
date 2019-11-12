import java.math.BigInteger;
public class Playground {

    public static char charConverter(char x) {
        int pos = (int)x;
        int newPos = Math.abs(pos-122) + 97;
        return (char)newPos;
    }


        public static void main(String[] args) {
        BigInteger bI = new BigInteger("2134567");
        int divisor = (int)Math.pow(10,15/2);
            System.out.println(((Object)divisor).getClass().getName());
        while(bI.compareTo(new BigInteger("0")) >0){
            System.out.println(bI.toString());
                bI = bI.divide(new BigInteger("10"));
            }
//            System.out.println((char)97);
//            System.out.println(((int)'a')-97);
            System.out.println(bI.compareTo(new BigInteger("0")));
//            System.out.println(charConverter('a'));
//            System.out.println(charConverter('z'));
            System.out.println('a'+ " :" +  (int)'a');
            System.out.println('z'+ " :" +  (int)'z');

            System.out.println(((122 + 1)%122)+96);


        }
}
