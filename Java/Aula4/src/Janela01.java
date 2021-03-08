import java.awt.BorderLayout;

import java.awt.Button;

import java.awt.FlowLayout;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import javax.swing.JPanel;

public class Janela01 extends JFrame{
    
    public Janela01() throws HeadlessException {
        //define o titulo da janela
        super("Apenas um teste");
        //layout como BorderLayout (dividido em Norte, Sul, Leste, Oeste e Centro)
        setLayout(new BorderLayout());
        //posição, altura e largura com uso de setBounds
        setBounds(10, 10, 300, 200);
        
        //painel com layout sequencial (FLowLayout), sendo adicionados dois botões a este painel
        JPanel jp = new JPanel(new FlowLayout());
        jp.add(new Button("OK"));
        jp.add(new Button("Cancela"));

        add(jp,"South");
    }
    
    public static void main(String[] args) {
        //abre a janela
        new Janela01().setVisible(true);
    }
}
