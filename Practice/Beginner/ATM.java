/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		float Y = sc.nextFloat();
		if ((X%5 == 0) && (Y >= X + 0.50)) {
		    System.out.printf("%.2f",Y - X - 0.50);
		} else {
		    System.out.printf("%.2f",Y);
		}
	}
}
