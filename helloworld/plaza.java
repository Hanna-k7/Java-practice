/* Problem Statement
In Shanghai, there’s a famous rectangular plaza called "People’s Square" where locals love to gather. The plaza is n meters long and m meters wide. To celebrate the city’s anniversary, the local government decides to pave the plaza with square stone tiles. Each tile is a × a meters in size.

Your task is to figure out the smallest number of tiles needed to cover the entire plaza. It’s okay if the tiles cover a bit more area than the plaza itself, but the whole plaza must be fully paved. You cannot cut or break the tiles, and the sides of the tiles must line up with the sides of the plaza.

Input
The input has three positive integers on one line:

n (the length of the plaza in meters),
m (the width of the plaza in meters),
a (the size of each square tile in meters).
(1 ≤ n, m, a ≤ 10^9)
Output
Print the smallest number of tiles needed to pave the plaza.

Examples:

Input: 6 6 4
Output: 4
(A 6×6 plaza with 4×4 tiles needs 2 tiles along the length and 2 along the width, so 2 × 2 = 4 tiles.)

Input: 1 1 1
Output: 1
(A tiny 1×1 plaza with 1×1 tiles needs just 1 tile.)

Input: 5 5 2
Output: 9
(A 5×5 plaza with 2×2 tiles needs 3 tiles along each side, so 3 × 3 = 9 tiles.)

Input: 10 1 3
Output: 4
(A 10×1 plaza with 3×3 tiles needs 4 tiles along the length and 1 along the width, so 4 × 1 = 4 tiles.)

Input: 1000000000 1000000000 1000000000
Output: 1
(A huge 10^9 × 10^9 plaza with 10^9 × 10^9 tiles needs just 1 tile.)

问题描述
在上海，有一个著名的矩形广场叫“人民广场”，当地人喜欢在这里聚会。广场长 n 米，宽 m 米。为了庆祝城市的周年纪念，市政府决定用正方形的石砖来铺满广场。每块石砖的大小是 a × a 米。

你的任务是算出最少需要多少块石砖来覆盖整个广场。如果石砖覆盖的面积比广场大一点是可以的，但整个广场必须被完全覆盖。不允许剪裁或打破石砖，石砖的边必须与广场的边平行。

输入
输入一行有三个正整数：

n（广场的长度，单位：米），
m（广场的宽度，单位：米），
a（每块正方形石砖的边长，单位：米）。
(1 ≤ n, m, a ≤ 10^9)
输出
输出一个整数，表示最少需要的石砖数量。

示例

输入: 6 6 4
输出: 4
(一个 6×6 的广场，用 4×4 的石砖，长度需要 2 块，宽度需要 2 块，所以 2 × 2 = 4 块。)

输入: 1 1 1
输出: 1
(一个 1×1 的小广场，用 1×1 的石砖，只需要 1 块。)

输入: 5 5 2
输出: 9
(一个 5×5 的广场，用 2×2 的石砖，每边需要 3 块，所以 3 × 3 = 9 块。)

输入: 10 1 3
输出: 4
(一个 10×1 的广场，用 3×3 的石砖，长度需要 4 块，宽度需要 1 块，所以 4 × 1 = 4 块。)

输入: 1000000000 1000000000 1000000000
输出: 1
(一个巨大的 10^9 × 10^9 的广场，用 10^9 × 10^9 的石砖，只需要 1 块。) */
import java.util.Scanner;
public class plaza {

            //编写一个main方法
       public static void main (String [] args) { 
       	Scanner myScanner = new Scanner(System.in);
       	
       	System.out.println("length");
       	int n = myScanner.nextInt();
       	System.out.println("width");
       	int m = myScanner.nextInt();	
       	System.out.println("square");
       	int a = myScanner.nextInt();
       	
       		System.out.println("tiles needed=" + ((int)n/a + 1)*((int)m/a + 1));
       	}
         
    }     



