public class Habitacion {
    private int numero;
    private TipoHabitacion tipo;
    private int capacidadMaxima;
    private double precioPorNoche;
    private Cliente clienteAsignado;

    public Habitacion(int numero, TipoHabitacion tipo, int capacidadMaxima, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidadMaxima = capacidadMaxima;
        this.precioPorNoche = precioPorNoche;
        this.clienteAsignado = null;
    }

    public int getNumero() {
        return numero;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public Cliente getClienteAsignado() {
        return clienteAsignado;
    }

    public void setClienteAsignado(Cliente cliente) {
        clienteAsignado = cliente;
    }
}
