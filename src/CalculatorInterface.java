import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorInterface{
	
	static int buttonIndex = 0;
	static final int DEFAULTLENGTH = 75;
	
	static JFrame frame;
	static JPanel calculatorButtons = new JPanel();
	static JPanel operatorButtons = new JPanel();
	static CalculatorButton[] buttons = new CalculatorButton[10];
	static CalculatorButton[] operators = new CalculatorButton[6];
	static JLabel display = new JLabel("WELCOME TO THE GREATEST CALCULATOR ON EARTH!");
	static ActionListener button;
	
	public static void initFrame(){
		
		frame = new JFrame("Java Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(operatorButtons, BorderLayout.EAST);
		frame.add(calculatorButtons, BorderLayout.CENTER);
		frame.add(display, BorderLayout.NORTH);
		frame.setResizable(false);
		frame.setPreferredSize(new Dimension(500,400));
		
		frame.setVisible(true);
		initCalcPanel();
		initOperations();
		frame.pack();
	}
	public static void initOperations(){
		operatorButtons.setLayout(new GridLayout(1, operators.length));
		
		operators[0] = new CalculatorButton('C', DEFAULTLENGTH, DEFAULTLENGTH, "C");
		operators[1] = new CalculatorButton('*', DEFAULTLENGTH, DEFAULTLENGTH, "*");
		operators[2] = new CalculatorButton('/', DEFAULTLENGTH, DEFAULTLENGTH, "/");
		operators[3] = new CalculatorButton('+', DEFAULTLENGTH, DEFAULTLENGTH, "+");
		operators[4] = new CalculatorButton('-', DEFAULTLENGTH, DEFAULTLENGTH, "-");
		operators[5] = new CalculatorButton('=', DEFAULTLENGTH, DEFAULTLENGTH, "=");
		
		for(int i = 0; i < operators.length; i++){
			operatorButtons.add(operators[i]);
		}
	}
	public static void initCalcPanel(){
		
		calculatorButtons.setLayout(new GridLayout(4,3));
		
		for(buttonIndex = 0; buttonIndex < buttons.length; buttonIndex++){
			buttons[buttonIndex] = new CalculatorButton(
					new Integer(buttonIndex).toString().charAt(0), DEFAULTLENGTH, DEFAULTLENGTH, "" + buttonIndex);
		}
		
		for(int i = 1; i < buttons.length; i++){
			calculatorButtons.add(buttons[i]);
		}
		calculatorButtons.add(buttons[0]);
		
	}
	
	public static void main(String[] args){
		initFrame();
	}

	public static int getButtonIndex() {
		return buttonIndex;
	}	
}
