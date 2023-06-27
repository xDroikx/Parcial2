package parcial2;
public class parcial5 {
    public static void main(String[] args) {

        producto[] prod = new producto[4];
        prod[0] = new producto("PS5", 900);
        prod[1] = new producto("Xbox", 800);
        prod[2] = new producto("Switch", 1000);
        prod[3] = new producto("Sega", 500);

        for (producto obj : prod) {
            System.out.println("El producto es: " + obj.getNombre() + " Tiene un valor de: " + obj.getPrecio()+ " Dolares");
        }
    }
}


