package org.perscholas.Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateTempFile {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	File temp;
	
	try
	{
		temp = File.createTempFile("C:\\Users\\mamadou\\Desktop\\test", ".txt");
		System.out.println("Temp file created : "+ temp.getAbsolutePath());
		int x=0;
		while (x!=1) {
			System.out.println(" enter a number:");
			x=input.nextInt();
		}
		
		temp.deleteOnExit(); // Delete on runtime exit
		
		System.out.println("Temp file exists : " + temp.exists());
	}catch (IOException e)
	{
		e.printStackTrace();
	}

	}

}
