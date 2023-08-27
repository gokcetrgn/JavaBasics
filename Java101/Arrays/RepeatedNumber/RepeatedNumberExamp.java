package Arrays.RepeatedNumber;

public class RepeatedNumberExamp {
    public static boolean isFind(int[] array, int value){
        for(int i: array){
            if(i == value){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] array = {2,4,8,8,6,7,1,2,4,5,6,7,8,9};
        int[] repeatedNumbers = new int[array.length];

        int startedIndex = 0;

        for(int i =0; i < array.length; i++){
            for(int j =0; j < array.length; j++){
                if(array[i] % 2 == 0 && (i!=j) && (array[i] == array[j])){
                    if(!isFind(repeatedNumbers, array[j])){
                        repeatedNumbers[startedIndex++] = array[i];
                    }
                    break;
                }
            }
        }
        for(int value: repeatedNumbers){
            if(value !=0){
                System.out.println(value);
            }
        }
    }
}
