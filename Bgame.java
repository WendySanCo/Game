import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bgame extends JFrame implements ActionListener {

    private Game Game = new Game();

    private JCheckBox[] product = new JCheckBox[10];
    private JLabel[] lb = new JLabel[10];
    private JTextArea areaTexto;
    private JButton[] btn =  new JButton[2];
    private String bt[]={"Cerrar aplicacion", "Jugar"};
    private JPasswordField pw;

    public static void main(String[] args) {
        Bgame demo = new Bgame();
        demo. setBounds(500,150,500,470);
        demo.setVisible(true);
        demo.setTitle(" Presentacion juego ");
    }

    public Bgame() {
        setLayout(null);
        Container ventana = getContentPane();

        lb[0] = new JLabel("Nombre del juego");
        lb[0].setBounds(190,20,150,20);
        ventana.add(lb[0]);

        lb[1] = new JLabel("Autor 1:");
        lb[1].setBounds(10,80,200,20);
        ventana.add(lb[1]);

        lb[2] = new JLabel("Autor 2:");
        lb[2].setBounds(10,110,200,20);
        ventana.add(lb[2]);

        lb[3] = new JLabel("Descripción:");
        lb[3].setBounds(10,140,200,20);
        ventana.add(lb[3]);

        lb[3] = new JLabel("Descripción:");
        lb[3].setBounds(10,140,200,20);
        ventana.add(lb[3]);

        lb[4] = new JLabel("Usuario: ");
        lb[4].setBounds(10,240,200,20);
        ventana.add(lb[4]);

        pw = new JPasswordField(); 
        pw.setBounds(10,260,200,25);
        ventana.add(pw);


        for(int e=0, y=350; e<2; e++, y+=30){
            btn[e] = new JButton(bt[e]);
            btn[e].setBounds(185, y, 140, 30);
            ventana.add(btn[e]);
            btn[e].addActionListener( this); 
        }
    }

    public void actionPerformed(ActionEvent event) {
        Object origen= event.getSource();
        String a[]={};
        if(origen == btn[1]) Game.main(a);
        else System.exit(0);
                

    
    }
}

// a
