package unit3;

import java.util.Scanner;

public class Pro3_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入
        System.out.println("Enter a point's x- and y- coordinates:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        //判断
        if(x>0&&y>0&&(y+0.5*x)<100){
            System.out.println("The point is in the triangle.");
        }else {
            System.out.println("The point is not int the triangle.");
        }
    }
}
