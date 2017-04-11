package com.Bridgelabz.javaPrograms;

import java.util.Scanner;

public class StopWatch 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char choice;
		long stopTime=0;
		long startTime=0;

		System.out.println("Stopwatch start...");
		startTime=start();

		System.out.print("Do u want to stop watch press y : ");
		choice =sc.next().charAt(0);

		if(choice=='y' || choice=='Y')
		{
			stopTime=stop();
		}

		long ealapsedTime=(long) ((stopTime-startTime)/1000.00);
		System.out.println("Elapsed Time is : "+ealapsedTime+" second");
		sc.close();

	}
	
	private static long start() {
		long startTime=System.currentTimeMillis();
		System.out.println(startTime);
		return startTime;
	}

	private static long stop() 
	{
		long stopTime=System.currentTimeMillis();
		System.out.println(stopTime);
		return stopTime;
	}


}
