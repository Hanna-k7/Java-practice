
//计算1-100的和


public class dowhileExercise {

            //编写一个main方法
       public static void main (String [] args) { 
     
       int i = 1; //
       int sum = 0;
       do{ 
       	  sum += i; //累加当前数字
       	  i++;
       }while(i <= 100);

         System.out.println("1到100的和=" + sum);
  }
}

