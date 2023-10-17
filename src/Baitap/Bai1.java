package Baitap;

public class Bai1 {
     static  int  arr[] = new int[20];
   static int max = 0;
   static int min = 100;


    public Bai1() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }


    public  static int[] Max(){
    for (int so : arr){
        if(so>max){
            max=so;
        }
    }
        return new int[]{max};
    }
    public  static int[] Min(){
        for (int so : arr){
            if(so<min){
                min=so;
            }
        }
        return new int[]{min};
    }

}
