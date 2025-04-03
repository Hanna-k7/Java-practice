// 1-100以内的数求和，求出当和第一次大于20的当前数（for+break）

public class BreakExercise {

	// 思路分析
	// 1 循环1-100，求和sum
	//2 当sum 》20时， 记录下当前数，如何break
	//3 在for循环外部，定义变量n，把当前i赋给n
 
       public static void main (String [] args) {

        int sum = 0; //累计和
        int n = 0; //n初始化为0
       	for(int i = 1; i < 100; i++){ //i的作用范围只在for{}里
       	sum +=i; 
          if(sum > 20){
 			System.out.println("total > 20 i=" + i);
  			n = i; //在此情况下 n = i
  			break;
  		}

  }
   System.out.println("current=" + n);
}

}