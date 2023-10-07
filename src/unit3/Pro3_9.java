package unit3;

import java.util.Scanner;

public class Pro3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //九位数以字符串形式输入
        System.out.print("Enter the first 9 digits of an ISBM as integer:");
        String str = sc.next();
        //计算第十位数
        int sum = 0;
        for(int i =0;i<str.length();i++){
            sum+=(str.charAt(i)-'0')*(i+1);
        }
        int last = sum%11;
        //判断第十位数是不是10
        if(last==10){
            str+="X";
        }else{
            str+=last;
        }
        //输出
        System.out.println("The ISBM-10 number is "+str);
    }
}
