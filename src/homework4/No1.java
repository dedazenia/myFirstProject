package homework4;

public class No1 {
    public static void main(String[] args) {
        int[][] mass = new int[5][5];


        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j) {
                    mass[i][j] = 1;
                }
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();


        }
    }
}

