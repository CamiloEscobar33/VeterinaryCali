package ui;

import model.*;

import java.util.Scanner;

public class Main {

	
	public static void Main(String[] args) throws Exception{

		Scanner reader = new Scanner(System.in);

		int option;
		cleanScreenConsole();

		do {

		    System.out.println("Bienvenido a la verinaria");
		    System.out.println("Por favor seleccione la opcion que desea:");
			System.out.println("1.Registrar dueño.");
			System.out.println("2.Registrar mascota.");
			System.out.println("3.Ver clientes.");
			System.out.println("4.Ver mascotas.");
			System.out.println("5.Creacion de historia clinica a mascota hopitalizada.");
			System.out.println("6.Informe clinico de las historia clinica del paciente.");
			System.out.println("7.Consultar datos del dueño de el animal hospitalizado con el id del dueño.");
			System.out.println("8.");
			System.out.println("9.");
			System.out.println("10.");
			System.out.println("11.");
			System.out.println("12.");
			System.out.println("13.");
			System.out.println("14.");
			System.out.println("15.");	

			option = Integer.parseInt(reader.nextLine());

			cleanScreenConsole();

			switch(option){

				case 1:

					System.out.println("adadca");	

				break;

			}

		} while(option!=15);

	
	}	

	public static void cleanScreenConsole(){
		//Try clean the console screen
		try{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}catch(Exception ex){
			//nothing to do
		}			
	}
}