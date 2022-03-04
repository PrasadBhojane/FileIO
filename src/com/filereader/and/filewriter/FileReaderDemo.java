package com.filereader.and.filewriter;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("abc.txt");
//		int i = fr.read();
//		System.out.println(i); // returns unicode(i.e. int) value for first char in file.. i.e. 100 = d
		int j = fr.read();
		while (j != -1) { // -1 defines invalid data which means file reading complete.
			System.out.print((char) j); //typecasting int to char
			j = fr.read();
		}
	}
}
//durga vid no.118