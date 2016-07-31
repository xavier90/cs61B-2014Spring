package lab2;

import java.io.*;
public class Nuke2 {

	public static void main(String [] arg) throws Exception {
		BufferedReader keyboard;
		String inputWord;
		
		keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please enter a word without space:");
		System.out.flush();
		inputWord = keyboard.readLine();
		
		System.out.println(inputWord.substring(0,1) + inputWord.substring(2));
		
		
	}
	
	
}
