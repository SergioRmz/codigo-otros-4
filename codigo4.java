package com.generation;

import java.util.Scanner;

public class Cogigo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cambio en el nombre de las variables por unas mas significativas
		Scanner scanner = new Scanner(System.in);
		
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = scanner.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Corrección en el texto mostrado al usuario.
	    String j2 = scanner.nextLine();
	    
	    if (j1.equals(j2)) { // Se elimina el parentesis que estaba de mas y se cambia el == por el metodo equals.
	      System.out.println("Empate");
	    } else {
	      int gana = 0; // Igualando variable a 0 para que no haya un ganador preestablecido.
	      switch(j1) {
	      // En todos los casos se establece el uso del metodo equals para comparar el input del usuario vs la cadena especificada.
	        case "piedra":
	          if (j2.equals("tijeras")) {
	            gana = 1;
	          } else gana = 2; // Anadiendo la posibilidad de que el j2 tambien gane.
	          break; 
	        case "papel":
	          if (j2.equals("piedra")) {
	            gana = 1;
	          } else gana = 2; // Se agrega llave de cierre para el if.
	          break;
	        case "tijeras":
	          if (j2.equals("papel")) { 
	            gana = 1;
	          } else gana = 2;
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + gana);
	    }
	    
	    scanner.close(); // Cierre del scanner.

	}

}
