import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.JMenuItem;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.Label;
import java.awt.Canvas;
import java.awt.Panel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JRadioButton;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField txtMath;
	double A = 0, B=0;
	int op = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmCalculator = new JFrame();
		frmCalculator.setType(Type.POPUP);
		frmCalculator.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		frmCalculator.setResizable(false);
		frmCalculator.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\calculator-icon-8175.png"));
		frmCalculator.setBackground(new Color(75, 0, 130));
		frmCalculator.getContentPane().setBackground(new Color(119, 136, 153));
		frmCalculator.setAlwaysOnTop(true);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 259, 365);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

		txtMath = new JTextField();
		txtMath.setForeground(new Color(255, 255, 255));
		txtMath.setBackground(new Color(147, 112, 219));
		txtMath.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMath.setEditable(false);
		txtMath.setBounds(10, 10, 234, 52);
		frmCalculator.getContentPane().add(txtMath);
		txtMath.setColumns(10);

		JButton btn1 = new JButton("1");
		btn1.setSelectedIcon(null);
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBackground(new Color(0, 0, 128));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtMath.getText().isEmpty()) {
					txtMath.setText("1");
				} else {
					if (txtMath.getText().indexOf(".") != -1) {
						if (txtMath.getText().substring(0, txtMath.getText().indexOf(".")).length() < 12 && txtMath
								.getText().substring(txtMath.getText().indexOf(".") + 1, txtMath.getText().length())
								.length() < 7) {
							txtMath.setText(txtMath.getText() + "1");
						}
					} else {
						if (txtMath.getText().length() < 12) {
							txtMath.setText(txtMath.getText() + "1");
						}
					}

				}

			}
		});
		btn1.setBounds(10, 105, 45, 23);
		frmCalculator.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setBackground(new Color(0, 0, 128));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtMath.getText().isEmpty()) {
					txtMath.setText("2");
				} else {
					if (txtMath.getText().indexOf(".") != -1) {
						if (txtMath.getText().substring(0, txtMath.getText().indexOf(".")).length() < 12 && txtMath
								.getText().substring(txtMath.getText().indexOf(".") + 1, txtMath.getText().length())
								.length() < 7) {
							txtMath.setText(txtMath.getText() + "2");
						}
					} else {
						if (txtMath.getText().length() < 12) {
							txtMath.setText(txtMath.getText() + "2");
						}
					}

				}
			}
		});
		btn2.setBounds(65, 105, 45, 23);
		frmCalculator.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBackground(new Color(0, 0, 128));
		btn3.setBounds(120, 105, 45, 23);
		frmCalculator.getContentPane().add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtMath.getText().isEmpty()) {
					txtMath.setText("3");
				} else {
					if (txtMath.getText().indexOf(".") != -1) {
						if (txtMath.getText().substring(0, txtMath.getText().indexOf(".")).length() < 12 && txtMath
								.getText().substring(txtMath.getText().indexOf(".") + 1, txtMath.getText().length())
								.length() < 7) {
							txtMath.setText(txtMath.getText() + "3");
						}
					} else {
						if (txtMath.getText().length() < 12) {
							txtMath.setText(txtMath.getText() + "3");
						}
					}

				}
			}
		});

		JButton btn4 = new JButton("4");
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setBackground(new Color(0, 0, 128));
		btn4.setBounds(10, 138, 45, 23);
		frmCalculator.getContentPane().add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtMath.getText().isEmpty()) {
					txtMath.setText("4");
				} else {
					if (txtMath.getText().indexOf(".") != -1) {
						if (txtMath.getText().substring(0, txtMath.getText().indexOf(".")).length() < 12 && txtMath
								.getText().substring(txtMath.getText().indexOf(".") + 1, txtMath.getText().length())
								.length() < 7) {
							txtMath.setText(txtMath.getText() + "4");
						}
					} else {
						if (txtMath.getText().length() < 12) {
							txtMath.setText(txtMath.getText() + "4");
						}
					}

				}
			}
		});
		JButton btn5 = new JButton("5");
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setBackground(new Color(0, 0, 128));
		btn5.setBounds(65, 138, 45, 23);
		frmCalculator.getContentPane().add(btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtMath.getText().isEmpty()) {
					txtMath.setText("5");
				} else {
					if (txtMath.getText().indexOf(".") != -1) {
						if (txtMath.getText().substring(0, txtMath.getText().indexOf(".")).length() < 12 && txtMath
								.getText().substring(txtMath.getText().indexOf(".") + 1, txtMath.getText().length())
								.length() < 7) {
							txtMath.setText(txtMath.getText() + "5");
						}
					} else {
						if (txtMath.getText().length() < 12) {
							txtMath.setText(txtMath.getText() + "5");
						}
					}

				}
			}
		});

		JButton btn6 = new JButton("6");
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setBackground(new Color(0, 0, 128));
		btn6.setBounds(120, 138, 45, 23);
		frmCalculator.getContentPane().add(btn6);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtMath.getText().isEmpty()) {
					txtMath.setText("6");
				} else {
					if (txtMath.getText().indexOf(".") != -1) {
						if (txtMath.getText().substring(0, txtMath.getText().indexOf(".")).length() < 12 && txtMath
								.getText().substring(txtMath.getText().indexOf(".") + 1, txtMath.getText().length())
								.length() < 7) {
							txtMath.setText(txtMath.getText() + "6");
						}
					} else {
						if (txtMath.getText().length() < 12) {
							txtMath.setText(txtMath.getText() + "6");
						}
					}

				}
			}
		});

		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setBackground(new Color(0, 0, 128));
		btn7.setBounds(10, 171, 45, 23);
		frmCalculator.getContentPane().add(btn7);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtMath.getText().isEmpty()) {
					txtMath.setText("7");
				} else {
					if (txtMath.getText().indexOf(".") != -1) {
						if (txtMath.getText().substring(0, txtMath.getText().indexOf(".")).length() < 12 && txtMath
								.getText().substring(txtMath.getText().indexOf(".") + 1, txtMath.getText().length())
								.length() < 7) {
							txtMath.setText(txtMath.getText() + "7");
						}
					} else {
						if (txtMath.getText().length() < 12) {
							txtMath.setText(txtMath.getText() + "7");
						}
					}

				}
			}
		});

		JButton btn8 = new JButton("8");
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setBackground(new Color(0, 0, 128));
		btn8.setBounds(65, 171, 45, 23);
		frmCalculator.getContentPane().add(btn8);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtMath.getText().isEmpty()) {
					txtMath.setText("8");
				} else {
					if (txtMath.getText().indexOf(".") != -1) {
						if (txtMath.getText().substring(0, txtMath.getText().indexOf(".")).length() < 12 && txtMath
								.getText().substring(txtMath.getText().indexOf(".") + 1, txtMath.getText().length())
								.length() < 7) {
							txtMath.setText(txtMath.getText() + "8");
						}
					} else {
						if (txtMath.getText().length() < 12) {
							txtMath.setText(txtMath.getText() + "8");
						}
					}

				}
			}
		});
		JButton btn9 = new JButton("9");
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setBackground(new Color(0, 0, 128));
		btn9.setBounds(120, 171, 45, 23);
		frmCalculator.getContentPane().add(btn9);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtMath.getText().isEmpty()) {
					txtMath.setText("9");
				} else {
					if (txtMath.getText().indexOf(".") != -1) {
						if (txtMath.getText().substring(0, txtMath.getText().indexOf(".")).length() < 12 && txtMath
								.getText().substring(txtMath.getText().indexOf(".") + 1, txtMath.getText().length())
								.length() < 7) {
							txtMath.setText(txtMath.getText() + "9");
						}
					} else {
						if (txtMath.getText().length() < 12) {
							txtMath.setText(txtMath.getText() + "9");
						}
					}

				}
			}
		});

		JButton btn11 = new JButton("0");
		btn11.setForeground(new Color(255, 255, 255));
		btn11.setBackground(new Color(0, 0, 128));
		btn11.setBounds(65, 205, 45, 23);
		frmCalculator.getContentPane().add(btn11);

		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtMath.getText().isEmpty()) {
					if (txtMath.getText().indexOf(".") != -1) {
						if (txtMath.getText().substring(0, txtMath.getText().indexOf(".")).length() < 12 && txtMath
								.getText().substring(txtMath.getText().indexOf(".") + 1, txtMath.getText().length())
								.length() < 7) {
							txtMath.setText(txtMath.getText() + "0");
						}
					} else {
						if (txtMath.getText().length() < 12) {
							txtMath.setText(txtMath.getText() + "0");
						}
					}

				}

			}
		});
		JButton btn15 = new JButton("+");
		btn15.setForeground(new Color(255, 255, 255));
		btn15.setBackground(new Color(75, 0, 130));
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtMath.getText().isEmpty()) {
					A= Double.parseDouble(txtMath.getText());
				}
				B = 0;
				op=0;
				txtMath.setText("");
			}
		});
		btn15.setBounds(175, 105, 69, 23);
		frmCalculator.getContentPane().add(btn15);

		JButton btn16 = new JButton("-");
		btn16.setForeground(new Color(255, 255, 255));
		btn16.setBackground(new Color(75, 0, 130));
		btn16.setBounds(175, 138, 69, 23);
		frmCalculator.getContentPane().add(btn16);
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtMath.getText().isEmpty()) {
					A= Double.parseDouble(txtMath.getText());
				}
				B = 0;
				op=1;
				txtMath.setText("");
			}
		});
		JButton btn17 = new JButton("x");
		btn17.setForeground(new Color(255, 255, 255));
		btn17.setBackground(new Color(75, 0, 130));
		btn17.setBounds(175, 171, 69, 23);
		frmCalculator.getContentPane().add(btn17);
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!txtMath.getText().isEmpty()) {
					A= Double.parseDouble(txtMath.getText());
				}
				B = 0;
				op=2;
				txtMath.setText("");
			}
		});
		JButton btn18 = new JButton("\u00F7");
		btn18.setForeground(new Color(255, 255, 255));
		btn18.setBackground(new Color(75, 0, 130));
		btn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtMath.getText().isEmpty()) {
					A= Double.parseDouble(txtMath.getText());
				}
				B = 0;
				op=3;
				txtMath.setText("");
			}
		});
		btn18.setBounds(175, 203, 69, 23);
		frmCalculator.getContentPane().add(btn18);

		JButton btn10 = new JButton("\u221A");
		btn10.setForeground(new Color(255, 255, 255));
		btn10.setBackground(new Color(0, 0, 128));
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtMath.setText(String.valueOf(Math.sqrt(Double.parseDouble((txtMath.getText())))));
			}
		});
		btn10.setFont(new Font("Arial", Font.PLAIN, 12));
		btn10.setBounds(10, 204, 45, 23);
		frmCalculator.getContentPane().add(btn10);

		JButton btn12 = new JButton(".");
		btn12.setForeground(new Color(255, 255, 255));
		btn12.setBackground(new Color(0, 0, 128));
		btn12.setBounds(120, 204, 45, 23);
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtMath.getText().indexOf(".") == -1) {
					txtMath.setText(txtMath.getText() + ".");
				}				
			}
		});
		frmCalculator.getContentPane().add(btn12);
		JButton btn13 = new JButton("C");
		btn13.setForeground(new Color(255, 255, 255));
		btn13.setBackground(new Color(102, 0, 153));
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMath.setText("");
			}
		});
		btn13.setBounds(10, 72, 155, 23);
		frmCalculator.getContentPane().add(btn13);

		JLabel lblMadeByAries = new JLabel("Made by AriesWu");
		lblMadeByAries.setForeground(new Color(105, 105, 105));
		lblMadeByAries.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMadeByAries.setBounds(0, 296, 254, 15);
		frmCalculator.getContentPane().add(lblMadeByAries);

		JButton btn14 = new JButton("\u2190Del");
		btn14.setForeground(new Color(255, 255, 255));
		btn14.setBackground(new Color(102, 0, 153));
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMath.getText().length() != 0) {
					String tm = txtMath.getText().substring(0, txtMath.getText().length() - 1);
					txtMath.setText(tm);
				}
			}
		});

		btn14.setBounds(175, 72, 69, 23);
		frmCalculator.getContentPane().add(btn14);

		JLabel label = new JLabel(
				"-------------------------------------------------------------------------------------");
		label.setForeground(new Color(135, 206, 250));
		label.setBounds(0, 280, 265, 15);
		frmCalculator.getContentPane().add(label);

		JButton btn19 = new JButton("=");
		btn19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!txtMath.getText().isEmpty()) {
					B = Double.parseDouble(txtMath.getText());
				}
				switch(op) {
					case 0:
						
						if (Double.toString(A+B).indexOf(".") == -1) {
							txtMath.setText(Integer.toString((int)(A+B)));
						}else {
							txtMath.setText(Double.toString(A+B));
						}
						break;
					case 1:
						if (Double.toString(A-B).indexOf(".") == -1) {
							txtMath.setText(Integer.toString((int)(A-B)));
						}else {
							txtMath.setText(Double.toString(A-B));
						}
						break;
					case 2:
						if (Double.toString(A*B).indexOf(".") == -1) {
							txtMath.setText(Integer.toString((int)(A*B)));
						}else {
							txtMath.setText(Double.toString(A*B));
						}
						break;
					case 3:
						if (Double.toString(A/B).indexOf(".") == -1) {
							txtMath.setText(Integer.toString((int)(A/B)));
						}else {
							txtMath.setText(Double.toString(A/B));
						}
						break;
				}
				
			}
		});
		btn19.setForeground(new Color(255, 255, 255));
		btn19.setBackground(new Color(75, 0, 130));
		btn19.setBounds(175, 232, 69, 23);
		frmCalculator.getContentPane().add(btn19);

		JRadioButton rdbtnCLock = new JRadioButton("C Lock");
		rdbtnCLock.setVerticalAlignment(SwingConstants.TOP);
		rdbtnCLock.setForeground(new Color(0, 102, 204));
		rdbtnCLock.setBounds(10, 230, 64, 26);
		rdbtnCLock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnCLock.isSelected()) {
					btn13.setEnabled(false);
				} else {
					btn13.setEnabled(true);
				}
			}
		});
		frmCalculator.getContentPane().add(rdbtnCLock);
		rdbtnCLock.setBackground(new Color(119, 136, 153));

		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setBackground(new Color(102, 102, 255));
		frmCalculator.setJMenuBar(menuBar);

		JMenu menu = new JMenu("Setting");
		menuBar.add(menu);

		JMenu mnStyle = new JMenu("Style");
		menu.add(mnStyle);

		JRadioButtonMenuItem Lookingforward = new JRadioButtonMenuItem("LookingForward");
		JRadioButtonMenuItem blackStyle = new JRadioButtonMenuItem("Black style");
		blackStyle.setActionCommand("");
		JRadioButtonMenuItem rdbtnmntmNormalBlueStyle = new JRadioButtonMenuItem("Normal Blue Style");
		rdbtnmntmNormalBlueStyle.setSelected(true);
		blackStyle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCalculator.getContentPane().setBackground(Color.BLACK);
				rdbtnCLock.setBackground(Color.BLACK);
				btn1.setForeground(new Color(255, 255, 255));
				btn1.setBackground(new Color(45, 45, 45));
				btn2.setForeground(new Color(255, 255, 255));
				btn2.setBackground(new Color(45, 45, 45));
				btn3.setForeground(new Color(255, 255, 255));
				btn3.setBackground(new Color(45, 45, 45));
				btn4.setForeground(new Color(255, 255, 255));
				btn4.setBackground(new Color(45, 45, 45));
				btn5.setForeground(new Color(255, 255, 255));
				btn5.setBackground(new Color(45, 45, 45));
				btn6.setForeground(new Color(255, 255, 255));
				btn6.setBackground(new Color(45, 45, 45));
				btn7.setForeground(new Color(255, 255, 255));
				btn7.setBackground(new Color(45, 45, 45));
				btn8.setForeground(new Color(255, 255, 255));
				btn8.setBackground(new Color(45, 45, 45));
				btn9.setForeground(new Color(255, 255, 255));
				btn9.setBackground(new Color(45, 45, 45));
				btn10.setForeground(new Color(255, 255, 255));
				btn10.setBackground(new Color(45, 45, 45));
				btn11.setForeground(new Color(255, 255, 255));
				btn11.setBackground(new Color(45, 45, 45));
				btn12.setForeground(new Color(255, 255, 255));
				btn12.setBackground(new Color(45, 45, 45));
				btn13.setForeground(new Color(0, 0, 0));
				btn13.setBackground(new Color(145, 145, 145));
				btn14.setForeground(new Color(0, 0, 0));
				btn14.setBackground(new Color(145, 145, 145));
				btn15.setForeground(new Color(0, 0, 0));
				btn15.setBackground(new Color(145, 145, 145));
				btn16.setForeground(new Color(0, 0, 0));
				btn16.setBackground(new Color(145, 145, 145));
				btn17.setForeground(new Color(0, 0, 0));
				btn17.setBackground(new Color(145, 145, 145));
				btn18.setForeground(new Color(0, 0, 0));
				btn18.setBackground(new Color(145, 145, 145));
				btn19.setForeground(new Color(0, 0, 0));
				btn19.setBackground(new Color(145, 145, 145));
				txtMath.setBackground(new Color(145, 145, 145));
				label.setForeground(Color.white);
				menuBar.setBackground(Color.black);
			}
		});
		rdbtnmntmNormalBlueStyle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCalculator.getContentPane().setBackground(new Color(119, 136, 153));
				rdbtnCLock.setBackground(new Color(119, 136, 153));
				btn1.setForeground(new Color(255, 255, 255));
				btn1.setBackground(new Color(0, 0, 128));
				btn2.setForeground(new Color(255, 255, 255));
				btn2.setBackground(new Color(0, 0, 128));
				btn3.setForeground(new Color(255, 255, 255));
				btn3.setBackground(new Color(0, 0, 128));
				btn4.setForeground(new Color(255, 255, 255));
				btn4.setBackground(new Color(0, 0, 128));
				btn5.setForeground(new Color(255, 255, 255));
				btn5.setBackground(new Color(0, 0, 128));
				btn6.setForeground(new Color(255, 255, 255));
				btn6.setBackground(new Color(0, 0, 128));
				btn7.setForeground(new Color(255, 255, 255));
				btn7.setBackground(new Color(0, 0, 128));
				btn8.setForeground(new Color(255, 255, 255));
				btn8.setBackground(new Color(0, 0, 128));
				btn9.setForeground(new Color(255, 255, 255));
				btn9.setBackground(new Color(0, 0, 128));
				btn10.setForeground(new Color(255, 255, 255));
				btn10.setBackground(new Color(0, 0, 128));
				btn11.setForeground(new Color(255, 255, 255));
				btn11.setBackground(new Color(0, 0, 128));
				btn12.setForeground(new Color(255, 255, 255));
				btn12.setBackground(new Color(0, 0, 128));
				btn13.setForeground(new Color(255, 255, 255));
				btn13.setBackground(new Color(102, 0, 153));
				btn14.setForeground(new Color(255, 255, 255));
				btn14.setBackground(new Color(102, 0, 153));
				btn15.setForeground(new Color(255, 255, 255));
				btn15.setBackground(new Color(75, 0, 130));
				btn16.setForeground(new Color(255, 255, 255));
				btn16.setBackground(new Color(75, 0, 130));
				btn17.setForeground(new Color(255, 255, 255));
				btn17.setBackground(new Color(75, 0, 130));
				btn18.setForeground(new Color(255, 255, 255));
				btn18.setBackground(new Color(75, 0, 130));
				btn19.setForeground(new Color(255, 255, 255));
				btn19.setBackground(new Color(75, 0, 130));
				txtMath.setForeground(new Color(255, 255, 255));
				txtMath.setBackground(new Color(147, 112, 219));
				label.setForeground(new Color(135, 206, 250));

				menuBar.setBackground(new Color(102, 102, 255));
			}
		});
		Lookingforward.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frmCalculator.getContentPane().setBackground(new Color(255, 255, 255));
				rdbtnCLock.setBackground(new Color(255, 255, 255));
				rdbtnCLock.setForeground(new Color(110, 110, 110));
				btn1.setForeground(new Color(255, 255, 255));
				btn1.setBackground(new Color(110, 110, 110));
				btn2.setForeground(new Color(255, 255, 255));
				btn2.setBackground(new Color(110, 110, 110));
				btn3.setForeground(new Color(255, 255, 255));
				btn3.setBackground(new Color(110, 110, 110));
				btn4.setForeground(new Color(255, 255, 255));
				btn4.setBackground(new Color(110, 110, 110));
				btn5.setForeground(new Color(255, 255, 255));
				btn5.setBackground(new Color(110, 110, 110));
				btn6.setForeground(new Color(255, 255, 255));
				btn6.setBackground(new Color(110, 110, 110));
				btn7.setForeground(new Color(255, 255, 255));
				btn7.setBackground(new Color(110, 110, 110));
				btn8.setForeground(new Color(255, 255, 255));
				btn8.setBackground(new Color(110, 110, 110));
				btn9.setForeground(new Color(255, 255, 255));
				btn9.setBackground(new Color(110, 110, 110));
				btn10.setForeground(new Color(255, 255, 255));
				btn10.setBackground(new Color(110, 110, 110));
				btn11.setForeground(new Color(255, 255, 255));
				btn11.setBackground(new Color(110, 110, 110));
				btn12.setForeground(new Color(255, 255, 255));
				btn12.setBackground(new Color(110, 110, 110));
				btn13.setForeground(new Color(255, 255, 255));
				btn13.setBackground(new Color(110, 110, 110));
				btn14.setForeground(new Color(255, 255, 255));
				btn14.setBackground(new Color(110, 110, 110));
				btn15.setForeground(new Color(255, 255, 255));
				btn15.setBackground(new Color(110, 110, 110));
				btn16.setForeground(new Color(255, 255, 255));
				btn16.setBackground(new Color(110, 110, 110));
				btn17.setForeground(new Color(255, 255, 255));
				btn17.setBackground(new Color(110, 110, 110));
				btn18.setForeground(new Color(255, 255, 255));
				btn18.setBackground(new Color(110, 110, 110));
				btn19.setForeground(new Color(255, 255, 255));
				btn19.setBackground(new Color(110, 110, 110));
				txtMath.setForeground(new Color(255, 255, 255));
				txtMath.setBackground(new Color(110, 110, 110));
				label.setForeground(new Color(135, 206, 250));
				menuBar.setBackground(Color.white);
			}

		});
		ButtonGroup group = new ButtonGroup();
		mnStyle.add(rdbtnmntmNormalBlueStyle);
		mnStyle.add(blackStyle);
		mnStyle.add(Lookingforward);
		group.add(rdbtnmntmNormalBlueStyle);
		group.add(blackStyle);
		group.add(Lookingforward);

	}
}
