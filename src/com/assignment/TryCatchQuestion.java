
package com.assignment;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchQuestion {
	public static void main(String[] args) {

	
		try {
			
						
			FileOutputStream fos=new FileOutputStream("file2.txt"); //,true
			String msg="\nhello!!!! world. This is Shikha Parmar";
			byte[] String=msg.getBytes();
			fos.write(String);
			fos.flush();
			fos.close();
			
			System.out.println("Data is written into the file");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		}

}
