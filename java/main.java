import java.io.*;
import java.util.Scanner;

public class main {
	private static int count;
	public static void main(String args[]){
		try {
			Scanner inFile = new Scanner(new FileReader (args[0]));
			while (inFile.hasNextInt()){
				int i = inFile.nextInt();
				System.out.println(i);
				count++;
			}//while
		}//try 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//catch
		Scanner putInFile;
		LinkedListStack myStack = new LinkedListStack(count);
		try {
			putInFile = new Scanner (new FileReader(args[0]));
			while (putInFile.hasNextInt()){
				int j = putInFile.nextInt();
				System.out.println("pushing " + j);
				myStack.push(j);
			}//while
			while (!myStack.isEmpty()){
				System.out.print("pop ");
				myStack.pop();
			}//while
		}//try
			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}//catch
	}//main
}//class
