package com.filereader.and.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("abc.txt", true); //append method
		
		//this method overrides data in file.
		FileWriter fw = new FileWriter("abc.txt"); // if abc.txt is not avl then it will create new file and write data.
		fw.write(100); //adding a single character i.e. corresponding char to 100 is d.
		fw.write("urga\nSoftwareSolutions");
		fw.write('\n'); // to print blank line
		
		char[]ch1 = {'a','b','c'};
		fw.write(ch1);
		fw.write('\n');
		fw.flush(); //to ensure that entire data will be added to the file.
		fw.close();	
	}
}
//program to write data in current directory.
//durga vid no.117