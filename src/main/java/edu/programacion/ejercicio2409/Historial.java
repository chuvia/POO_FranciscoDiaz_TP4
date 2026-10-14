package edu.programacion.ejercicio2409;

import java.util.ArrayList;

public class Historial {

    private ArrayList<Pagina> paginas;

    public Historial() {
        paginas = new ArrayList<>();
    }

    public void agregarPagina(Pagina pagina) {
        paginas.add(pagina);
    }

    public void eliminarPagina(Pagina pagina) {
        paginas.remove(pagina);
    }

    public Pagina ultimaPaginaVisitada() {
        if (paginas.isEmpty()) {
            return null;
        }

        return paginas.get(paginas.size() - 1);
    }

    public int cantidadPaginasVisitadas() {
        return paginas.size();
    }
}
