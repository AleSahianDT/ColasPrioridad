import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;

public class Ventana {
    private JTextField textNombre;
    private JTextField textSintomas;
    private JComboBox comboBoxPrioridad;
    private JButton ingresarButton;
    private JButton atenderButton;
    private JPanel Emergencias;
    private JList listPacientes;
    Emergencias pacientesEmergencia = new Emergencias();
    DefaultListModel dlm = new DefaultListModel();
    public Ventana(){

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pacientesEmergencia.encolar(textNombre.getText(),
                textSintomas.getText(),
                Integer.parseInt(comboBoxPrioridad.getSelectedItem().toString()));
                llenarJList();
            }
        });
        atenderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    JOptionPane.showMessageDialog(null,pacientesEmergencia.atender());
                    llenarJList();
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
    }
    public void llenarJList(){
        dlm.removeAllElements();
        List<Paciente>pacientes = pacientesEmergencia.listarPaciente();
        Collections.sort(pacientes);
        for(Paciente p:pacientes)
            dlm.addElement(p);
        listPacientes.setModel(dlm);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Emergencias);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
