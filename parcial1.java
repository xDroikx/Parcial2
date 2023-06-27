package parcial2;
import java.util.*;
public class parcial1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero:  ");
		int num = scanner.nextInt();
		
		
		//(num>0)? ("El numero "+num+" es positivo ") System.out.println("El numero "+num+" es negativo ");
		if(num >0){
			System.out.println("El numero "+num+" es positivo ");
		}else if(num<0){
			System.out.println("El numero "+num+" es negativo ");
		}else if(num==0){
			System.out.println("El numero es cero ");
			scanner.close();	
			}
	}

}
