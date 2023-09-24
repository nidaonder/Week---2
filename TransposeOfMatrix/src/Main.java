import java.util.Arrays;

public class Main {

    static void printMatrix(int[][] arr) {   // Matrisleri ekrana yazdırmak için metod oluşturdum.

        for (int i=0; i < arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {   // 2 boyutlu matris dizisi oluşturdum.
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Matrix : ");
        printMatrix(matrix);

        int[][] transpose = new int[matrix[0].length][matrix.length];  // matrisin transpozunu for döngüsü kullanarak buldum.
        for (int j = 0; j<matrix[0].length; j++){
            for (int i = 0; i< matrix.length; i++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose : ");
        printMatrix(transpose);
    }
}