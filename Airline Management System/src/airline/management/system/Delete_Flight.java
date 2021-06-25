
package airline.management.system;

import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Delete_Flight extends JFrame{  

    private JTextField textField;
    
    public static void main(String[] args){		 
	new Delete_Flight().setVisible(true);    
    }
    
    public Delete_Flight(){
        
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(860,523);
	setLayout(null);
	setVisible(true);
		
	JLabel Fcode = new JLabel("FLIGHT CODE");
	Fcode.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Fcode.setBounds(80, 100, 200, 30);
	add(Fcode);
	
	JLabel FlightDetails = new JLabel("DELETE FLIGHT INFORMATION");
	FlightDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
	FlightDetails.setForeground(new Color(100, 149, 237));
	FlightDetails.setBounds(50, 20, 570, 35);
	add(FlightDetails);
		
	JButton btnShow = new JButton("DELETE");
	btnShow.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnShow.setBounds(220, 150, 120, 30);
	add(btnShow);
	
        btnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
	
                String code = textField.getText();
                
                try {
                    conn c = new conn();
                    String str = "delete from flight where f_code = '"+code+"'";
      
                    ResultSet rs = c.s.executeQuery(str);
                    
                    JOptionPane.showMessageDialog(null,"Flight Deleted");
                    setVisible(false);

                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        });
        
        textField = new JTextField();
        textField.setBounds(220, 100, 200, 30);
	add(textField);
                
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	setSize(550,270);
        setVisible(true);
        setLocation(400,200);
		
    }
}
        

        

        

      
        
