package com.Bridgelabz.javaPrograms;
import java.io.IOException;

import com.Bridgelabz.utility.Utility;


/**
 * @author bridgeit
 *
 */
public class TwoDArray
{
	public static void main(String[] args) throws IOException 
	{
		/*FileReader fr = null;
		try {
			fr = new FileReader("input.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader br=new BufferedReader(fr);
		String line;
		String s = "";


		while((line=br.readLine())!=null)
		{
			s=s+line;
		}
		//System.out.println(s);
		
*/		
		Utility u=new Utility();
		String s=u.FileRead("input.txt");
		s=s.trim();
		s=s.replaceAll("/n", "");
		s=s.trim();
		String[] s1=s.split(" ");
		

		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println();
		int[] intarray = new int[s1.length];
		
		for(int i=0;i<s1.length-2;i++)
		{
			intarray[i]=Integer.parseInt(s1[i]);
		}
		int[][] TwoArray =new int[3][3];
		
		int count=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				TwoArray[i][j]=intarray[count];
				count++;
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(TwoArray[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
