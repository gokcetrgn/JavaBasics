package Arrays.Frequency;

import java.util.Arrays;

public class FrequencyArrays {
        public static void main(String[] args) {
            int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

            int count = 0;
            Arrays.sort(array);

            for(int i = 0; i<array.length; i++){
                count = 0;
                for(int j = 0; j<array.length; j++){
                    if(array[i] == array[j]){
                        count++;
                }
            }
            if (i == 0 && array[i + 1] == array[i]) {
                System.out.println(array[i] + " sayisi " + count + " kere tekrar etti.");
            }

            if (i == 0 && array[i + 1] != array[i]) {
                System.out.println(array[i] + " sayisi " + count + " kere tekrar etti.");
            }

            if (i != 0 && array[i - 1] != array[i]){
                System.out.println(array[i] + " sayisi " + count + " kere tekrar etti.");
            }
        }
    }
}
