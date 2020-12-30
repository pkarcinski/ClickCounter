
package FR;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClickCounter extends JFrame implements ActionListener{
    
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    int counter = 0;
    
    public ClickCounter() {
       
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("click me");
        button.addActionListener(this);
 
        label = new JLabel("Number of clicks : 0" );
       
        panel.setBorder(BorderFactory.createEmptyBorder(80,80,80,80)); // set empty borders from each edge
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(3);
        frame.setBounds(300, 300, 300, 300);
        frame.setTitle("Click counter");
        frame.setVisible(true);
   
        
    }

    public static void main(String[] args) {
        
      new ClickCounter();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("Number of clicks  " + counter);
        
       
        
        
    }
    
}
