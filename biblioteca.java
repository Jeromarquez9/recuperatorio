public class biblioteca {
     }
    private String nombre;
    private publicacion[] catalogo;
    private int cantidad;

    public biblioteca.biblioteca (String nombre, int tamanio) {
        this.nombre = nombre;
        catalogo = new publicacion[tamanio];
        cantidad = 0;
    }

    public void agregarPublicacion(publicacion p) {
        if (cantidad < catalogo.length - 1) {
            catalogo[cantidad] = p;
            cantidad++;
        } else {
            System.out.println("No hay espacio disponible");
        }
    }

    public void mostrarCatalogo() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(catalogo[i].mostrarDatos());
        }
    }

    public void ordenarPorAnioDesc() {
        for (int i = 0; i < cantidad - 1; i++) {
          for (int j = 0; j < cantidad - i - 1; j++) {
           if (catalogo[j].getanioPublicacion() > catalogo[j + 1].getanioPublicacion()) {
                    publicacion aux = catalogo[j];
                    catalogo[j] = catalogo[j + 1];
                    catalogo[j + 1] = aux;
                }
            }
        }
    }

    public publicacion buscarPorTitulo(String titulo) {
        for (int i = 0; i < cantidad; i++) {
            if (catalogo[i].getNombre().equalsIgnoreCase(titulo)) {
                return catalogo[i];
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public publicacion[] getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(publicacion[] catalogo) {
        this.catalogo = catalogo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
