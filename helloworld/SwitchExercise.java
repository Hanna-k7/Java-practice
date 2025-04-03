
import java.util. Scanner;


public class SwitchExercise {

  public static void main(String [] args) {
  	Scanner myScanner = new Scanner(System.in);
  	System.out.println("put a letter in");
  	char c1 = myScanner.next().charAt(0);
  switch(c1) {
  	case'a':
  	 System.out.println("A");
  	 break;
  	case'b':
  	 System.out.println("B"); 
 	 break;
 	case'c':
 		System.out.println("C");
 		break;
 	default:
 	  System.out.println("other");	

  }
	System.out.println("退出了switch，继续执行程序");





  }
 
}