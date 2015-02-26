import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorInterface implements ActionListener{
	
	static final int buttonIndex = 0;
	
	static JFrame frame;
	static JPanel calculatorButtons = new JPanel();
	static JButton[] buttons = new JButton[16];
	static JLabel display = new JLabel("");
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void initFrame(){
		
		frame = new JFrame("Java Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(calculatorButtons, BorderLayout.SOUTH);
		frame.add(display, BorderLayout.NORTH);
		frame.setResizable(false);
		frame.setPreferredSize(new Dimension(250,200));
		
		frame.setVisible(true);
		initCalcPanel();
		frame.pack();
	}
	public static void initCalcPanel(){
		calculatorButtons.setLayout(new GridLayout(4,4));
		initButtons();
		for(int i = 1; i < buttons.length; i++){
			calculatorButtons.add(buttons[i]);
		}
		calculatorButtons.add(buttons[0], 14);
	}
	public static void initButtons(){
		for(int i = 0; i < buttons.length; i++){
			buttons[i] = new JButton("" + i);
			buttons[i].addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					CalculatorInterface.display.setText("" + buttons[0].getText());
				}
			});
		}
		buttons[4]  = new JButton("x");
		buttons[8]  = new JButton("/");
		buttons[12] = new JButton("+");
		buttons[15] = new JButton("-");
	}
	
	public static void main(String[] args){
		initFrame();
	}

		
}
