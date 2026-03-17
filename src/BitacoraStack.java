public class BitacoraStack {
    private String[] elementos;
    private int cima;

    public BitacoraStack() {
        this.elementos = new String[10];
        this.cima = -1;
    }

    public void registrar(String evento) {
        if (evento == null) {
            throw new IllegalArgumentException("El evento no puede ser nulo.");
        }
        asegurarCapacidad();
        elementos[++cima] = evento;
    }

    public String consultarUltimo() {
        if (estaVacia()) {
            throw new IllegalStateException("La bitácora está vacía. No hay eventos para consultar.");
        }
        return elementos[cima];
    }

    public String eliminarUltimo() {
        if (estaVacia()) {
            throw new IllegalStateException("La bitácora está vacía. No hay eventos para eliminar.");
        }
        String eliminado = elementos[cima];
        elementos[cima] = null;
        cima--;
        return eliminado;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public int totalEventos() {
        return cima + 1;
    }

    private void asegurarCapacidad() {
        if (cima + 1 == elementos.length) {
            String[] nuevo = new String[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                nuevo[i] = elementos[i];
            }
            elementos = nuevo;
        }
    }
}
