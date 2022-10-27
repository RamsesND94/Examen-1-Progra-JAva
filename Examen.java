import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Examen extends JFrame{
    DecimalFormat formato1 = new DecimalFormat("#0.00");
    //Primera respuesta
    double val1 = 200, val2 = 360, val3 = 15*10, potencia = Math.pow(val3, 2), val4 = 12/6; 
    double resultado1 = val1 + val2 * potencia + val4;
    double raiz = Math.sqrt(resultado1);

    //Segunda respuesta
    double val1_2 = Math.pow(300, 8), val2_2 = 460, val3_2 = (18/10), val4_2 = 120/10-1*0.12;
    double resultado2 = val1_2 + val2_2 * val3_2 - val4_2; //Da un resultado enorme por el 300^8, es fallo de indicacion, no de programacion
    double redondeo1 = Math.round(resultado2);

    //Tercera respuesta
    double val1_3 = 400, val2_3 = 600, val3_3 = Math.pow(20, 8), val4_3 = 12*300, val5_3 = 10*0.3/2;
    double resultado3 = val1_3 + val2_3 / val3_3 * val4_3 + val5_3;
    double redondeo2 = Math.round(resultado3);

    //Cuarta respuesta
    double val1_4 = 500, val2_4 = 100, val3_4 = Math.pow(10, 2), val4_4 = 12*20, val5_4 = 120/2*0.15, val6_4 = Math.pow(20, 2);
    double resultado4 = val1_4 + val2_4 / val3_4 * val4_4 + val5_4 * val6_4;
    double redondeo3 = Math.round(resultado4);

    private JLabel label1, label2, label3, label4;
    
    public Examen(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Operaciones matematicas");

        label1 = new JLabel("El resultado de la primera operacion es: " + formato1.format(raiz));
        label1.setBounds(10, 25, 400, 30);
        label1.setFont(new Font("Andale Mono", 2, 15));
        add(label1);

        label2 = new JLabel("El resultado de la segunda operacion es: " + redondeo1);
        label2.setBounds(10, 75, 700, 30);
        label2.setFont(new Font("Andale Mono", 2, 15));
        add(label2);

        label3 = new JLabel("El resultado de la tercera operacion es: " + redondeo2);
        label3.setBounds(10, 125, 400, 30);
        label3.setFont(new Font("Andale Mono", 2, 15));
        add(label3);

        label4 = new JLabel("El resultado de la cuarta operacion es: " + redondeo3);
        label4.setBounds(10, 175, 400, 30);
        label4.setFont(new Font("Andale Mono", 2, 15));
        add(label4);
    }
    
    public static void main(String[] args) {
        Examen ex = new Examen();
        ex.setBounds(0,0,500,275);
        ex.setVisible(true);
        ex.setLocationRelativeTo(null);
        ex.setResizable(false);
    }
}
