import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyCalcu extends JFrame{
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b0;
    private JButton beq;
    private JButton badd;
    private JButton bsub;
    private JButton bmul;
    private JButton bdiv;
    private JButton bsol;
    private JButton bclr;
	private JPanel mainPanel;
	private JPanel panel;
	private Font font;
    private double TEMP;
    private double SolveTEMP;
    private JTextField display;

    Boolean addBool = false;
    Boolean subBool = false;
    Boolean divBool = false;
    Boolean mulBool = false;

    String s = "";

    public MyCalcu() {
		
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 9));
        panel.add(b1 = new JButton("1"));
		b1.setBackground(Color.gray);
        b1.setForeground(Color.white);
		b1.setFont(new Font("Serif", Font.BOLD, 24));
		
        panel.add(b2 = new JButton("2"));
		b2.setBackground(Color.gray);
        b2.setForeground(Color.white);
		b2.setFont(new Font("Serif", Font.BOLD, 24));
		
        panel.add(b3 = new JButton("3"));
		b3.setBackground(Color.gray);
        b3.setForeground(Color.white);
		b3.setFont(new Font("Serif", Font.BOLD, 24));
		
		panel.add(bclr = new JButton("C"));
		bclr.setBackground(Color.orange);
		bclr.setForeground(Color.white);
		bclr.setFont(new Font("Serif", Font.BOLD, 24));
		
        panel.add(b4 = new JButton("4"));
		b4.setBackground(Color.gray);
        b4.setForeground(Color.white);
		b4.setFont(new Font("Serif", Font.BOLD, 24));
		
        panel.add(b5 = new JButton("5"));
		b5.setBackground(Color.gray);
        b5.setForeground(Color.white);
		b5.setFont(new Font("Serif", Font.BOLD, 24));
		
        panel.add(b6 = new JButton("6"));
		b6.setBackground(Color.gray);
        b6.setForeground(Color.white);
		b6.setFont(new Font("Serif", Font.BOLD, 24));
		
		panel.add(badd = new JButton("+"));
		badd.setBackground(Color.orange);
		badd.setForeground(Color.white);
		badd.setFont(new Font("Serif", Font.BOLD, 24));
		
        panel.add(b7 = new JButton("7"));
		b7.setBackground(Color.gray);
        b7.setForeground(Color.white);
		b7.setFont(new Font("Serif", Font.BOLD, 24));
		
        panel.add(b8 = new JButton("8"));
		b8.setBackground(Color.gray);
        b8.setForeground(Color.white);
		b8.setFont(new Font("Serif", Font.BOLD, 24));
		
        panel.add(b9 = new JButton("9"));
		b9.setBackground(Color.gray);
        b9.setForeground(Color.white);
		b9.setFont(new Font("Serif", Font.BOLD, 24));
		
		panel.add(bsub = new JButton("-"));
		bsub.setBackground(Color.orange);
		bsub.setForeground(Color.white);
		bsub.setFont(new Font("Serif", Font.BOLD, 24));
		
        panel.add(b0 = new JButton("0"));
		b0.setBackground(Color.gray);
        b0.setForeground(Color.white);
		b0.setFont(new Font("Serif", Font.BOLD, 24));
		
		
        panel.add(bmul = new JButton("*"));
		bmul.setBackground(Color.orange);
		bmul.setForeground(Color.white);
		bmul.setFont(new Font("Serif", Font.BOLD, 24));
		
        panel.add(bdiv = new JButton("/"));
		bdiv.setBackground(Color.orange);
		bdiv.setForeground(Color.white);
		bdiv.setFont(new Font("Serif", Font.BOLD, 24));
		
        panel.add(bsol = new JButton("="));
		bsol.setBackground(Color.orange);
		bsol.setForeground(Color.white);
		bsol.setFont(new Font("Serif", Font.BOLD, 24));
		
		

		mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.add(display = new JTextField(11));
        display.setEditable(false);
		Font f = new Font("Serif",Font.BOLD,24);
		display.setFont(f);
		display.setForeground(Color.gray);

  
        mainPanel.add(panel);
		

        add(mainPanel);
		
        


        b1.addActionListener(new ListenToOne());
        b2.addActionListener(new ListenToTwo());
        b3.addActionListener(new ListenToThree());
        b4.addActionListener(new ListenToFour());
        b5.addActionListener(new ListenToFive());
        b6.addActionListener(new ListenToSix());
        b7.addActionListener(new ListenToSeven());
        b8.addActionListener(new ListenToEight());
        b9.addActionListener(new ListenToNine());
        b0.addActionListener(new ListenToZero());

        badd.addActionListener(new ListenToAdd());
        bsub.addActionListener(new ListenToSubtract());
        bmul.addActionListener(new ListenToMultiply());
        bdiv.addActionListener(new ListenToDivide());
        bsol.addActionListener(new ListenToSolve());
        bclr.addActionListener(new ListenToClear());
    } //JavaCaluclator()

    class ListenToClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //display = display.getText();
            display.setText("");
            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;

            TEMP = 0;
            SolveTEMP = 0;
        }
    }

    class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = display.getText();
            display.setText(s + "1");
        }
    }

    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = display.getText();
            display.setText(s + "2");
        }
    }

    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = display.getText();
            display.setText(s + "3");
        }
    }

    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = display.getText();
            display.setText(s + "4");
        }
    }

    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = display.getText();
            display.setText(s + "5");
        }
    }

    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = display.getText();
            display.setText(s + "6");
        }
    }

    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = display.getText();
            display.setText(s + "7");
        }
    }

    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = display.getText();
            display.setText(s + "8");
        }
    }

    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = display.getText();
            display.setText(s + "9");
        }
    }

    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = display.getText();
            display.setText(s + "0");
        }
    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(display.getText());
            display.setText("");
            addBool = true;
        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(display.getText());
            display.setText("");
            subBool = true;
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(display.getText());
            display.setText("");
            mulBool = true;
        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(display.getText());
            display.setText("");
            divBool = true;
        }
    }

    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SolveTEMP = Double.parseDouble(display.getText());
            if (addBool == true)
                SolveTEMP = SolveTEMP + TEMP;
            else if ( subBool == true)
                SolveTEMP = TEMP - SolveTEMP;
            else if ( mulBool == true)
                SolveTEMP = SolveTEMP * TEMP;
            else if ( divBool == true)
                            SolveTEMP = TEMP / SolveTEMP;
            display.setText(  Double.toString(SolveTEMP));

            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;
        }
    }

    public static void main(String[] args) {
        MyCalcu calc = new MyCalcu();
        calc.pack();
        calc.setLocationRelativeTo(null);
                calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				calc.setSize(250,300);
        calc.setVisible(true);
    }

}