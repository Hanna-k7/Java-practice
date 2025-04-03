
//对学生成绩大于60分的，输出合格，低于60分的输入不合格（注：输入的成绩不能大于100），提示 成绩/60
//解题：可以用if else(分支来完成)。 switch只可以用于常量，不可以用于范围。
//编程思路：
//如果成绩在【60，100】，（int）（成绩/60）=1
//如果成绩在【0，60】，（int）（成绩/60）=0
//**成绩肯定在0～100之间，所以加了if，else （这里也是编程思想的体现）





import java.util.Scanner;

public class switchExercise01 {
   public static void main(String []args){
  Scanner myScanner = new Scanner(System.in);
  System.out.println("put your score");
  double score = 88.5;

  if(score>=0 && score<=100) {
  
  switch ((int)(score/60)) {
    case 0 :
        System.out.println("buhege");
        break;
    case 1 :
    	System.out.println("hege");
  }
} else {
 System.out.println("输入有误");
 }
}
}

