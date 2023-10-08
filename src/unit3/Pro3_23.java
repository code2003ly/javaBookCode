package unit3;

import java.util.Scanner;

public class Pro3_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入坐标
        System.out.print("Enter a point with two coordinates:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        //判断是否在矩形区域里
        if(Math.abs(x)<5&&Math.abs(y)<2.5){
            System.out.println("Point ("+x+","+y+") is in the rectangle");
        }else{
            System.out.println("Point ("+x+","+y+") is not in the rectangle");
        }
    }
}
