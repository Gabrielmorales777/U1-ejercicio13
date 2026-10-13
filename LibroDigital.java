
public class LibroDigital {

    private String isbn;
    private String titulo;
    private double tamanioMB;
    private int descargasTotales;

    // Constructor
    public LibroDigital(String isbn, String titulo,
                        double tamanioMB, int descargasTotales) {

        if (tamanioMB < 0 || descargasTotales < 0) {
            throw new IllegalArgumentException(
                    "El tamaño y las descargas no pueden ser negativos"
            );
        }

        this.isbn = isbn;
        this.titulo = titulo;
        this.tamanioMB = tamanioMB;
        this.descargasTotales = descargasTotales;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getTamanioMB() {
        return tamanioMB;
    }

    public int getDescargasTotales() {
        return descargasTotales;
    }

    // Setters
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTamanioMB(double tamanioMB) {
        if (tamanioMB < 0) {
            throw new IllegalArgumentException(
                    "El tamaño no puede ser negativo"
            );
        }

        this.tamanioMB = tamanioMB;
    }

    public void setDescargasTotales(int descargasTotales) {
        if (descargasTotales < 0) {
            throw new IllegalArgumentException(
                    "Las descargas no pueden ser negativas"
            );
        }

        this.descargasTotales = descargasTotales;
    }

    // Registrar una descarga
    public void registrarDescarga() {
        descargasTotales++;
    }

    // Calcular espacio consumido
    public double calcularEspacioConsumido() {
        return tamanioMB * descargasTotales;
    }
}
