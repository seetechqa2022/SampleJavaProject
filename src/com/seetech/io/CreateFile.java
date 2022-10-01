package com.seetech.io;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		File file = new File("filename.txt");
		
		try {
			boolean flag = file.createNewFile();
			if(flag) {
				System.out.println("File is created: "+file.getName());
			}else {
				System.out.println("File already created!");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}

}
