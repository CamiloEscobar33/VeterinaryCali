package ui;

import model.*;

import java.util.Scanner;

public class Main{
	
	public static void main (String[] args){
	
	Scanner reader = new Scanner(System.in);

		int option = 0;
		

		while(option=1) {

		    System.out.println("Bienvenido a la verinaria");
		    System.out.println("Por favor seleccione la opcion que desea:");
			System.out.println("1.Registrar Mascota.");
			System.out.println("2.Registrar Dueño.");
			System.out.println("3.Ver clientes.");
			System.out.println("4.Mostrar la disponbilidad de los cuertos.");
			System.out.println("5.Creacion de historia clinica a mascota hopitalizada.");
			System.out.println("6.Informe de oaciente hospitalizados en el momento.");
			System.out.println("7.Consultar datos del dueño de el animal hospitalizado con el nombre del dueño.");
			System.out.println("8.Consultar datos del dueño de el animal hospitalizado con el nombre de la mascota.");
			System.out.println("9.Dar de alta a una mascota hopitalizada.");
			System.out.println("10.Calcular costos de hospitalización.");
			System.out.println("11.Calcular costo de medicamento.");
			System.out.println("12.Calcular la cantidad de ingresos por concepto de hospitalizacion a un mascota.");
			System.out.println("13.Permitir el minicuarto en donde esta alojada la mascota con su nombre.");
			System.out.println("14.Calcular ingresos de la veterinaria por hospitalizacion.");
			System.out.println("15.Salir.");
				

			option = Integer.parseInt(reader.nextLine());

		

			
		} 
	}
}