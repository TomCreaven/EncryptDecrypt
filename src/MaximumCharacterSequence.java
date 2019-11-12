import java.util.Scanner;

public class MaximumCharacterSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int tmp = 1;
        int max = 0;
        for (int i= 0; i < input.length(); i++){
            int pos = i + 1;
            while(pos<input.length() && input.charAt(i) == input.charAt(pos)){
                tmp++;
                pos++;
            }
            if (tmp > max){
                max = tmp;
            }
            tmp =1;
        }
        System.out.println(max);

    }

}
