

public class ArithmeticOperator{

            //编写一个main方法
       public static void main (String [] args) { 
           System.out.println(10 / 4);  //从数学来看是2.5， 但是在java中是2
           System.out.println(10.0 / 4); //java中是2.5， 因为10.0是一个double

         // 注释快捷键，command + /，再次输入取消
            double d = 10 / 4; //Java中10 / 4 = 2， 2=》2.0，java中10/2=2，这里是个double，所以是2.0
            System.out.println(d); // 会输出2.0。2是int，2.0是double

     //取模，取余
     // 在java中，%（取模）的本质要看一个公式，a % b = a - a / b * b 
     // -10 / 3 =》 -10- （-10） / 3 * 3 = 1


       System.out.println(10 % 3); // 1
       System.out.println(-10 % 3);//-1
       System.out.println(10 % -3);//1


//++的使用

int i = 10;
i++; // 自增  等价于 i = i + 1；=》11
++i; //也是自增，等价于 i = i + 1； =〉12 //这时候输出应该为 system.out.println("i=" + i) =>12
//作为独立的语句使用，前++和后++完全一样
System.out.println("i=" + i); // 11

/*作为表达式使用
前++：++i先自增后赋值
后++：i++先赋值后自增
*/

int j = 8;
// int k = ++j; // 等价 j = j + 1； k=j
// int k = j++; 等价 k = j； 然后j = j + 1 输出结果为 k=8 j=9

System.out.println("k=" + k + "j=" + j); // 9 9

  }
}

/*面试题
 int i = 1
 i = i++
 system.out.println（i）；

 i赋值给自己，这种情况下，规则使用临时变量
   * 先把i保存在一个临时变量temp中，i = temp；
   * 再自增i = i + 1； 此时i是2
   * temp的值再赋给i，i = temp；所以输出为1
  */

