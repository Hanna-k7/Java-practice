
import java.util.Scanner;
public class switch01 { //命名不可以用switch，switch是一个保留关键词

            //编写一个main方法
       public static void main (String [] args) { 
        Scanner myScanner = new Scanner(System.in); 
         System.out.println("put in a letter(a-g)");
     	char c1 = myScanner.next().charAt(0);
     	//在java中，只要有值返回，就是一个表达式
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
 System.out.println("退出了switch，继续执行程序")； //退出的只是switch程序
  }
}
//switch 细节
//1.表达式数据类型，应该和case后的常量一致，或者是可以自动转换成可用互相比较的类型，比如输入的是字符，而常量是int
//2.switch（表达式）中的表达式的返回值必须是：byte short int char enum（枚举） String
//3. case子句中的值必须是常量（eg，1 ‘a’）或者是常量表达式（eg：‘b’+1），不能是变量
//4.default子句是可选的，当没有匹配的case时，执行defautl
//5.break语句用来在执行完一个case分支后使程序跳出switch语句块；如果没有break，程序会顺序执行到switch的结尾，除非遇到break语句