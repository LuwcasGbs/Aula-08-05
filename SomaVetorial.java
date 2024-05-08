package Aula0805;

import java.util.Scanner;

public class SomaVetorial {

	public static void main(String[] args) {
		int a[] = new int [5];
		int soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i =0; i<5; i++) {
			System.out.print("Informe o valor da posição "+i+":");
			a[i] = ler.nextInt();
			soma =soma+a[i];
			System.out.println("A soma dos números é: "+soma);
		}
		
		if (soma>15) {
			System.out.println("O valor da soma é "+soma);
		}
		ler.close();

	}

}
