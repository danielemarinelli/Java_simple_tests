package exercise;

import java.io.IOException;

public class NotePad {

	public static void main(String[] args) {
		
		ProcessBuilder pb = new ProcessBuilder("C:\\Windows\\System32\\notepad.exe");
		try {
			pb.start();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
