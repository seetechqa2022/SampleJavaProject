package com.seetech.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("filename.txt");
			fileWriter.write("File in java might be tricky!!");
			fileWriter.close();
			System.out.println("Succfully write to the file!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
