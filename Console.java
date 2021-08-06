import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class C_J_S_Console extends JFrame
{
    private JTextField people = new JTextField(5);
    private JTextField Infected= new JTextField(5);
    private JTextField Cured= new JTextField(5);
    private JTextField oneShot=new JTextField(5);
    private JTextField twoShot=new JTextField(5);
    private JTextField noShot=new JTextField(5);
    private JButton resume = new JButton("Resume");
    private JButton start = new JButton("Start");
    private JButton pause = new JButton("Pause");
    private JFrame panSim =new JFrame("CJS Console For Pandemic");
  //  Image img = Toolkit.getDefaultToolkit().getImage("/Users/claytonforbes/Documents/TestPhoto/Co");//this is for the mac
    JLabel L1;
    
    
    public C_J_S_Console() {
       // super("CJS Console For Pandemic");
         this .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLayout(new GridLayout(5,3));//3,1,10,10
            this.setSize(600, 300);
            this.setLocationRelativeTo(null);
            panSim.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            start.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent ae) {
            		panSim.dispose();
            		new C_J_S_Person();
            	}
            	
            });
    	
            
            
            
        this.setContentPane(new JLabel(new ImageIcon("C:\\Users\\101cl\\OneDrive\\Desktop\\Convid\\Pcovid.jpg")));//windows
        this.setLayout(new FlowLayout());
        L1 = new JLabel();
        add(L1);
        panSim.setSize(500, 300);
        
         
            
            
                
                
            
            
            JPanel panel1 = new JPanel(new GridLayout(1,0));
            panel1.add(new JLabel("Enter the number of populations:"));
            panel1.add(people);
            
            JPanel panel2 = new JPanel(new GridLayout(1,0));
            panel2.add(new JLabel("Enter the number of infected:"));
            panel2.add(Infected);
            
            JPanel panel3 = new JPanel(new GridLayout(1,0));
            panel3.add(new JLabel("Enter the number of cured:"));
            panel3.add(Cured);
            
            JPanel panel4 = new JPanel(new GridLayout(1,0));
            panel4.add(new JLabel("Enter the number of people wwho has one shot:"));
            panel4.add(oneShot);
            
            JPanel panel5 = new JPanel(new GridLayout(1,0));
            panel5.add(new JLabel("Enter the number of people wwho has two shot:"));
            panel5.add(twoShot);
            
            JPanel panel6 = new JPanel(new GridLayout(1,0));
            panel6.add(new JLabel("Enter the number of people wwho has no shot:"));
            panel6.add(noShot);
           
            
            JPanel panel7 = new JPanel(new FlowLayout());
            panel7.add(resume);
            JPanel panel8 = new JPanel(new FlowLayout());
            panel7.add(start);
            
            
            
            JPanel panel9 = new JPanel(new FlowLayout());
            panel7.add(pause);
            
            this.add(panel1);
           this.add(panel2);
            this.add(panel3);
            this.add(panel4);
          this.add(panel5);
            this.add(panel6);
            this.add(panel7);
            //this.add(panel8);
            //this.add(panel9);
            
            
         this.setVisible(true);
    }
    
    
    
    


    public static void main(String[]args)
    {
        new C_J_S_Console();
    }
        
    
            
    
}
