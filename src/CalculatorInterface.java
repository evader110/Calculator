import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CalculatorInterface {
	
	static JFrame frame;
	static JPanel calculatorButtons = new JPanel();
	static JButton[] buttons = new JButton[16];
	
	public static void initFrame(){
		
		frame = new JFrame("Java Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(calculatorButtons);
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
		calculatorButtons.add(buttons[0]);
	}
	public static void initButtons(){
		for(int i = 0; i < buttons.length; i++){
			buttons[i] = new JButton("" + i);
		}
		buttons[3]  = new JButton("x");
		buttons[7]  = new JButton("/");
		buttons[11] = new JButton("+");
		buttons[15] = new JButton("-");
	}
	
	public static void main(String[] args){
		initFrame();
	}
		
}
