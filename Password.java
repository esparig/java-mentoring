
import java.util.*;
public class Password {

	public static void main(String[] args) {
		/*Escribe un programa que pida por teclado un día de la semana
		 *  y que diga qué asignatura toca a primera hora ese día..*/
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Introduce el numero del dia de la semana (1-7)");
		int dia=s.nextInt();
		
		switch (dia){
		case 1: 
			System.out.println("Es Lunes y te toca Matemáticas"); 
		break;
		case 2: 
			System.out.println("Es Martes y te toca Lengua"); 
		break;
		case 3: 
			System.out.println("Es Miercoles y te toca Física"); 
		break;
		case 4: 
			System.out.println("Es Jueves y te toca Gimnasia"); 
		break;
		case 5: 
			System.out.println("Es Viernes y te toca Inglés"); 
		break;
		default:
			System.out.println("Ese dia no tienes clases");
		}
		
			
		
		

	}

}
