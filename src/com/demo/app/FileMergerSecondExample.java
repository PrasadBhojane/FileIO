package com.demo.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMergerSecondExample {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("file4.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
		
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		
		while((line1!=null)||(line2!=null)) {
			if(line1!=null) { //to avoid printing null in file4.txt
				pw.println(line1);
				line1=br1.readLine();
			}
			if(line2!=null) { //to avoid printing null in file4.txt
				pw.println(line2);
				line2=br2.readLine();
			}
		}
		pw.flush();
		br1.close();
		br2.close();
		pw.close();
	}
}
//durga vid no.119
//code ran and file4.txt created and data written in the same. check current folder.
