package marathon;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class test0811_01 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        int sum = 0;
//        int lastIndex = (int) (Math.log10(inputNumber)-1);

//        for(int i = 0; i < inputNumber.charAt(i); i++) {
//            sum += inputNumber.charAt(Math.log10(inputNumber)-1-i);
//
//            System.out.print(Math.log10(inputNumber)-1-i);
//            if(i < (Math.log10(inputNumber)-1) ) {
//                System.out.print("+");
//            }
//        }
//        System.out.print("="+sum);

        while(0 < inputNumber) {
            sum += inputNumber%10;
            System.out.print(inputNumber%10);
            if(10 <= inputNumber) {
                System.out.print("+");
            } else {
                System.out.print("=");
            }
            inputNumber /= 10;
        }
        System.out.print(sum);

    }

}
