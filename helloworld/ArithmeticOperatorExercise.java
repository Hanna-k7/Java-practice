


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




         //1。需求 定义一个额变量保存华氏温度，
          //华氏温度转换摄氏温度的公式为5/9*（华氏温-100），请求出华氏温度对应的摄氏温度.*考虑数学公式和java语言的特性
             //这里要用5.0，否则 5/9 会为0
         //2 思路分析
           // （1） 先定义用double f 变量 保存华氏温度
          // （2） 根据给出的公式，进行计算即可
          // 将得到的结果保存到double t
         //3 走代码

         double f = 234.6;
         double t = 5.0 / 9 * (f - 100);
         System.out.println("华氏温度" + f + "对应的摄氏温度=" + t);
         	
     


  }
}
