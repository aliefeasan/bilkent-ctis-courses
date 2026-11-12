package lab05_q1;


import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        int []array = new int[5];

        int i;
        double sum=0;
        double avrg;
        System.out.println("Enter 5 integer numbers: ");
        for(i=0;i<5;i++) {
            array[i] = input.nextInt();
            sum+=array[i];
        }
        System.out.println("The array content: ");
        for(i=0;i<5;i++) {
            System.out.println(array[i]+" ");
        }

        avrg = sum/array.length;
        System.out.println("Sum of the numbers: "+sum+"Average of the numbers: ");

        System.out.println("index\t number\tdiff. to avg\n-----\t-----\t-----");
        for(i=0;i<array.length;i++) {
            System.out.printf("%5d %5d %10.2f\n",i,array[i],(array[i]-avrg));
        }

    }

}