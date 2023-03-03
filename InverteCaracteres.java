package provaJobRotation;

import java.util.Scanner;

public class InvertCaracteres {
	

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Digite uma string para inverter: ");
	        String texto = input.nextLine();
	        
	        char[] caracteres = texto.toCharArray();
	        int tamanho = caracteres.length;
	        for (int i = 0; i < tamanho/2; i++) {
	            char temp = caracteres[i];
	            caracteres[i] = caracteres[tamanho-1-i];
	            caracteres[tamanho-1-i] = temp;
	        }
	        String invertido = new String(caracteres);
	        System.out.println("Texto invertido: " + invertido);
	  }

}



