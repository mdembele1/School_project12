package org.perscholas.Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOEx2 {

	public static void main(String[] args) {
		Path file =null;
		BufferedReader bufferedReader =null;
		try {
			file = Paths.get("C:\\Users\\mamadou\\Desktop\\test\\Booking_Ride_Website_mysql_Mamadou.txt");
			InputStream inputStream =Files.newInputStream(file);
			bufferedReader = new BufferedReader(new InputStreamReader (inputStream));
			System.out.println("Reading the first Line of testout.txt file: "+ bufferedReader.readLine());
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			bufferedReader.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			}
	
		}

	}
}



