package unit3;

import java.util.Scanner;

public class Pro3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入三个数
        System.out.print("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //升序排序
        int min = a<b ? (a<c?a:c):(b<c?b:c);
        int max = a>b ? (a>c?a:c):(b>c?b:c);
        int mid = (a!=min&&a!=max)?a:((b!=min&&b!=max)?b:c);
        //升序输出三个数
        System.out.println(min+" "+mid+" "+max);
    }
}


