package net.ivanlopez;

import java.util.Scanner;

public class cincNumeros {	
		

public static void main(String[] args){
Scanner lector = new Scanner(System.in);
	System.out.println("Escriu 5 numeros");
int contador=0;	
while (contador<5){	
	int n1=lector.nextInt();
	
	int numero=n1;
	contador++;
	if (numero>n1){
	int	mespetit=numero;
		System.out.println(mespetit);
	}
}
		
	
	
}}
