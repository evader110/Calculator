import javax.swing.*;



public class CalculatorPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static JFrame frame;
	static JPanel calculator = new JPanel();
	static JButton[] buttons = new JButton[10];
	
	public static void initFrame()
	{
		frame = new JFrame("Java Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(800, 600);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		
	}
}
