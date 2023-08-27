package Arrays.Harmonic;

public class HarmonicSeries {
    public static void main(String[] args) {
        double[] array = {1,2,3,4,5,6,7,8,9};

        double total = 0;

        for(int i = 0; i<array.length; i++){
            total+= (1/ (array[i]));
        }
        System.out.println("Total is " + total);
    }
}
