import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JFrame implements ActionListener {

    public JCheckBox[] product = new JCheckBox[10];
    public JLabel[] lb = new JLabel[10];
    public JTextArea areaTexto;
    public JButton[] btn =  new JButton[2];
    public String bt[]={"Cerrar aplicacion", "Jugar"};
    public JPasswordField pw;

    public static void main(String[] args) {
        Game demo = new Game();
        demo. setBounds(500,150,500,470);
        demo.setVisible(true);
        demo.setTitle(" Juego ");
    }

    public Game() {
        setLayout(null);
        Container ventana = getContentPane();

        lb[0] = new JLabel("En construccion...");
        lb[0].setBounds(190,20,150,20);
        ventana.add(lb[0]);

        for(int e=0, y=350; e<2; e++, y+=30){
            btn[e] = new JButton(bt[e]);
            btn[e].setBounds(185, y, 140, 30);
            ventana.add(btn[e]);
            btn[e].addActionListener( this); 
        }
    }

    public void actionPerformed(ActionEvent event) {
        Object origen= event.getSource();

        if(origen == btn[1]) System.out.print("Loading... ");
        else System.exit(0);
                

    
    }
}
