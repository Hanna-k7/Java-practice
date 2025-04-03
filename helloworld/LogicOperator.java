/**
 * 演示逻辑运算符的使用
*/


            //编写一个main方法
       public static void main (String [] args) { 
        


         //&& 和 & 的案例演示
          //&&：短路与：两个条件都public class LogicOperator {
为真，即为true，否则为false
          //&：逻辑与：两个条件都为真，即为true，否则为false

  //&&的使用  
         int age = 50;
         if (age > 20 && age < 90){

         	 System.out.println("ok100");
         	}
// & 的使用

         	if (age > 20 & age < 90) {
         		 System.out.println("ok200");
         	}
        System.out.println("程序结束");
  }
}
