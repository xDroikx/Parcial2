package parcial2;

class producto {
    private
    String nombre;
    int precio;
    public
    producto(String n, int p){
        nombre = n;
        precio = p;

    }
    String getNombre (){
        return nombre;
    }
    int getPrecio() {
        return precio;
    }
}