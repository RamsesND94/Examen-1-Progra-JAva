import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

public class Examen_1 extends JFrame implements ActionListener{
    private JLabel lbnombre, lbgenero, lbanti, lbedad, lbsalario, lbasoc, labfooter, lbtitulo;
    private JTextField txtnombre;
    private JComboBox cmgenero, cmanti, cmasoc, cmprestamo;
    private JFormattedTextField txtsalario, txtedad, seguro, prestamo;
    private NumberFormat format;
    private NumberFormatter formatter, formatter2, formatter3, formatter4;
    private JButton boton1, boton2, boton3;
    private JTextArea textArea;
    private JScrollPane scroll;
    private DecimalFormat formato1;
    private JMenuBar mb;
    private JMenu opciones, acercade, nuevo, color;
    private JMenuItem miRoj, miCel, miMor, miNuev, miCrea, miSal; 

    public Examen_1(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Software Proceso de datos");
        getContentPane().setBackground(new Color(255,0,0));

        mb = new JMenuBar();
        mb.setBackground(new Color(255,255,255));
        setJMenuBar(mb);

        opciones = new JMenu("Opciones");
        opciones.setBackground(new Color(255,255,255));
        opciones.setFont(new Font("Andale Mono", 1, 12));
        mb.add(opciones);

        nuevo = new JMenu("Nuevo");
        nuevo.setBackground(new Color(255,255,255));
        nuevo.setFont(new Font("Andale Mono", 1, 12));
        mb.add(nuevo);

        miNuev = new JMenuItem("Restablecer datos");
        miNuev.setFont(new Font("Andale Mono", 1, 12));
        nuevo.add(miNuev);
        miNuev.addActionListener(this);

        acercade = new JMenu("Acerca de");
        acercade.setBackground(new Color(255,255,255));
        acercade.setFont(new Font("Andale Mono", 1, 12));
        mb.add(acercade);

        miCrea = new JMenuItem("Creador");
        miCrea.setFont(new Font("Andale Mono", 1, 12));
		acercade.add(miCrea);
		miCrea.addActionListener(this);

        color = new JMenu("Color de fondo");
        color.setFont(new Font("Andale Mono", 1, 12));
        opciones.add(color);

        miRoj = new JMenuItem("Rojo");
        miRoj.setFont(new Font("Andale Mono", 1, 12));
		miRoj.setForeground(new Color(255,0,0));
		color.add(miRoj);
		miRoj.addActionListener(this);

        miMor = new JMenuItem("Morado");
		miMor.setFont(new Font("Andale Mono", 1, 12));
		miMor.setForeground(new Color(128,0,128));
		color.add(miMor);
		miMor.addActionListener(this);

        miCel = new JMenuItem("Celeste");
        miCel.setFont(new Font("Andale Mono", 1, 12));
        miCel.setForeground(new Color(0,0,255));
        color.add(miCel);
        miCel.addActionListener(this);

        miSal = new JMenuItem("Salir");
        miSal.setFont(new Font("Andale Mono", 1, 12));
        opciones.add(miSal);
        miSal.addActionListener(this);

        lbtitulo = new JLabel("Bienvenido/a");
        lbtitulo.setBounds(222,20,300,30);
        lbtitulo.setFont(new Font("Andale Mono", 4, 20));
        add(lbtitulo);

        lbnombre = new JLabel("Nombre completo del empleado/a");
        lbnombre.setBounds(20,70,300,30);
        lbnombre.setFont(new Font("Andale Mono", 3, 14));
        add(lbnombre);

        txtnombre = new JTextField();
        txtnombre.setBounds(20,100,250,30);
        txtnombre.setFont(new Font("Andale Mono", 1, 13));
        txtnombre.setBackground(new Color(224,224,224));
        add(txtnombre);

        lbedad = new JLabel("Edad del empleado/a");
        lbedad.setBounds(370,70,300,30);
        lbedad.setFont(new Font("Andale Mono", 3, 14));
        add(lbedad);

        format = NumberFormat.getInstance();
        formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0); //valor mínimo
        formatter.setMaximum(120); //valor máximo
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);
        txtedad = new JFormattedTextField(formatter);
        txtedad.setText("0");
        txtedad.setBounds(370,100,250,30);
        txtedad.setFont(new Font("Andale Mono", 1, 13));
        txtedad.setBackground(new Color(224,224,224));
        add(txtedad);
        
        lbgenero = new JLabel("Cual es el genero del empleado/a?");
        lbgenero.setBounds(20,130,300,30);
        lbgenero.setFont(new Font("Andale Mono", 3, 14));
        add(lbgenero);

        String gen[] = {"","Masculino", "Femenino"};
        cmgenero = new JComboBox<>(gen);
        cmgenero.setBounds(20,160,250,30);
        cmgenero.setFont(new Font("Andale Mono", 1, 13));
        cmgenero.setBackground(new Color(224,224,224));
        add(cmgenero);
        //cmgenero.addItem("");
        //cmgenero.addItem("Masculino");
        //cmgenero.addItem("Femenino");

        lbanti = new JLabel("Cuantos años lleva en la empresa");
        lbanti.setBounds(20,190,300,30);
        lbanti.setFont(new Font("Andale Mono", 3, 14));
        add(lbanti);

        String antiguo[] = {"","1 a 5 años", "5 a 10 años", "10 o más años", "Menos de 1 año"}; 
        cmanti = new JComboBox<>(antiguo);
        cmanti.setBounds(20,220,250,30);
        cmanti.setFont(new Font("Andale Mono", 1, 13));
        cmanti.setBackground(new Color(224,224,224));
        add(cmanti);
        //cmanti.addItem("");
        //cmanti.addItem("1 a 5 años");
        //cmanti.addItem("5 a 10 años");
        //cmanti.addItem("10 o más años");
        //cmanti.addItem("Menos de 1 año");

        lbsalario = new JLabel("Cual es el salario del empleado/a");
        lbsalario.setBounds(370,130,300,30);
        lbsalario.setFont(new Font("Andale Mono", 3, 14));
        add(lbsalario);

        formatter2 = new NumberFormatter(format);
        formatter2.setValueClass(Integer.class);
        formatter2.setMinimum(0); //valor mínimo
        formatter2.setMaximum(Integer.MAX_VALUE); //valor máximo
        formatter2.setAllowsInvalid(false);
        formatter2.setCommitsOnValidEdit(true);
        txtsalario = new JFormattedTextField(formatter2);
        txtsalario.setBounds(370,160,250,30);
        txtsalario.setText("0");
        txtsalario.setFont(new Font("Andale Mono", 1, 13));
        txtsalario.setBackground(new Color(224,224,224));
        add(txtsalario);

        lbasoc = new JLabel("Hace cuanto es agremiado en la Asoc.?");
        lbasoc.setBounds(370,190,300,30);
        lbasoc.setFont(new Font("Andale Mono", 3, 14));
        add(lbasoc);

        String asoc[] = {"","1 a 3 años", "4 a 10 años", "11 o más años", "Menos de 1 año o no estoy agremiado"};
        cmasoc = new JComboBox<>(asoc);
        cmasoc.setBounds(370,220,250,30);
        cmasoc.setFont(new Font("Andale Mono", 1, 13));
        cmasoc.setBackground(new Color(224,224,224));
        add(cmasoc);
        //cmasoc.addItem("");
        //cmasoc.addItem("1 a 3 años");
        //cmasoc.addItem("4 a 10 años");
        //cmasoc.addItem("11 o más años");
        //cmasoc.addItem("Menos de 1 año o no estoy agremiado");

        boton1 = new JButton("Calcular Vacaciones");
        boton1.setBounds(20,270,180,30);
        boton1.setFont(new Font("Andale Mono", 1, 12));
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Solicitar prestamo");
        boton2.setBounds(230,270,180,30);
        boton2.setFont(new Font("Andale Mono", 1, 12));
        boton2.addActionListener(this);
        add(boton2);

        boton3 = new JButton("Solicitar pension");
        boton3.setBounds(440,270,180,30);
        boton3.setFont(new Font("Andale Mono", 1, 12));
        boton3.addActionListener(this);
        add(boton3);

        textArea = new JTextArea();
        textArea.setText("\n Aqui aparecen los resultados de su peticion ");
        textArea.setEditable(false);
        textArea.setBackground(new Color(224,224,224));
        textArea.setFont(new Font("Andale Mono", 1, 14));
        scroll = new JScrollPane(textArea);
        scroll.setBounds(20,320,600,320);
        add(scroll);

        labfooter = new JLabel("©2022 Ramses Examen 1 || All rights reserved");
        labfooter.setBounds(182,635,300,30);
        labfooter.setFont(new Font("Andale Mono",1, 12));
        add(labfooter);
    }

    public void actionPerformed(ActionEvent e){
        Container fondo = this.getContentPane();
        String nombre = txtnombre.getText();
        String genero = cmgenero.getSelectedItem().toString();
        String anti = cmanti.getSelectedItem().toString();
        String str_edad = txtedad.getValue().toString();
        int edad = Integer.parseInt(str_edad);
        String str_salario = txtsalario.getValue().toString();
        Double salario = Double.parseDouble(str_salario);
        String antiasoc = cmasoc.getSelectedItem().toString();

        if (e.getSource() == boton1 || e.getSource() == boton2 || e.getSource() == boton3){
            if(anti.equals("1 a 5 años") && antiasoc.equals("11 o más años") || anti.equals("5 a 10 años") 
                && antiasoc.equals("11 o más años")){
                    JOptionPane.showMessageDialog(null,"No puede llevar mas años en la asociacion que trabajando en la empresa");
            }
        }

        if (e.getSource() == boton1){
            if (nombre.equals("") || genero.equals("") || anti.equals("") ||
                str_edad.equals("0") || str_salario.equals("0") || antiasoc.equals("")){
                    JOptionPane.showMessageDialog(null,"Debe llenar todo los campos que se solicitan");
            } else{
                if(anti.equals("1 a 5 años")){
                    textArea.setText(nombre + " quien lleva trabajando de " + anti + " recibe 12 dias de vacaciones");
                } else if(anti.equals("5 a 10 años")){
                    textArea.setText(nombre + " quien lleva trabajando de " + anti + " recibe 24 dias de vacaciones");
                } else if(anti.equals("10 o más años")){
                    textArea.setText(nombre + " quien lleva trabajando de " + anti + " recibe 30 dias de vacaciones");
                } else if(anti.equals("Menos de 1 año")){
                    textArea.setText(nombre + " quien lleva menos de 1 año trabajando no podrá gozar de vacaciones aún");
                }
            }
        }
        if (e.getSource() == boton2){
            if (nombre.equals("") || genero.equals("") || anti.equals("") ||
                str_edad.equals("0") || str_salario.equals("0") || antiasoc.equals("")){
                    JOptionPane.showMessageDialog(null,"Debe llenar todo los campos que se solicitan");
            } else{
                if(antiasoc.equals("Menos de 1 año o no estoy agremiado")){
                    textArea.setText(nombre + " no puede solicitar prestamos en la asociacion");
                }
                formato1 = new DecimalFormat("#0.0");
                if(antiasoc.equals("1 a 3 años")){
                    textArea.setText(nombre + " podra solictar un prestamo desde 324 000 a 972 000");

                    formatter4 = new NumberFormatter(format);
                    formatter4.setValueClass(Integer.class);
                    formatter4.setMinimum(0); //valor mínimo
                    formatter4.setMaximum(972000); //valor máximo
                    formatter4.setAllowsInvalid(false);
                    formatter4.setCommitsOnValidEdit(true);
                    prestamo = new JFormattedTextField(formatter4);
                    Double prestamo_r = 973000.0;
                    while(prestamo_r > 972000){
                        String prestamo1 = JOptionPane.showInputDialog(prestamo,"Puede solicitar un prestamo desde 324 000 a 972 000\nCuanto dinero desea solicitar para el prestamo?");
                        prestamo_r = Double.parseDouble(prestamo1);
                    }

                    String prest[] = {"", "3 años con 20 % de interés", "5 años con 25% de interés"};
                    cmprestamo = new JComboBox<>(prest);
                    int opcion = JOptionPane.showConfirmDialog(this, cmprestamo, "Plazo", JOptionPane.DEFAULT_OPTION);
                    if (opcion == JOptionPane.OK_OPTION){
                        String interes = cmprestamo.getSelectedItem().toString();
                        if (interes.equals("3 años con 20 % de interés")){
                            Double intereses = prestamo_r * 0.2, total = prestamo_r + intereses, pago = total / 72, salarioneto = salario - pago;
                            textArea.setText(nombre + " podra solictar un prestamo desde 324 000 a 972 000" +
                                            "\n\n\nHa solicitado un prestamo de " + prestamo_r + " a un plazo " + 
                                            "de 3 años por lo que el \nmonto total quedará en " + total + ". \nPagará " 
                                            + intereses + " de intereses. \n\nPor mes deberá pagar " + formato1.format(pago) +
                                            " y le quedará un salario neto de " + formato1.format(salarioneto));
                        } else if(interes.equals("5 años con 25% de interés")){
                            Double intereses = prestamo_r * 0.25, total = prestamo_r + intereses, pago = total / 120, salarioneto = salario - pago;
                            textArea.setText(nombre + " podra solictar un prestamo desde 324 000 a 972 000" +
                                            "\n\n\nHa solicitado un prestamo de " + prestamo_r + " a un plazo " + 
                                            "de 3 años por lo que el \nmonto total quedará en " + total + ". \nPagará " 
                                            + intereses + " de intereses. \n\nPor mes deberá pagar " + formato1.format(pago) +
                                            " y le quedará un salario neto de " + formato1.format(salarioneto));
                        }
                    }
                } else if(antiasoc.equals("4 a 10 años")){
                    textArea.setText(nombre + " podra solictar un prestamo desde 324 000 a 2 592 000");

                    formatter4 = new NumberFormatter(format);
                    formatter4.setValueClass(Integer.class);
                    formatter4.setMinimum(0); //valor mínimo
                    formatter4.setMaximum(2592000); //valor máximo
                    formatter4.setAllowsInvalid(false);
                    formatter4.setCommitsOnValidEdit(true);
                    prestamo = new JFormattedTextField(formatter4);
                    Double prestamo_r = 2593000.0;
                    while(prestamo_r > 2592000){
                        String prestamo1 = JOptionPane.showInputDialog(prestamo, "Puede solicitar un prestamo desde 324 000 a 2 592 000\nCuanto dinero desea solicitar para el prestamo?");
                        prestamo_r = Double.parseDouble(prestamo1);
                    }

                    String prest[] = {"", "3 años con 20 % de interés", "5 años con 25% de interés"};
                    cmprestamo = new JComboBox<>(prest);
                    int opcion = JOptionPane.showConfirmDialog(this, cmprestamo, "Plazo", JOptionPane.DEFAULT_OPTION);
                    if (opcion == JOptionPane.OK_OPTION){
                        String interes = cmprestamo.getSelectedItem().toString();
                        if (interes.equals("3 años con 20 % de interés")){
                            Double intereses = prestamo_r * 0.2, total = prestamo_r + intereses, pago = total / 72, salarioneto = salario - pago;
                            textArea.setText(nombre + " podra solictar un prestamo desde 324 000 a 2 592 000" +
                                            "\n\n\nHa solicitado un prestamo de " + prestamo_r + " a un plazo " + 
                                            "de 3 años por lo que el \nmonto total quedará en " + total + ". \nPagará " 
                                            + intereses + " de intereses. \n\nPor mes deberá pagar " + formato1.format(pago) +
                                            " y le quedará un salario neto de " + formato1.format(salarioneto));
                        } else if(interes.equals("5 años con 25% de interés")){
                            Double intereses = prestamo_r * 0.25, total = prestamo_r + intereses, pago = total / 120, salarioneto = salario - pago;
                            textArea.setText(nombre + " podra solictar un prestamo desde 324 000 a 2 592 000" +
                                            "\n\n\nHa solicitado un prestamo de " + prestamo_r + " a un plazo " + 
                                            "de 3 años por lo que el \nmonto total quedará en " + total + ". \nPagará " 
                                            + intereses + " de intereses. \n\nPor mes deberá pagar " + formato1.format(pago) +
                                            " y le quedará un salario neto de " + formato1.format(salarioneto));
                        }
                    }
                } else if(antiasoc.equals("11 o más años")){
                    textArea.setText(nombre + " podra solictar un prestamo desde 324 000 a 6 480 000");

                    formatter4 = new NumberFormatter(format);
                    formatter4.setValueClass(Integer.class);
                    formatter4.setMinimum(0); //valor mínimo
                    formatter4.setMaximum(6480000); //valor máximo
                    formatter4.setAllowsInvalid(false);
                    formatter4.setCommitsOnValidEdit(true);
                    prestamo = new JFormattedTextField(formatter4);
                    Double prestamo_r = 6481000.0;
                    while(prestamo_r > 6480000){
                        String prestamo1 = JOptionPane.showInputDialog(prestamo, "Puede solicitar un prestamo desde 324 000 a 6 480 000\nCuanto dinero desea solicitar para el prestamo?");
                        prestamo_r = Double.parseDouble(prestamo1);
                    }

                    String prest[] = {"", "3 años con 20 % de interés", "5 años con 25% de interés"};
                    cmprestamo = new JComboBox<>(prest);
                    int opcion = JOptionPane.showConfirmDialog(this, cmprestamo, "Plazo", JOptionPane.DEFAULT_OPTION);
                    if (opcion == JOptionPane.OK_OPTION){
                        String interes = cmprestamo.getSelectedItem().toString();
                        if (interes.equals("3 años con 20 % de interés")){
                            Double intereses = prestamo_r * 0.2, total = prestamo_r + intereses, pago = total / 72, salarioneto = salario - pago;
                            textArea.setText(nombre + " podra solictar un prestamo desde 324 000 a 6 480 000" +
                                            "\n\n\nHa solicitado un prestamo de " + prestamo_r + " a un plazo " + 
                                            "de 3 años por lo que el \nmonto total quedará en " + total + ". \nPagará " 
                                            + intereses + " de intereses. \n\nPor mes deberá pagar " + formato1.format(pago) +
                                            " y le quedará un salario neto de " + formato1.format(salarioneto));
                        } else if(interes.equals("5 años con 25% de interés")){
                            Double intereses = prestamo_r * 0.25, total = prestamo_r + intereses, pago = total / 120, salarioneto = salario - pago;
                            textArea.setText(nombre + " podra solictar un prestamo desde 324 000 a 6 480 000" +
                                            "\n\n\nHa solicitado un prestamo de " + prestamo_r + " a un plazo " + 
                                            "de 3 años por lo que el \nmonto total quedará en " + total + ". \nPagará " 
                                            + intereses + " de intereses. \n\nPor mes deberá pagar " + formato1.format(pago) +
                                            " y le quedará un salario neto de " + formato1.format(salarioneto));
                        }
                    }
                }
            }
        }

        if(e.getSource() == boton3){
            if (nombre.equals("") || genero.equals("") || anti.equals("") ||
                str_edad.equals("0") || str_salario.equals("0") || antiasoc.equals("")){
                    JOptionPane.showMessageDialog(null,"Debe llenar todo los campos que se solicitan");
            }else{
                formatter3 = new NumberFormatter(format);
                formatter3.setValueClass(Integer.class);
                formatter3.setMinimum(0); //valor mínimo
                formatter3.setMaximum(90); //valor máximo
                formatter3.setAllowsInvalid(false);
                formatter3.setCommitsOnValidEdit(true);
                seguro = new JFormattedTextField(formatter3);
                String tiempo = JOptionPane.showInputDialog(seguro,"Cuantos años lleva de estar asegurado/a en la CCSS?");
                int cuotas = Integer.parseInt(tiempo);
                int cuota = cuotas * 12;
                if(genero.equals("Masculino") && cuota > 299 && edad > 64){
                    textArea.setText(nombre + " puede pensionarse ya que cuenta con las cuotas y edad requerida :)");
                } else if (genero.equals("Masculino") && cuota < 300 || genero.equals("Masculino") && edad < 65){
                    textArea.setText(nombre + " aún no puede pensionarse :(");
                }
                if(genero.equals("Femenino") && cuota >= 405 && edad >= 63){
                    textArea.setText(nombre + " puede pensionarse anticipadamente ya que cuenta con las cuotas y edad requerida :)");
                } else if(genero.equals("Femenino") && cuota > 299 && edad > 64){
                    textArea.setText(nombre + " puede pensionarse ya que cuenta con las cuotas y edad requerida :)");
                } else if (genero.equals("Femenino") && cuota < 300 || genero.equals("Femenino") && edad < 63) {
                    textArea.setText(nombre + " aún no puede pensionarse :(");
                } else if(genero.equals("Femenino") && edad >= 63 && cuota < 405){
                    textArea.setText(nombre + " no puede pensionarse anticipadamente");
                } 
            }
        }
        if(e.getSource() == miRoj){
            fondo.setBackground(new Color(255,0,0));
            mb.setBackground(new Color(255,0,0));
        }
        if(e.getSource() == miCel){
            fondo.setBackground(new Color(0,170,228));
            mb.setBackground(new Color(0,170,228));
        }
        if(e.getSource() == miMor){
            fondo.setBackground(new Color(128,0,255));
            mb.setBackground(new Color(128,0,255));
        }

        if(e.getSource() == miNuev){
            txtnombre.setText("");
            txtedad.setText("0");
            cmgenero.setSelectedIndex(0);
            cmanti.setSelectedIndex(0);
            txtsalario.setText("0");
            textArea.setText("\n Aqui aparecen los resultados de su peticion ");
            cmasoc.setSelectedIndex(0);
        }
        if(e.getSource() == miCrea){
            JOptionPane.showMessageDialog(null, "Creador: Ramses Rojas \n Prefiero el nombre Ramses que Cesar");
        }
        if(e.getSource() == miSal){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Examen_1 examen = new Examen_1();
        examen.setBounds(0,0,655,730);
        examen.setVisible(true);
        examen.setResizable(false);
        examen.setLocationRelativeTo(null);
    }
}