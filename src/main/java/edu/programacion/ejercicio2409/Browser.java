package edu.programacion.ejercicio2409;

public class Browser {

    private Pagina paginaActual;
    private Historial historial;
    private Favoritos favoritos;

    public Browser() {
        paginaActual = null;
        historial = new Historial();
        favoritos = new Favoritos();
    }

    public void navegar(Pagina pagina) {

        paginaActual = pagina;
        historial.agregarPagina(pagina);
    }

    public Pagina getpaginaActual() {
        return paginaActual;
    }

    public Historial getHistorial() {
        return historial;
    }

    public Favoritos getFavoritos() {
        return favoritos;
    }
}
