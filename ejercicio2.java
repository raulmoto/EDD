package divorcios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejercicio2 {
	/**
	 * pre: -- post: ESTE METODO HACE EL CONTEO DE UN FICHERO CSV Y HACE EL CONTEDO
	 * DE EL NUMERO TOTAL DE DIVORCIOS CON SEPARACION PRECIA EN EL AÑO 2019. EL
	 * NUMERO TOTAL DE DIVORCIOS SIN SEPARACION PRECIA EN EL AÑO 2018.
	 * 
	 */
	public static void main(String[] args) {
		// ALMACENO LA RUTA EN UN ESTRING PARA LUEGO LLAMARLO DESDE EL SCANNER
		String ruta = "C:/Users/RAUL-CDH/Desktop/Divorcios.csv";
		File file = new File(ruta);
		try {
			Scanner f = new Scanner(file);
			// RECORRO EL FICHERO Y PRIMERO ELIMINO LA PRIMERA LINEA CON UN BUCLE PARA
			// TRABAJAR MAS COMODO
			f.nextLine();
			String linea = f.nextLine();
			boolean VF = true;
			int divC = 0;
			int sinS18 = 0;
			String s = "Si";
			String n = "no";
			String fecha = "2019";
			String fecha1 = "2018";
			String fecha2 = "2013";
			while (f.hasNextLine()) {
				String linea1 = f.nextLine();
				if (VF == false) { // para eliminar la primera linea
					// PARA TENERLO TODO EN ORDEN Y EN CADA POSICION, LOS SEPARO POR PUNTO Y COMA
					String[] tabla = linea1.split(";");
					System.out.println(tabla[1]);
					// HAGO LA CONDICION PARA COMPROBAR SI EN LA PRIMERA POSICION TENGO UN "SI" Y
					// CON LA FECHA 2019 EN LA SEGUNDA POSICION
					if (tabla[1].equalsIgnoreCase(s) && tabla[2].equalsIgnoreCase(fecha)) {
						System.out.println("exito");
						divC++;
					} else if (tabla[1].equalsIgnoreCase(s) && !tabla[2].equalsIgnoreCase(fecha1)) {
						System.out.println("exito1");
						sinS18++;
					} else if (tabla[1].equalsIgnoreCase(s)) {
						String a = tabla[3];
						int a1 = Integer.parseInt(a);
					}
				} else {
					VF = false;
				}
			}
			// IMPRIMO POR PANTALLA EL RESULTADO
			System.out.println("El número total de divorcios CON separación previa en el año 2019.: " + divC);
			System.out.println("El número total de divorcios SIN separación previa en el año 2018.: " + sinS18);
			f.close();
		} catch (FileNotFoundException e) {

		}

	}
}