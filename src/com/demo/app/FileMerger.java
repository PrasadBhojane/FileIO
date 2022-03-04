package com.demo.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileMerger {

	public static void main(String[] args)throws Exception {
		
		PrintWriter pw = new PrintWriter("file3.txt");
		
//		Reading first file data..
		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		String line = br.readLine();
		while (line!=null) {
			pw.println(line);
			line = br.readLine();
		}
		
//		Reading second file data..
		br = new BufferedReader(new FileReader("file2.txt")); 
		line = br.readLine();
		while(line!=null) {
//			Using same printwriter to avoid overriding data in the file, this line makes sure to append data and not override.
			pw.println(line);
			line=br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}
}
// durga vid no.119
// code ran and file3.txt created and data written in the same. check current folder.