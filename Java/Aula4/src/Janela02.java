import java.awt.GridLayout;
import javax.swing.*;

public class Janela02 extends JDialog{
    
    private JTextField txt1;
    private JCheckBox chk1,chk2;
    private JRadioButton rb1, rb2;
    private JButton btn1, btn2;

    public Janela02(){
        //organizando o posicionamento dos componentes com um GridLayout de 4 
        //linhas por 2 colunas. 
        setLayout(new GridLayout(4,2));
        
        //adciona Label nome
        add(new JLabel("Nome"));
        
        //adiciona Campo de Texto com 10 posições
        add(txt1=new JTextField(10));
        
        //adciona Label Opções de Leitura
        add(new JLabel("Opções de Leitura"));

        JPanel jp1 = new JPanel(new GridLayout(2,1));

        jp1.add(chk1 = new JCheckBox("Revista Mensal"));

        jp1.add(chk2 = new JCheckBox("Versão Digital"));

        // Painel com as caixas de seleção
        add(jp1);

        add(new JLabel("Graduado"));

        JPanel jp2 = new JPanel(new GridLayout(2,1));

        jp2.add(rb1 = new JRadioButton("sim"));

        jp2.add(rb2 = new JRadioButton("não"));

        //Painel com os botões de rádio
        //os botões de rádio se tornam mutuamente exclusivos apenas se
        //estiverem pertencendo ao mesmo grupo, e por isso precisamos
        //criar um ButtonGroup e adicionar os botões de rádio
        ButtonGroup bp = new ButtonGroup();
        
        bp.add(rb1);

        bp.add(rb2);

        // // Agrupamento dos botões de rádio

        add(jp2);

        add(btn1 = new JButton("OK"));

        add(btn2 = new JButton("Cancela"));
    
    }

    public static void main(String[] args) {
        //definirmos seu posicionamento e suas dimensões, e deixá-lo visível.
        Janela02 j1 = new Janela02();
        
        //setar como modal significa que ficará em frente à janela chamadora, 
        //em um ambiente de múltiplas janelas, evitando perder o foco.
        j1.setModal(true);

        j1.setBounds(0,0, 300, 300);

        j1.setVisible(true);

    }
}   
