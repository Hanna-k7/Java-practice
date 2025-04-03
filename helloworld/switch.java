
import java.util.Scanner;
public class switch {

            //编写一个main方法
       public static void main (String [] args) { 
        Scanner myScanner = new Scanner(System.in); 
         System.out.println("put in a letter(a-g)");
     	char c1 = myScanner.next().charAt(0);
     switch(c1) {
     	case'a':
     		System.out.println("monday");
     		break;
     	case 'b':
     	    System.out.println("tuesday");
     	    break;	
     	 default:
     	 	System.out.println("again");
     	}

  }
}
