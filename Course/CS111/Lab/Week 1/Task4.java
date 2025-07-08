import java.io.*;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int array_2d[][] = new int[row][col];
        int array_1d[] = new int[row * col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array_2d[i][j] = scanner.nextInt();
            }
        }

        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array_1d[index++] = array_2d[i][j];
            }
        }

        System.out.println("New array: ");
        for (int i = 0; i < array_1d.length; i++) {
            if (i == array_1d.length - 1) {
                System.out.print(array_1d[i]);
            } else {
                System.out.print(array_1d[i] + " ");
            }
        }

        scanner.close();

    }
}
