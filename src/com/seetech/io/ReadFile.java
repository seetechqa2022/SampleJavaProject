package com.seetech.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		try {
			File file = new File("filename.txt");
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String s = scanner.nextLine();
				System.out.println(s);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
