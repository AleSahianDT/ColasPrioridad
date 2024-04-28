import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Emergencias {
    private PriorityQueue<Paciente> listaPacientes;

    public Emergencias(){
        listaPacientes = new PriorityQueue<Paciente>();
    }

    public void encolar(String nombre, String sintomas, int prioridad){
        listaPacientes.add(new Paciente(nombre, sintomas, prioridad));
    }

    public Paciente atender()throws Exception{
        if(listaPacientes.isEmpty())
            throw new Exception("No hay pacientes en espera");
        return listaPacientes.remove();
    }

    public List<Paciente> listarPaciente(){
        List<Paciente> lista = new LinkedList<>();
        for(Paciente p:listaPacientes)
            lista.add(p);
        return lista;
    }

}
