
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.*;

public class Evento01 extends JFrame implements ActionListener{
    
    private JTextField txt1, txt2;
    private JButton btn1;
    
    //nossa janela agora implementa a interface ActionListener, e o processo 
    //é desenvolvido no método actionPerformed
    @Override
    public void actionPerformed(ActionEvent e){
       //i1 e i2 armazena os valotes dos formularios txt1 e txt2
        Integer i1 = new Integer(txt1.getText());
        Integer i2 = new Integer(txt2.getText());
        
        //exibe a soma dos dois
        JOptionPane.showMessageDialog(this, "A soma será "+(i1+i2));
    }
    
    //Evento01 é o construtor da class Evento01
    public Evento01() throws HeadlessException {
        
        setLayout(new FlowLayout());
        
        //cria o input text
        add(txt1=new JTextField(5));
        add(txt2=new JTextField(5));
        
        //cria um butão com o nome somar
        add(btn1=new JButton("Somar"));
        
        //dispara o evento
        btn1.addActionListener(this);

    }
    
    public static void main(String[] args) {

        Evento01 j1 = new Evento01();
        j1.setBounds(0,0, 300, 100);
        j1.setVisible(true);

    }

}
