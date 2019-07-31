import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter " + array.length + "rows and " + array[0].length + " colums");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("nhap phan tu array[" + i + "," + j + "]= ");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("tong duong cheo chinh la: " + sum);
    }
}
