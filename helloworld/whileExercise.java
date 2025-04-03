
//打印1-100之间所有能被3整除的数




public class whileExercise{

	public static void main (String [] args){

	int i= 33;
	while(i>=1 && i<=100){
       if (i % 3 == 0){
      System.out.println("i" + i); 
	}	
	i++; //变量自增，一定要写到这个位置
   
	}
}
}