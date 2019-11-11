/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputForm1841720139Fuad extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel2;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton button2;
    private JPanel panel;
    
    
    public MyInputForm1841720139Fuad(){
        createTextFieldFuad();
        createButtonFuad();
        createButton2Fuad();
        createPanelFuad();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    private void createTextFieldFuad(){
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai C: ");
        cLabel = new JLabel("Hasil: ");
        dLabel2 = new JLabel("jumlah: ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }
    
    private void createButtonFuad(){
        button = new JButton("Calculate");
        class AddInterestListener implements ActionListener{
            
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a*b;
                cLabel.setText("Hasil: " + c);
            }
        }
        
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }
    
    private void createButton2Fuad(){
        button2 = new JButton("tambah");
        class AddInterestListener implements ActionListener{
            
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a+b;
                dLabel2.setText("Hasil: " + c);
            }
        }
        
        ActionListener listener = new AddInterestListener();
        button2.addActionListener(listener);
    }
    
   

    private void createPanelFuad() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(button2);
        panel.add(cLabel);
        panel.add(dLabel2);
        add(panel);
    }
    
   
    public static void main(String[] args){
        JFrame frame = new MyInputForm1841720139Fuad();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}