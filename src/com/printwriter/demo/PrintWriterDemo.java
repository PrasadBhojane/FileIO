package com.printwriter.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("abc.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.println("durga");
		pw.flush();
		pw.close();
	}
}
//durga vid no.119