
package com.Bridgelabz.javaPrograms;
import java.util.Scanner;
class HarmonicNo
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("How many Nth Harmonic No. u want : ");
		int n=sc.nextInt();
		float sum=0;
		System.out.println("");
		for(int i=1;i<=n;i++)
		{
			System.out.print("1/"+i+"+");
			sum=sum + (float)1/i;
		}
		System.out.println(" = "+sum);
	}
}
