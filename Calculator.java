import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

	public int num1, num2;
	String op;
	public JFrame jFrame;
	public JButton one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, div, mul, equals, CE;
	public JTextField jTextField;
	public JLabel jLabel;

	public Calculator() {
		initcomponents();
	}

	public void initcomponents() {
		jFrame = new JFrame("STANDARD CALCULATOR");
		jTextField = new JTextField();
		jLabel = new JLabel("CALCULATOR");
		jTextField.setBounds(45, 45, 280, 50);
		jLabel.setBounds(150, 10, 120, 30);

		// instance of buttons
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		plus = new JButton("+");
		minus = new JButton("-");
		div = new JButton("/");
		mul = new JButton("*");
		CE = new JButton("CE");
		equals = new JButton("=");

		// size and position of buttons
		// 1st line
		one.setBounds(50, 100, 60, 60);
		two.setBounds(120, 100, 60, 60);
		three.setBounds(190, 100, 60, 60);
		CE.setBounds(260, 100, 60, 60);
		// 2nd line
		four.setBounds(50, 170, 60, 60);
		five.setBounds(120, 170, 60, 60);
		six.setBounds(190, 170, 60, 60);
		minus.setBounds(260, 170, 60, 60);
		// 3rd line
		seven.setBounds(50, 230, 60, 60);
		eight.setBounds(120, 230, 60, 60);
		nine.setBounds(190, 230, 60, 60);
		div.setBounds(260, 230, 60, 60);
		// 4th line
		zero.setBounds(50, 290, 60, 60);
		mul.setBounds(120, 290, 60, 60);
		equals.setBounds(190, 290, 60, 60);
		plus.setBounds(260, 290, 60, 60);

		// setEditable
		jTextField.setEditable(false);

		// add
		jFrame.add(jTextField);
		jFrame.add(one);
		jFrame.add(two);
		jFrame.add(three);
		jFrame.add(four);
		jFrame.add(five);
		jFrame.add(six);
		jFrame.add(seven);
		jFrame.add(eight);
		jFrame.add(nine);
		jFrame.add(zero);
		jFrame.add(plus);
		jFrame.add(minus);
		jFrame.add(div);
		jFrame.add(mul);
		jFrame.add(CE);
		jFrame.add(equals);
		jFrame.add(jLabel);

		// actionlistener
		ActionListeners();

		// jLabel.setFont(new java.awt.Font("STKaiti", 1, 18));
		jFrame.setLayout(null);
		jFrame.setSize(400, 400);
		jFrame.setVisible(true);
	}

	public void ActionListeners() {
		// actionlistener
		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent one) {
				jTextField.setText(jTextField.getText() + "1");
			}
		});

		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent teo) {
				jTextField.setText(jTextField.getText() + "2");
			}
		});

		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent three) {
				jTextField.setText(jTextField.getText() + "3");
			}
		});

		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent four) {
				jTextField.setText(jTextField.getText() + "4");
			}
		});

		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent five) {
				jTextField.setText(jTextField.getText() + "5");
			}
		});

		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent six) {
				jTextField.setText(jTextField.getText() + "6");
			}
		});

		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent seven) {
				jTextField.setText(jTextField.getText() + "7");
			}
		});

		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent eight) {
				jTextField.setText(jTextField.getText() + "8");
			}
		});

		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent nine) {
				jTextField.setText(jTextField.getText() + "9");
			}
		});

		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent zero) {
				jTextField.setText(jTextField.getText() + "0");
			}
		});

		CE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent CE) {
				jTextField.setText("");
			}
		});

		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent plus) {
				num1 = Integer.parseInt(jTextField.getText());
				op = "+";
				jTextField.setText("");
			}
		});

		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent minus) {
				num1 = Integer.parseInt(jTextField.getText());
				op = "-";
				jTextField.setText("");
			}
		});

		div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent div) {
				num1 = Integer.parseInt(jTextField.getText());
				op = "/";
				jTextField.setText("");
			}
		});

		mul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent mul) {
				num1 = Integer.parseInt(jTextField.getText());
				op = "*";
				jTextField.setText("");
			}
		});

		equals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent mul) {
				num2 = Integer.parseInt(jTextField.getText());
				if (op.equals("+")) {
					jTextField.setText((num1 + num2) + "");
				} else if (op.equals("-")) {
					jTextField.setText((num1 - num2) + "");
				} else if (op.equals("*")) {
					jTextField.setText((num1 * num2) + "");
				} else if (op.equals("/")) {
					jTextField.setText((num1 / num2) + "");
				}
			}
		});

	}

	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
	}
}
