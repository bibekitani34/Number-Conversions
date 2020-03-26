import java.util.Scanner;

public class ttt {
    public static void main(String args[]) {

        //for hexadecimal
        String hnum;
        int dnum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hexadecimal number to convert: ");
        hnum = sc.nextLine();
        dnum = hexToDecimal(hnum);
        System.out.println("Converted number: " + dnum);

        //for octal
        int octnum;
        int onum;
        System.out.println("Enter the octal number to convert: ");
        octnum = sc.nextInt();
        onum = octToDecimat(octnum);
        System.out.println("Converted octal number: " + onum);

        //for octal
        int binNum;
        int bnum;
        System.out.println("Enter the binary number to convert: ");
        binNum = sc.nextInt();
        bnum = binToDecimat(binNum);
        System.out.print("Converted decimal number: "+ bnum);

    }


    //method to convert hexadecimal to decimal
    public static int hexToDecimal(String hexnum) {

        String hexd;
        int m,num = 0;
        char lett;
        hexd = "0123456789ABCDEF";
        hexnum = hexnum.toUpperCase();
        for (int i = 0; i < hexnum.length(); i++) {
             lett = hexnum.charAt(i);
             m = hexd.indexOf(lett);
            num = 16 * num + m;
        }
        return num;
    }

    //method to convert Octal to Decimal
    public static int octToDecimat(int octalNumber) {


        int decimal = 0;
        int num = 0;
        while (true) {
            if (octalNumber == 0) {
                break;
            } else {
                int temp = octalNumber % 10;
                decimal += temp * Math.pow(8, num);
                octalNumber = octalNumber / 10;
                num++;
            }
        }
        return decimal;
    }

    //method to convert binary number to decimal
    public static int binToDecimat(int binaryNumber) {

        int decimal = 0;
        int num = 0;
        while (true) {
            if (binaryNumber == 0) {
                break;
            } else {
                int temp = binaryNumber % 10;
                decimal += temp * Math.pow(2, num);
                binaryNumber = binaryNumber / 10;
                num++;
            }
        }
        return decimal;
    }


}

