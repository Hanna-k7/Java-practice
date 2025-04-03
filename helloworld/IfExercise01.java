




public class IfExercise01 {

            //编写一个main方法
       public static void main (String [] args) { 

        double num1 = 9;
        double num2 = 15;

        if (num1 > 10.0 && num2 < 20.0) {
          System.out.println("两个数和=" +(num1 + num2));
        }
        else 
         System.out.println("Hello, World~");
  
       
        int i1 = 6;
        int i2 = 9;
        int sum = i1 + i2;
        if (sum % 3 == 0 && sum % 5 == 0) {
        System.out.println("快乐万岁");
        }
        else {
          System.out.println("pity");

        }

        int year = 2009;
        
        if ( int % 4 == 0 && year % 100 !=0 ) || ( year % 400 == 0 ){
          
        System.out.println( year + "是闰年");
       
        }
       
        else {
        System.out.println(year + "不是闰年");
      }


      
  }

}
