package org.perscholas.Files;

import java.io.File;

public class ListofFileName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\mamadou\\Desktop\\test");
		String [] fileList = file.list();
		for (String name:fileList) {
			System.out.println(name);
		}
		

	}

}
