package divorcios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		try {
			FileReader entrada = new FileReader("C:/Users/RAUL-CDH/Desktop/HablanosDelDon.txt");
			int c = entrada.read();
			while (c!= -1) {
				c=entrada.read();
				char letra = (char)c;
				System.out.println(letra);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("no se ha encontrado el archivo");
		}
		
	
		
}
}
