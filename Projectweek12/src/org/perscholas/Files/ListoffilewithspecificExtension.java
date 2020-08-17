package org.perscholas.Files;

import java.io.File;

public class ListoffilewithspecificExtension {

	public static void main(String[] args) {
	File file= new File ("C:\\Users\\mamadou\\Desktop\\test");
	 String []list=file.list();
	 
	 for (String f:list) {
		 if (f.toLowerCase().endsWith(".docx")) {
			 System.out.println(f);
		 }
	 }

	}

}
