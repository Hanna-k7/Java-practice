//多重循环控制
//统计三个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分【学生的成绩从键盘输入】
//2.统计三个班及格人数，每个班有五名同学


//思路分析：
//化繁为简：1.先计算一个班，5个学生的成绩，使用for
//1.1 创建scanner对象，接受用户的输入。因为会反复使用，所以就放在for loop的外面
//1.2得到该班级的平均分，定义一个double sum，把该班级5个学生的成绩累计

//2 统计三个班（每个班5个学生）用一个for loop （int i =1； i《=3 ）
//3 所有班级的平均分
//3.1 定一一个变量，double totalscore 累计所有学生的成绩
//3.2 当多重循环结束，totalscore/（3*5）
//4.统计三个班及格人数
//4.1 定义变量 int passnumber = 0； 当有一个学生成绩》60，passnumber++
//4.2 如果 〉=60，passnum++
//5 优化

import java.util.Scanner;

public class MulForExercise01 {
   
       public static void main (String [] args) { 		

     Scanner myScanner = new Scanner (System.in);
     double totalScore = 0; //累计所有学生的成绩
     int passNum = 0; //累计及格人数
     for(int i = 1; i <=3; i++) {//i表示班级
     double sum = 0; //一个班级的总分
     for(int j = 1; j <=5; j++) {//j表示学生
       		System.out.println("请输入第"+i+"个班的第" +j+"个学生的成绩");
 			double score = myScanner.nextDouble();//这里接受到了学生成绩，立马判断是否passnumber++
 			//当有一个学生成绩》=60，passnumber++
 			if(score >= 60){
 				passNum++;
 			}
 			sum += score; //5个学生的累计成绩
        	System.out.println("成绩为" + score);
      }
  	//因为sum是5个学生的总成绩
      System.out.println("sum" + sum + "平均分=" + (sum/5));
     // 把sum累计到totalscore（上面代码中的sum累计的是各个班的成绩）
      totalScore += sum;
  }
    System.out.println("三个班总分=" + totalScore + "平均分=" + (totalScore/15));
    System.out.println("passnum=" + passNum);
}
}
