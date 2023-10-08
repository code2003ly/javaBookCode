package unit3;

import java.util.Scanner;

public class Pro3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入
        System.out.println("Enter a three-digit integer:");
        String str = sc.next();
        //判断
        if (checkPalindrome(str)){
            System.out.println(str+" is a palindrome.");
        }else{
            System.out.println(str+" is not a palindrome.");
        }

    }
    //方法一:字符串逆置法
    public static boolean checkPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}
