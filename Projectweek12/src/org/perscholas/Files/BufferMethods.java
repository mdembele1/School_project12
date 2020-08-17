package org.perscholas.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferMethods {

	public static void main(String[] args)  throws IOException{
		FileReader fr=new FileReader("C:\\Users\\mamadou\\Desktop\\test\\Booking_Ride_Website_mysql_Mamadou.txt");
		BufferedReader br=new BufferedReader(fr);
		char c[]=new char [21];
		
		//illustration marksupported() method
		
		if (br.markSupported()) {
			System.out.println("mark() method is supported");
			
			//illustrating mark method
			br.mark(100);
		}
		
		br.skip(8);
		

	}

}
