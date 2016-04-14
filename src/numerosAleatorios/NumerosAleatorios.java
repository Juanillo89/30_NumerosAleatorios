package numerosAleatorios;

import java.util.Random;

public class NumerosAleatorios
{
	
	public static void main(String[] args)
	{
		Random ramd = new Random();
		int[] numeros = new int[10];
		int contNoRepetidos = 0;
		int aux;
		boolean repetido;	
		while(contNoRepetidos < numeros.length)
		{
			aux = ramd.nextInt(100) + 1;
			repetido = false;
			for(int i = 0; i < numeros.length && !repetido;  i++)
			{
				if(aux == numeros[i])
					repetido = true;
			}
			if(!repetido)
			{
				numeros[contNoRepetidos] = aux;
				contNoRepetidos++;
			}	
		}
		System.out.println("Los 10 números aleatorios son:");
		for(int i = 0; i < numeros.length;  i++)
		{
			System.out.println(numeros[i]);
		}
	}
}

