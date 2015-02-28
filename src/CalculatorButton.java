import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;

public class CalculatorButton extends JButton {

	
	public ActionListener actionListener;
	
	private static final long serialVersionUID = 1L;

	private char symbol;
	
	ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");

	public void addActionListener()
	{
		initActionListener();
		this.addActionListener(actionListener);
	}

	public void initActionListener()
	{
		actionListener = new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Button Pressed");
				if(!(CalculatorButton.this.symbol == '=' || CalculatorButton.this.symbol == 'C'))
				{
					System.out.println("" + CalculatorButton.this.symbol);
					CalculatorInterface.display.setText("" + CalculatorInterface.display.getText() + CalculatorButton.this.symbol);
				}
				else if(CalculatorButton.this.symbol == '=')
				{
					System.out.println("Equals");
					try {
						CalculatorInterface.display.setText("" + (engine.eval(CalculatorInterface.display.getText())));
					} catch (ScriptException e1) {
						// TODO Auto-generated catch block
					CalculatorInterface.display.setText("ERROR!");
					}
				}
				else if(CalculatorButton.this.symbol == 'C')
				{
					CalculatorInterface.display.setText("");
				}
			}
		};
	}

	public CalculatorButton(char symbol, int width, int height, String str)
	{
		super();
		this.setSize(new Dimension(width, height));
		this.setText(str);
		this.symbol = symbol;
		
		
		addActionListener();
	}

}
