package org.perscholas.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JavaIo {

	public static void main(String[] args) throws IOException {		
		Scanner s = null;
		BufferedReader bufferStream = null;
		FileReader inputStream = null;
		
		//1-File location
		File readin = new File("C:\\Users\\mamadou\\Desktop\\Booking_Ride_Website_mysql_Mamadou.txt");
				
		try {
			//2-Input stream using File location
			inputStream = new FileReader(readin);
			
			//3-Create Buffer Stream using Input Stream
			bufferStream = new BufferedReader(inputStream);
			
			//4-Create Scanner object using Buffer stream
			s = new Scanner(bufferStream);
			
			//5-Read the file using scanner object
			while(s.hasNext()) {
				
				//6-Print out to the console
				System.out.println(s.nextLine());
			}
			
		} finally {
			if (s !=null) {
				s.close();
			}
		}
	}
}
