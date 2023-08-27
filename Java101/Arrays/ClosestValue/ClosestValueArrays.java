package Arrays.ClosestValue;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestValueArrays {
 public static void main(String[] args) {
    int[] array = {2,3,5,7,-11,-13,-15,17,19,-23};

    Scanner scanner = new Scanner(System.in);

    System.out.println("Select a number: ");
    int number = scanner.nextInt();

    Arrays.sort(array) ;

    int theClosestMin = 0, theClosestMax = 0;
    for(int i = 0; i< array.length; i++){
        if(array[i] < number){
            theClosestMin = array[i];
            }
        }
    for(int i = 0; i< array.length; i++){
        if(array[i] > number){
            theClosestMax = array[i];
            break;
            }
        }
        System.out.println("The closest min number is "+ theClosestMin );
        System.out.println("The closest max number is " + theClosestMax);


    }   
}
