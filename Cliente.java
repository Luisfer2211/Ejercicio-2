public class Cliente {
    private String nombre;
    private int visitas;

    public Cliente(String nombre, int visitas) {
        this.nombre = nombre;
        this.visitas = visitas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    public boolean esElegibleParaTipoHabitacion(TipoHabitacion tipoHabitacion) {
        if (tipoHabitacion == TipoHabitacion.ESTANDAR && visitas >= 1) {
            return true;
        } else if (tipoHabitacion == TipoHabitacion.DELUXE && visitas >= 5) {
            return true;
        } else if (tipoHabitacion == TipoHabitacion.SUITE && visitas >= 10) {
            return true;
        }
        return false;
    }
}
