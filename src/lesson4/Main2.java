package lesson4;

public class Main2 {
    public static void main(String[] args) {
        int[][] mass = new int[3][4];
        System.out.print(mass[0][0] + " ");
        System.out.print(mass[0][1] + " ");
        System.out.print(mass[0][2] + " ");
        System.out.print(mass[0][3] + " ");
        System.out.println();
        System.out.print(mass[1][0] + " ");
        System.out.print(mass[1][1] + " ");
        System.out.print(mass[1][2] + " ");
        System.out.print(mass[1][3] + " ");
        System.out.println();
        System.out.print(mass[2][0] + " ");
        System.out.print(mass[2][1] + " ");
        System.out.print(mass[2][2] + " ");
        System.out.print(mass[2][3] + " ");
        System.out.println();
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mass[i][j] + " ");

            }
            System.out.println();
        }

    }
}
