//经典的打印金字塔
//使用for loop完成下面的案例
//请编写一个程序，可以接受一个整数，表示层数（totalLevel），打印出金字塔

public class pyramid {

            
       public static void main (String [] args) { 

       	for(int i = 1; i <= 5; i++){

       		for(int k = 1; k <=5-i; k++){
       			System.out.print(" ");
       		}
       		for(int j = 1;j <= 2 * i - 1;j++){
       			if(j == 1 || j == 2 * i - 1 || i == 5){
       			System.out.print("*");	
       		} else {System.out.print(" ");

       		}

       		
       		}
            System.out.println("");

       	}
        }
  
}

