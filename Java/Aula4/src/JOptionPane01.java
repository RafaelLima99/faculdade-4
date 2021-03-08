import javax.swing.JOptionPane;
public class JOptionPane01 {
    public static void main(String[] args) {
        
        int a = new Integer(JOptionPane.showInputDialog("Primeiro Número"));
        int b = new Integer(JOptionPane.showInputDialog("Segundo Número"));
        
        int c = a + b;
        
        JOptionPane.showMessageDialog(null,"A soma é: "+c, "Soma", JOptionPane.INFORMATION_MESSAGE);
        
    }   
}
