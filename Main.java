//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        LibroDigital libro = new LibroDigital(
                "9781234567890", "Java desde cero", 5.0, 0
        );

        libro.registrarDescarga();
        libro.registrarDescarga();
        libro.registrarDescarga();

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Descargas: " + libro.getDescargasTotales());
        System.out.println("Espacio consumido: "
                + libro.calcularEspacioConsumido() + " MB");
    }
}
