package homework10;

public class Matrix implements IMatrix {

    private double[][] numbers;

    public Matrix() {
        numbers = new double[1][1];
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }

    public Matrix(int colRow, int colCol) {
        numbers = new double[colRow][colCol];

    }


    @Override
    public int getRows() {
        return this.numbers.length;
    }

    @Override
    public int getColumns() {
        return this.numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return this.numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {

        numbers[rowIndex][colIndex] = value;
    }


    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        double[][] result = new double[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result[i][j] = this.numbers[i][j] + otherMatrix.getValueAt(i, j);
            }
        }
        return new Matrix(result);
    }


    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public void mul(double value) {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                numbers[i][j] = numbers[i][j]*value;
            }
        }
    }

    @Override
    public IMatrix transpose() {//  не работает
        double[][] result = new double[this.getColumns()][this.getRows()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result[i][j] = this.getValueAt(j,i);
            }
        }
        return new Matrix(result);

    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                numbers[i][j] = value;
            }
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] != 0) {
                    return false;
                }

            }

        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j && numbers[i][j] != 1) {
                    return false;
                }
                if (i != j && numbers[i][j] != 0) {
                    return false;
                } else return true;
            }

        }
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        if (numbers.length == numbers[0].length) {
            return true;

        } else

            return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}













