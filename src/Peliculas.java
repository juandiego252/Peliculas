public class Peliculas {

    int Duracion;
    String Nombre;
    String tipo;

    public Peliculas(int duracion, String nombre, String tipo) {
        Duracion = duracion;
        Nombre = nombre;
        this.tipo = tipo;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
