package com.filereader.and.filewriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		
		char[] ch = new char[(int)f.length()]; //f.length() gives no. of characters. 
//		f.length() return type is long and given method return type is int. so long is typecasted to int.
		
		FileReader fr = new FileReader(f);
		fr.read(ch);
		
		for(char ch1: ch) {
			System.out.print(ch1);
		}
		System.out.println();
		
		System.out.println("***********************************");
		
//		***Second read method***
		
		FileReader fr1 = new FileReader("abc.txt");
		int i = fr1.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr1.read();
		}
	}
}
//durga vid no. 118
