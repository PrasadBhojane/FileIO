package com.demo.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExtractor {

	public static void main(String[] args) throws IOException {
		PrintWriter printwriter = new PrintWriter("output.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
		String line1 = br1.readLine();
		while (line1 != null) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));
			String deleteLine = br2.readLine();
			while (deleteLine != null) {
				if (line1.equals(deleteLine)) {
					available = true;
					break;
				}
				deleteLine = br2.readLine();
			}
			if (available == false) {
				printwriter.println(line1);
			}
			line1 = br1.readLine();
		}
		printwriter.flush();
	}
}
//durga vid no. 120
//program to perform file extraction operation.
//code ran and output.txt file created and saved successfully.