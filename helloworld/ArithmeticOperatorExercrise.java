


public class ArithmeticOperatorExercise {

            //编写一个main方法
       public static void main (String [] args) { 
// 思路
       	//1.需求：假如行业59天放假，问：合xx个星期零xx天
       	//2.思路分析
       	//（1）使用int 变量 days 来保存天数
       	//（2）一个星期7天 星期数weeks：days/7 零 xx天leftdays days % 7
       	//（3）输出
       	//3.走代码

       	int days = 59;
       	int weeks = days / 7;
       	int leftdays = days % 7;

         System.out.println(days + "天 合" + weeks + "星期零" + leftdays + "天");
  }
}
