package homework4;

public class No22 {

    public static void main(String[] args) {
        int[][] mass = new int[5][5];


        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j) {
                    mass[i][j] = 1;
                }
            }
        }


        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] == 1) {
                    System.out.println(mass[i][j] + " ");
                }
                if (i > j) {
                    System.out.print(" ");
                }
            }
        }
    }
}