import java.util.Scanner;

public class HyperSKillExampleEncryptDecryptSolution {
    //This class contains the example code given by hyperskill to solve the problem
    // I believe it has errors and so I've added it here to test it out.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        char[] chars = scanner.nextLine().toCharArray();
        int shift = scanner.nextInt();
        switch (operation) {
            case "enc":
                getEncryption(chars, shift);
                break;
            case "dec":
                getDecryption(chars, shift);
                break;
            default:
                System.out.println("Unknown operation");
                break;
        }
    }

    public static void getDecryption(char[] chars, int shift) {
        for (char item : chars) {
            char shiftItem = (char) (item - shift);
            System.out.print(shiftItem);

        }
    }

    public static void getEncryption(char[] chars, int shift) {
        for (char item : chars) {
            char shiftItem = (char) (item + shift);
            System.out.print(shiftItem);
        }
    }

}
