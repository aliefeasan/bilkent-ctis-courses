package lab05_q2;

import java.util.Scanner;

public class q2 {

    public static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\tMENU\t\t");
        System.out.println("1. Initialize array\n2. Input array elements\n3. Output array elements");
        System.out.println("4. Search a value\n5. Exit program\n");

        int choice=0;
        do {
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
        }while(choice<1 ||choice>5);

        return choice;
    }

    public static int[] initilize(int array[]){
        int i;
        for(i=0;i<array.length;i++) {
            array[i] = 0;
        }
        System.out.println("All elements are initialized by zero");
        return array;
    }

    public static int fillArray(int array[]) {
        int number=0;
        int i=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        do {
            number = input.nextInt();
            if(number!=0) {
                array[i]=number;
                i++;
            }
        }while(number!=0);
        System.out.println("The size of the array: "+i);
        return i;
    }
    public static void displayArray(int array[],int length) {
        int i;
        for(i=0;i<length;i++) {
            System.out.printf("%d ",array[i]);
        }
        System.out.println("");
    }

    public static int findPos(int array[],int numberSearched) {
        int i;
        for(i=0;i<array.length;i++) {
            if(array[i]==numberSearched) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []array = new int[10];
        int choice;
        int length=10;
        int pos;
        Scanner input = new Scanner(System.in);
        int searchedNumber;
        do{
            choice = menu();

            if(choice==1)
                initilize(array);
            else if(choice==2)
                length = fillArray(array);
            else if(choice==3)
                displayArray(array,length);
            else if(choice==4) {
                System.out.println("Enter the value that will be searched: ");
                searchedNumber = input.nextInt();
                pos = findPos(array,searchedNumber);
                if(pos==-1)
                    System.out.println("The array does NOT contain the searched number!");
                else
                    System.out.println("Position of the value is: "+pos);
            }
        }while(choice!=5);
    }

}