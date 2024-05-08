package Aula0805;

import java.util.Scanner;

public class SVetoresBaguncados {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[] = new int [5];
		int b[] = new int [5];
		int c[] = new int [10];
		
		System.out.println("------------------------------------------");
		System.out.println("Vetor A");
		System.out.println("------------------------------------------");
		
		for (int i =0; i<5; i++) {
			System.out.print("Informe o valor da posição "+i+":");
			a[i] = ler.nextInt();	
	
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Vetor B");
		System.out.println("------------------------------------------");
		
		for (int i =0; i<5; i++) {
			System.out.print("Informe o valor da posição "+i+":");
			b[i] = ler.nextInt();	
	}
		
		System.out.println("------------------------------------------");
		System.out.println("Vetor C");
		System.out.println("------------------------------------------");
		
		for (int i =0; i<5; i++) {
			c[i]=(a[i]);
			System.out.println(c[i]);
		}
		for (int i =0; i<5; i++) {
			c[i]=(b[i]);
			System.out.println(c[i]);
	}
		

ler.close();
	}
	}
