
//统计1-200之间能被5整除但不能被3整除的个数


public class dowhileExercise01 {

            //编写一个main方法
       public static void main (String [] args) { 

       	int i = 1;
       	int count = 0;

       	do{
       		if(i % 5 == 0 && i % 3 !=0){
 		System.out.println("i=" + i);
 		
 		count++;
 	}
 		i++;
   	}while(i <= 200);



         System.out.println("1-200之间=" + count);
  }
}

