package exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		//Representing the file
		File file = new File("test1.txt");
		
		//Create the file
		if(!file.exists()) {file.createNewFile();}

		// FOUR WAYS TO WRITE INTO A FILE:
		
		//Writing the text into the file using FileWrite class
		//FileWriter fw = new FileWriter(file);
		//fw.write("My name is Daniele....\nI like to program in Java");
		//fw.flush();
		
		//Writing the text into the file using BufferedWriter class
		/*FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("My name is Daniele....");
		bw.newLine();
		bw.write("I am a Bills fan");
		bw.flush();*/
		
		//Writing the text into the file using PrintWriter class
		/*PrintWriter pw = new PrintWriter(file);
		pw.println("My name is Daniele");
		pw.print("I am a tester");
		pw.flush();*/
		
		//Writing the text into the file using FileOutputStream class
		FileOutputStream fos = new FileOutputStream(file);
		String str = "My name is Daniele.\nI am a boy";
		fos.write(str.getBytes());
		
		
		System.out.println("End program!");
	}

}
