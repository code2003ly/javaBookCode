package unit3;

import java.util.Scanner;

public class Pro3_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入大矩形的中心坐标和宽高
        System.out.print("Enter r1's center x-,y-coordinates,width,and height:");
        double largeX = sc.nextDouble();
        double largeY = sc.nextDouble();
        double largeWidth = sc.nextDouble();
        double largeHeight = sc.nextDouble();
        //输入小矩形的中心坐标和宽高
        System.out.print("Enter r2's center x-,y-coordinates,width,and height:");
        double smallX = sc.nextDouble();
        double smallY = sc.nextDouble();
        double smallWidth = sc.nextDouble();
        double smallHeight = sc.nextDouble();
        //判断
        if(0.5*largeWidth-Math.abs(largeX-smallX)>=0.5*smallWidth&&0.5*largeHeight-Math.abs(largeY-smallY)>=0.5*smallHeight){
            //小矩形在大矩形内部
            System.out.println("r2 is inside r1.");
        } else if (Math.abs(largeX-smallX)>0.5*(smallWidth+largeWidth)&&Math.abs(largeY-smallY)>0.5*(smallHeight+largeHeight)) {
            //小矩形在大矩形外部
            System.out.println("r2 does not overlap r1.");
        }else{
            //两个矩形有重叠
            System.out.println("r2 overlaps r1.");
        }
    }
}
