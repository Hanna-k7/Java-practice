

import java.util.Scanner;

public class Nested {

            //编写一个main方法
       public static void main (String [] args) { 

       	Scanner myScanner = new Scanner (System.in);
         System.out.println("请输入月份(1~12)");
         int month = myScanner.nextInt();
     if(month > 4 && month < 10) {
         	System.out.println("旺季");
         int age = myScanner.nextInt(); 	
     
     	if(age > 16 && age < 60)
     		System.out.println("price60");

     	else if (age < 18)	
     		System.out.println("price30");

     	else if (age > 60)
     		System.out.println("price20");
     	}
     	System.out.println("welcome");

   

    else System.out.println("淡季");
         int age = myScanner.nextInt();
        if (age > 18 && age < 60){
         System.out.println("price40");
        }
       else
         System.out.println("price 20");
  }
}
