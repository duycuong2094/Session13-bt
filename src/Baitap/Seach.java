package Baitap;

import java.util.Scanner;

public class Seach extends Bai1{
    public static void Seach(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số muốn tìm kiếm ");
        int seach=scanner.nextInt();
        for (int i = 0 ; i<arr.length;i++){
            if (arr[i]==seach){
                System.out.println(" Tìm thấy " + seach+ " ở vị trí thứ " +(i+1)+ " trong mảng arr");
                break;
            }else if(arr[i]!=seach&&i==arr.length-1){
                System.out.println("Không tìm thấy " + seach +" trong mảng arr");
            }
        }
    }
}
