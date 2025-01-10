package figuras;

import java.util.Scanner;
import java.awt.Color;

public class PruebaFigura {

public static void main(String[] args) {
	int opcion;
	Scanner teclado = new Scanner (System.in);
	do { 
	   opcion = mostrarMenu();
	   if (opcion != 4){
	      System.out.print ("Introduzca la coordenada x del centro: ");
	      double x = teclado.nextDouble();
	      System.out.print ("Introduzca la coordenada y del centro: ");
	      double y = teclado.nextDouble();
	   switch (opcion)
		   {  case 1:
		         System.out.print ("Introduzca el lado 1 del tri�ngulo: ");
	        	 double lado1 = teclado.nextDouble();
		         System.out.print ("Introduzca el lado 2 del tri�ngulo: ");
	        	 double lado2 = teclado.nextDouble();
	        	 System.out.print ("Introduzca el lado 3 del tri�ngulo: ");
	        	 double lado3 = teclado.nextDouble();
	        	 Triángulo t = new Triángulo(x, y, Color.red, lado1, lado2, lado3);
	        	 System.out.println ("El perímetro es " + t.perímetro());
	        	 System.out.println ("El área es " + t.área());
	        	 break;
	         case 2:
		         System.out.print ("Introduzca la base del rectángulo: ");
	        	 double base = teclado.nextDouble();
		         System.out.print ("Introduzca la altura del rectángulo: ");
	        	 double altura = teclado.nextDouble();
	        	 Rectángulo r = new Rectángulo(x, y, Color.red, base, altura);
	        	 System.out.println ("El perímetro es " + r.perímetro());
	        	 System.out.println ("El área es " + r.área());
	        	 break;
	         case 3:
		         System.out.print ("Introduzca el lado del cuadrado: ");
	        	 double lado = teclado.nextDouble();
		         Cuadrado c = new Cuadrado(x, y, Color.red, lado);
		         System.out.println ("El perímetro es " + c.perímetro());
		         System.out.println ("El área es " + c.área());
		         break;
	        }
	   }
	}while (opcion != 4); 
	teclado.close();
	}
	
	public static int mostrarMenu(){
	int opcion;
	System.out.println ("1) Tri�ngulo");
	System.out.println ("2) Rect�ngulo");
	System.out.println ("3) Cuadrado");
	System.out.println ("4) Salir");
	Scanner teclado = new Scanner (System.in);
	do {
	    System.out.print ("Introduzca una opci�n (1-4): ");
	    opcion = teclado.nextInt();
	    if (opcion < 1 || opcion > 4)
		   System.out.println ("Debe introducir un n�mero entre 1 y 4");
	   } while (opcion < 1 || opcion > 4);
	return opcion;
	}
}
