public class Evento01Simplificado {
    btn1.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {

        Integer i1 = new Integer(txt1.getText());

        Integer i2 = new Integer(txt2.getText());

        JOptionPane.showMessageDialog(JanelaSoma.this,

        "A soma será "+(i1+i2));

    }
}
