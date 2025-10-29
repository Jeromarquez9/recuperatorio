public interface IGestionPrestamos {
    void agregarPrestamo(publicacion p);
    void mostrarPrestamos();
public class usuario {
    public string nombre
    public string Publicacion[] prestamos
    public int cantidadMaxPrestamos
    
}
@Override
    public void mostrarPrestamos() {
        System.out.println("Préstamos de " + nombre + ":");
        for (int i = 0; i < cantidadMaxPrestamos; i++) {
            Publicacion p = prestamos[i];
            String tipo = "";
            if (p instanceof Libro) {
                tipo = ((Libro)p).tipoPrestamo();
            } else if (p instanceof Revista) {
                tipo = ((Revista)p).tipoPrestamo();
            }
            System.out.println(p.mostrarDatos() + " → " + tipo);
        }
    }
}
