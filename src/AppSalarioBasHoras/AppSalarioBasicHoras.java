package AppSalarioBasHoras;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppSalarioBasicHoras extends JFrame {
    private JTextField txtNMBREEMPL;
    private JTextField txtSalarioHRS;
    private JTextField txtHRSTrabajadas;
    private JButton btnSALIR;
    private JButton btnBORRAR;
    private JButton btnCALCULAR;
    private JPanel MainPanel;
    private JLabel lbSueldo;
    private JLabel lbNMBREEMPL;

    public AppSalarioBasicHoras() {
        setContentPane(MainPanel);
        setTitle("Salario Basico Horas");
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnCALCULAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int SalarioxHRS=0,NumHrsTrabajadas=0;

                String NombreEmpl=txtNMBREEMPL.getText();

                try{
                    SalarioxHRS=Integer.parseInt(txtSalarioHRS.getText());
                }
                catch(NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "DEBES INGRESAR EL VALOR DEL SALARIO POR HORAS",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);
                }
                try{
                    NumHrsTrabajadas=Integer.parseInt(txtHRSTrabajadas.getText());
                }
                catch(NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "DEBES INGRESAR EL NUMERO DE HORAS TRABAJADAS",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);
                }
                if((SalarioxHRS == 0 ) || (NumHrsTrabajadas == 0)){
                    txtNMBREEMPL.setText("");
                    txtSalarioHRS.setText("");
                    txtHRSTrabajadas.setText("");
                    lbNMBREEMPL.setText("");
                    lbSueldo.setText("");

                }
                else{
                    Salario Empleado=new Salario(NombreEmpl,SalarioxHRS,NumHrsTrabajadas);
                    int Salario=Empleado.CalculoSalario();



                    if(Salario>450000){
                        lbNMBREEMPL.setText(Empleado.NombreEmpl);
                        lbSueldo.setText(String.valueOf("$"+Salario));

                        JOptionPane.showMessageDialog(null,
                                "NOMBRE EMPLEADO: "+Empleado.NombreEmpl+" SUELDO: $"+Salario,
                                "SALARIO BASICO",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        lbNMBREEMPL.setText(Empleado.NombreEmpl);
                        lbSueldo.setText("");

                        JOptionPane.showMessageDialog(null,
                                "NOMBRE EMPLEADO "+Empleado.NombreEmpl,
                                "SALARIO BASICO",
                                JOptionPane.INFORMATION_MESSAGE);
                    }

                }

            }
        });
        btnBORRAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNMBREEMPL.setText("");
                txtSalarioHRS.setText("");
                txtHRSTrabajadas.setText("");
                lbNMBREEMPL.setText("");
                lbSueldo.setText("");
            }
        });
        btnSALIR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }




}
