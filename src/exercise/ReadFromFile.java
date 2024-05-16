package exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		
		File cars = new File("cars.txt");
		FileReader fr = new FileReader(cars);
		BufferedReader br = new BufferedReader(fr);
		int count = 0;
		String str = br.readLine();
		while(str!=null) {
			System.out.println(str);
			if(str.toLowerCase().contains("ferrari")) {count++;}
			str = br.readLine();
		}
		System.out.println("=================");
		if(count>0) {
			System.out.println("Ferrari is present and available in the showroom!");
		}else {
			System.out.println("Ferrari is NOT available!");
		}
		br.close();
	}

}
