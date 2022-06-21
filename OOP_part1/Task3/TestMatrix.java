package OOP_part1.Task3;

public class TestMatrix {
    public static void main(String[] args) {

        int[][] array1 = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int[][] array2 = {{3, 2, 1}, {1, 1, 1}};

        Matrix matrix1 = new Matrix(array1);
        Matrix matrix2 = new Matrix(array1);
        Matrix matrix5 = new Matrix(matrix1.addition(matrix2));
        Matrix matrix6 = new Matrix(matrix1.multiplication(matrix2));
        
        matrix1.printMatrix();
        matrix2.printMatrix();
        matrix5.printMatrix();
        matrix6.printMatrix();

        matrix1.multiplyByValue(3);
        matrix1.printMatrix();
        matrix1.setValue(1, 1, 1000);
        matrix1.printMatrix();

        Matrix matrix3 = new Matrix(array2);
        Matrix matrix4 = new Matrix(array2);
        Matrix matrix7 = new Matrix(matrix3.addition(matrix4));
        Matrix matrix8 = new Matrix(matrix3.multiplication(matrix4));

        matrix3.printMatrix();
        matrix4.printMatrix();
        matrix7.printMatrix();
        matrix8.printMatrix();

    }
}
