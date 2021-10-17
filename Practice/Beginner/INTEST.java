/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int count = 0;
		
		while(n-- > 0) {
		    int x = Integer.parseInt(br.readLine());
		    if (x % k == 0)
		        count++;
		}
		System.out.println(count);
		
	}
}
