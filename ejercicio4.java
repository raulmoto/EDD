package divorcios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		String cadena = "Hola";
		reverse(cadena);
		Scanner scn = new Scanner(System.in);
		System.out.println("inserte un numero par");
		int num=0;
		 num = scn.nextInt();
		if(num%2 !=0) {
			System.out.println("no es par");
		}else {
			System.out.println("es par");
			tablaMultiplicar(num);
		}
	

	}
	
	
	private static int tablaMultiplicar(int num) {
		int i = 1;
		if(i>10) {
			System.out.println("i vale : " +i);
		}else {
			System.out.println("por "+i+ num*i);
			tablaMultiplicar(i);
		}
		
		i++;
		return i;
		
		
		
		
	}
	
	public static void reverse(String cadena) {
		//System.out.println(reverseUp(cadena, 0));
		System.out.println(reverseDown(cadena, cadena.length()));
	}
	
	private static String reverseDown(String cadena, int i) {
		if(i > 0) {
			return cadena.substring(i - 1, i) + reverseDown(cadena, i - 1);
			//HOLA
		} return "";
	}

}
