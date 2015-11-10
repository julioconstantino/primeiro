package com.fluxo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) throws IOException {
		Scanner imput = new Scanner(System.in);
		int i, n;
		
		System.out.println("Informe o número para tabuada: ");
		n = imput.nextInt();
		
		FileWriter arq = new FileWriter("k:\\marcus.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		gravarArq.println("--Resultado--"); 
		System.out.println(" ");

		
		for(i=1; i<=10; i++) { 
			gravarArq.println(n + " X " + i + "  = " + (n*i));
		}
		arq.close();
		
	}
}
