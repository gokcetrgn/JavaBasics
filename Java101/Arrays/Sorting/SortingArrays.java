package Arrays.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eleman sayisini girin: ");
        int elemanSayisi = scanner.nextInt();

        int[] array = new int[elemanSayisi];

        System.out.println("Elemanlari girin: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        for(int value:array){
            System.out.print(value + " ");
        }
        
    }
}
