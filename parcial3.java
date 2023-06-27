package parcial2;
import java.util.*;
public class parcial3 {
	
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ingrese un numero:  ");
			int num = scanner.nextInt();
			int fac = 1;
			int i=1;
			while ( i<=num) {
				fac =i*fac;
				i++;
			}
			
			System.out.println("El factorial de "+ num + " es: "+fac);
		}

	}