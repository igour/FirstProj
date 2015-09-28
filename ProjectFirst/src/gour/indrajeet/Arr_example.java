package gour.indrajeet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arr_example {
	
	void method1(){
		String [] str = {"indra","gour","indrajeet","jeetu"};
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	void method2() throws NumberFormatException, IOException {
		int [] I ;
		I = new int[4];
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		for (int j = 0; j < I.length; j++) {
			I[j]= Integer.parseInt(br.readLine());
		}
		br.close(); isr.close();
		
		System.out.println("input has been read by keyboard !!");
		System.out.println("reading the input int from int arr !!");
		for (int j = 0; j < I.length; j++) {
			System.out.println(I[j]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//new Arr_example().method1();
		new Arr_example().method2();
	}
}
