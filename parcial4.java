package parcial2;

public class parcial4 {

	public static void main(String[] args) {
	        String[] vocales = {"NErlo", "aoome", "Idsd", "SIO"};

	        int cont = 0;

	        for (String voc : vocales) {
	            for (int i = 0; i < voc.length(); i++) {
	                char c = Character.toLowerCase(voc.charAt(i));
	                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                    cont++;
	                }
	        }
	        }
	        System.out.println("La cantidad de vocales en el array es: " + cont);
	    }
	} 
