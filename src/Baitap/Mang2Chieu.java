package Baitap;

import java.util.*;

public class Mang2Chieu {
    static int arr[][] = new int[20][20];

    public static void printArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // In xuống dòng sau khi hoàn thành một hàng
        }
    }

    public static void Seach(Scanner scanner) {
        System.out.println("Nhập số cần tìm kiếm");
        Map<Integer, Integer> ArraySeach=new HashMap<>();
        int Seach = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == Seach) {
                    ArraySeach.put(i,j);
                }
            }
        }
        System.out.println(ArraySeach);
    }


}
