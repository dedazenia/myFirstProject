package homework10.alter;

import homework10.Matrix;

public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(3, 4);
        Matrix matrix1 = new Matrix(3, 4);
        Matrix matrix2 = new Matrix(3, 4);
        Matrix matrix3 = new Matrix(3, 3);


        matrix.printToConsole();


        matrix.fillMatrix(3);
        matrix1.fillMatrix(5);
        matrix2.fillMatrix(1);
        System.out.println();
        matrix.printToConsole();
        matrix.setValueAt(2, 2, 11);
        System.out.println();
        matrix.printToConsole();
        System.out.println();
        System.out.println(matrix.getValueAt(2, 2));
        matrix.add(matrix1).printToConsole();
        System.out.println(matrix1.isSquareMatrix());
        System.out.println(matrix3.isSquareMatrix());
        System.out.println(matrix.isIdentityMatrix());
        System.out.println(matrix3.isIdentityMatrix());
        System.out.println(matrix3.isNullMatrix());
        for (int i = 0; i < matrix3.getRows(); i++) {
            for (int j = 0; j < matrix3.getColumns(); j++) {
                if (i == j) {
                    matrix3.setValueAt(i, j, 1);
                }
            }
        }
        matrix3.printToConsole();
        System.out.println(matrix3.isIdentityMatrix());
        System.out.println(matrix3.isNullMatrix());
        matrix3.mul(10);
        matrix3.printToConsole();
        matrix.add(matrix1).printToConsole();

        matrix3.setValueAt(1,0,2);
        matrix3.printToConsole();
        matrix3.transpose().printToConsole();



    }
}





