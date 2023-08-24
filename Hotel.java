public class Hotel {
    private Habitacion[] habitacionesEstandar;
    private Habitacion[] habitacionesDeluxe;
    private Habitacion[] habitacionesSuite;
    private Cliente[] listaEspera;

    public Hotel(int numHabitaciones) {
        habitacionesEstandar = new Habitacion[numHabitaciones];
        habitacionesDeluxe = new Habitacion[numHabitaciones];
        habitacionesSuite = new Habitacion[numHabitaciones];
        listaEspera = new Cliente[numHabitaciones];
    }

    
    public void agregarClienteListaEspera(Cliente cliente) {
        for (int i = 0; i < listaEspera.length; i++) {
            if (listaEspera[i] == null) {
                listaEspera[i] = cliente;
                return;
            }
        }
    }

    public void mostrarListaEspera() {
        for (Cliente cliente : listaEspera) {
            if (cliente != null) {
                System.out.println(cliente.getNombre());
            }
        }
    }

    public void asignarClienteHabitacion(Cliente cliente, TipoHabitacion tipoHabitacion) {
        Habitacion[] habitacionesDisponibles = null;

        
        
        switch (tipoHabitacion) {
            case ESTANDAR:
                habitacionesDisponibles = habitacionesEstandar;
                break;
            case DELUXE:
                habitacionesDisponibles = habitacionesDeluxe;
                break;
            case SUITE:
                habitacionesDisponibles = habitacionesSuite;
                break;
        }

        if (habitacionesDisponibles != null) {
            for (Habitacion habitacion : habitacionesDisponibles) {
                if (habitacion != null && habitacion.getClienteAsignado() == null) {
                    if (cliente.esElegibleParaTipoHabitacion(tipoHabitacion)) {
                        habitacion.setClienteAsignado(cliente);
                        return;
                    } else {
                        agregarClienteListaEspera(cliente);
                        return;
                    }
                }
            }
            agregarClienteListaEspera(cliente);
        }
    }
    
}
