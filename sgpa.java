package Conditionals;

import java.util.Scanner;

public class sgpa {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
       int credits=0;
       int grade=0;
       double cgpa;
       double c=0;
       double mul=0;
           System.out.print("enter number of subjects: ");
           int subjects=in.nextInt();
           for (int j=1;j<=subjects;j++){
               System.out.print("enter grade:");
               grade=in.nextInt();
               System.out.print("enter Credits:");
               credits=in.nextInt();
               mul=mul+(credits*grade);
               c=c+credits;
           }

           double sgpa =mul/c;
        System.out.println(mul);
        System.out.println(c);
           System.out.println("sgpa is: "+sgpa);


    }
}
