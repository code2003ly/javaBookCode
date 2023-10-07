package unit3;

import java.util.Scanner;

public class Pro3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入a,b,c
        System.out.println("Please enter a,b and c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        //计算delta判别式
        double delta = b*b-4*a*c;
        //判断
        if(delta>0){
            //两个不同根，计算r1,r2
            double r1 = (-b+Math.sqrt(delta))/(2*a);
            double r2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.printf("r1=%.6f    r2=%.6f",r1,r2);
        } else if (delta<0) {
            //没有实数根
            System.out.println("The equation has no real roots");
        }else{
            //只有一个根
            double r = (-b+Math.sqrt(delta))/(2*a);
            System.out.printf("r=%.6f",r);
        }
    }
}
