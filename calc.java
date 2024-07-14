import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class calc implements ActionListener{
    Boolean isOperatorClicked=false;
    String oldValue;
    Double newValue;
    Double result;
    
    int clickedOperater = 0;
    String operation;

    JFrame jf;
    JLabel diaplayLabel;
    JButton seveButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton zeroButton;
    JButton pointButton;
    JButton equalButton;
    JButton divButton;
    JButton mulButton;
    JButton addButton;
    JButton subButton;
    JButton clearButton;

    public calc() {
        jf=new JFrame("CALCULATOR");
        jf.setLayout(null);    //cumpalssery
        jf.setBounds(1000, 150, 405, 575);
        //OR
        // jf.setSize(600, 600);  jf.setLocation(300, 150);

        diaplayLabel = new JLabel();
        diaplayLabel.setBounds(5, 50, 300, 80);  //or^^
        diaplayLabel.setFont(new Font ("Arial", Font .PLAIN, 70));
        diaplayLabel.setBackground(Color.GRAY);
        diaplayLabel.setOpaque(true);
        diaplayLabel.setForeground(Color.WHITE);
        diaplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(diaplayLabel);

        seveButton=new JButton("7");
        seveButton.setBounds(5, 150, 80, 80);
        seveButton.addActionListener(this);
        seveButton.setBackground(Color.LIGHT_GRAY);
        seveButton.setForeground(Color.black);  
        seveButton.setOpaque(true);
        seveButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(seveButton);

         eightButton=new JButton("8");
        eightButton.setBounds(105, 150, 80, 80);
        eightButton.addActionListener(this);
        eightButton.setBackground(Color.LIGHT_GRAY);
        eightButton.setForeground(Color.black);  
        eightButton.setOpaque(true);
        eightButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(eightButton);

         nineButton=new JButton("9");
        nineButton.setBounds(205, 150, 80, 80);
        nineButton.addActionListener(this);
        nineButton.setBackground(Color.LIGHT_GRAY);
        nineButton.setForeground(Color.black);  
        nineButton.setOpaque(true);
        nineButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(nineButton);

         fourButton=new JButton("4");
        fourButton.setBounds(5, 250, 80, 80);
        fourButton.addActionListener(this);
        fourButton.setBackground(Color.LIGHT_GRAY);
        fourButton.setForeground(Color.black);  
        fourButton.setOpaque(true);
        fourButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(fourButton);

         fiveButton=new JButton("5");
        fiveButton.setBounds(105, 250, 80, 80);
        fiveButton.addActionListener(this);
        fiveButton.setBackground(Color.LIGHT_GRAY);
        fiveButton.setForeground(Color.black);  
        fiveButton.setOpaque(true);
        fiveButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(fiveButton);

         sixButton=new JButton("6");
        sixButton.setBounds(205, 250, 80, 80);
        sixButton.addActionListener(this);
        sixButton.setBackground(Color.LIGHT_GRAY);
        sixButton.setForeground(Color.black);  
        sixButton.setOpaque(true);
        sixButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(sixButton);

         oneButton=new JButton("1");
        oneButton.setBounds(5, 350, 80, 80);
        oneButton.addActionListener(this);
        oneButton.setBackground(Color.LIGHT_GRAY);
        oneButton.setForeground(Color.black);  
        oneButton.setOpaque(true);
        oneButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(oneButton);

         twoButton=new JButton("2");
        twoButton.setBounds(105, 350, 80, 80);
        twoButton.addActionListener(this);
        twoButton.setBackground(Color.LIGHT_GRAY);
        twoButton.setForeground(Color.black);  
        twoButton.setOpaque(true);
        twoButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(twoButton);

         threeButton=new JButton("3");
        threeButton.setBounds(205, 350, 80, 80);
        threeButton.addActionListener(this);
        threeButton.setBackground(Color.LIGHT_GRAY);
        threeButton.setForeground(Color.black);  
        threeButton.setOpaque(true);
        threeButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(threeButton);

         zeroButton=new JButton("0");
        zeroButton.setBounds(105, 450, 80, 80);
        zeroButton.addActionListener(this);
        zeroButton.setBackground(Color.LIGHT_GRAY);
        zeroButton.setForeground(Color.black);  
        zeroButton.setOpaque(true);
        zeroButton.setFont(new Font ("Arial", Font .PLAIN, 41));
        jf.add(zeroButton);
        
         pointButton=new JButton(".");
        pointButton.setBounds(5, 450, 80, 80);
        pointButton.addActionListener(this);
        pointButton.setBackground(Color.LIGHT_GRAY);
        pointButton.setForeground(Color.black);  
        pointButton.setOpaque(true);
        pointButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(pointButton);

         equalButton=new JButton("=");
        equalButton.setBounds(205, 450, 80, 80);
        equalButton.addActionListener(this);
        equalButton.setBackground(Color.PINK);
        equalButton.setForeground(Color.black);  
        equalButton.setOpaque(true);
        equalButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(equalButton);

         divButton=new JButton("/");
        divButton.setBounds(305, 150, 80, 80);
        divButton.addActionListener(this);
        divButton.setBackground(Color.PINK);
        divButton.setForeground(Color.black);  
        divButton.setOpaque(true);
        divButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(divButton);

         mulButton=new JButton("*");
        mulButton.setBounds(305, 250, 80, 80);
        mulButton.addActionListener(this);
        mulButton.setBackground(Color.PINK);
        mulButton.setForeground(Color.black);  
        mulButton.setOpaque(true);
        mulButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(mulButton);
        
         addButton=new JButton("+");
        addButton.setBounds(305, 350, 80, 80);
        addButton.addActionListener(this);
        addButton.setBackground(Color.PINK);
        addButton.setForeground(Color.black);  
        addButton.setOpaque(true);
        addButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(addButton);

         subButton=new JButton("-");
        subButton.setBounds(305, 450, 80, 80);
        subButton.addActionListener(this);
        subButton.setBackground(Color.PINK);
        subButton.setForeground(Color.black);  
        subButton.setOpaque(true);
        subButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(subButton);

        clearButton=new JButton("C");
        clearButton.setBounds(305, 50, 80, 80);
        clearButton.addActionListener(this);
        clearButton.setBackground(Color.LIGHT_GRAY);
        clearButton.setForeground(Color.black);  
        clearButton.setOpaque(true);
        clearButton.setFont(new Font ("Arial", Font .PLAIN, 40));
        jf.add(clearButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new calc();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==seveButton) {
            if (isOperatorClicked) {
                 diaplayLabel.setText("7"); 
                 isOperatorClicked=false;          
            }else {
                diaplayLabel.setText(diaplayLabel.getText()+"7");
            }          
        }else if(e.getSource()==eightButton){
            if (isOperatorClicked) {
                 diaplayLabel.setText("8"); 
                 isOperatorClicked=false;          
            }else {
                diaplayLabel.setText(diaplayLabel.getText()+"8");
            }
        }else if (e.getSource()==nineButton) {
            if (isOperatorClicked) {
                 diaplayLabel.setText("9"); 
                 isOperatorClicked=false;          
            }else {
                diaplayLabel.setText(diaplayLabel.getText()+"9");
            }
        }else if(e.getSource()==fourButton){
            if (isOperatorClicked) {
                 diaplayLabel.setText("4"); 
                 isOperatorClicked=false;          
            }else {
                diaplayLabel.setText(diaplayLabel.getText()+"4");
            }
        }else if (e.getSource()==fiveButton) {
            if (isOperatorClicked) {
                 diaplayLabel.setText("5"); 
                 isOperatorClicked=false;          
            }else {
                diaplayLabel.setText(diaplayLabel.getText()+"5");
            }
        }else if (e.getSource()==sixButton) {
            if (isOperatorClicked) {
                 diaplayLabel.setText("6"); 
                 isOperatorClicked=false;          
            }else {
                diaplayLabel.setText(diaplayLabel.getText()+"6");
            }
        }else if (e.getSource()==oneButton) {
            if (isOperatorClicked) {
                 diaplayLabel.setText("1"); 
                 isOperatorClicked=false;          
            }else {
                diaplayLabel.setText(diaplayLabel.getText()+"1");
            }        
        }else if (e.getSource()==twoButton) {
           if (isOperatorClicked) {
                 diaplayLabel.setText("2"); 
                 isOperatorClicked=false;          
            }else {
                diaplayLabel.setText(diaplayLabel.getText()+"2");
            }
        }else if (e.getSource()==threeButton) {
            if (isOperatorClicked) {
                 diaplayLabel.setText("3"); 
                 isOperatorClicked=false;          
            }else {
                diaplayLabel.setText(diaplayLabel.getText()+"3");
            }         
        }else if (e.getSource()==pointButton) {
           if (isOperatorClicked) {
                 diaplayLabel.setText("."); 
                 isOperatorClicked=false;          
            }else {
                diaplayLabel.setText(diaplayLabel.getText()+".");
            }          
        }else if (e.getSource()==zeroButton) {
            if (isOperatorClicked) {
                 diaplayLabel.setText("0"); 
                 isOperatorClicked=false;          
            }else {
                diaplayLabel.setText(diaplayLabel.getText()+"0");
            }
        }else if (e.getSource()==equalButton) {                     ///////////////=================
            String newValue=diaplayLabel.getText();

            float oldValueF=Float.parseFloat(oldValue);
            float newValueF=Float.parseFloat(newValue);
                    if (operation=="+") {
                        float result=oldValueF+newValueF;                               
                    diaplayLabel.setText(result+"");
                    }
                    else if (operation=="-") {
                        float result=oldValueF-newValueF;
                        diaplayLabel.setText(result+"");
                    }
                    else if (operation=="*") {
                        float result=oldValueF*newValueF;
                        diaplayLabel.setText(result+"");
                    }
                    else if (operation=="/") {
                        float result=oldValueF/newValueF;
                        diaplayLabel.setText(result+"");
                    }
        }else if (e.getSource()==divButton) {
            operation="/";
            isOperatorClicked=true;
            oldValue=diaplayLabel.getText();
        }else if (e.getSource()==mulButton) {
            operation="*";
            isOperatorClicked=true;
            oldValue=diaplayLabel.getText();   
        }else if (e.getSource()==addButton) {
            operation="+";
            isOperatorClicked=true;
            oldValue=diaplayLabel.getText();
        }else if (e.getSource()==subButton) {
            operation="-";
            isOperatorClicked=true;
            oldValue=diaplayLabel.getText();
        }
        
        else if (e.getSource()==clearButton) {
            diaplayLabel.setText("");
        }
    }
}
