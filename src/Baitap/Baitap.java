package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bai1 arr=new Bai1();
        Seach seach=new Seach();
        Mang2Chieu mang2Chieu=new Mang2Chieu();
        System.out.println("Mảng là " + Arrays.toString(Bai1.arr));
        System.out.println("Số lớn nhất là " +Arrays.toString(arr.Max()));
        System.out.println("Số nhỏ nhất là " +Arrays.toString(arr.Min()));
        seach.Seach();
        mang2Chieu.printArray();
        mang2Chieu.Seach(scanner);

    }
}
