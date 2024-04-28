public class Paciente implements Comparable<Paciente>{
    private String nombre;
    private String sintomas;
    private int prioridad;

    public Paciente(String nombre, String sintomas, int prioridad) {
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "********Paciente********\tNombre: "+nombre+
                "\tSíntomas: "+sintomas+
                "\tPrioridad: "+prioridad;
    }

    @Override
    public int compareTo(Paciente o) {
        if(prioridad < o.getPrioridad())
            return -1;
        else if (prioridad > o.getPrioridad())
            return 1;
        else
            return 0;
    }
}
