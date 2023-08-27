package Arrays.Matris;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrixOne = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] matrixTwo = new int[3][3];

        for(int i =0; i < matrixOne.length; i++){
            for(int j = 0; j<matrixOne[0].length; j++){
                matrixTwo[i][j] = matrixOne[j][i];
            }
        }
        for(int i =0; i < matrixOne.length; i++){
            for(int j = 0; j<matrixOne[0].length; j++){
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
