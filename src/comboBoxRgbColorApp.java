

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class comboBoxRgbColorApp extends JFrame {

	private JPanel contentPane;
	DefaultComboBoxModel rmodel = new DefaultComboBoxModel();
	DefaultComboBoxModel gmodel = new DefaultComboBoxModel();
	DefaultComboBoxModel bmodel = new DefaultComboBoxModel();
	
	JLabel Label = new JLabel("New label");
	JButton Button = new JButton("New button");
	JTextField TextField = new JTextField();
	
	int r,g,b;
	JComponent x;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					comboBoxRgbColorApp frame = new comboBoxRgbColorApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public comboBoxRgbColorApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		for(int i=0;i<256;i++) {
			rmodel.addElement(i);
			gmodel.addElement(i);
			bmodel.addElement(i);
		}
		JComboBox cred = new JComboBox();
		cred.setModel(rmodel);
		cred.setBackground(Color.RED);
		cred.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cred.setBounds(28, 24, 88, 37);
		contentPane.add(cred);
		
		JComboBox cgreen = new JComboBox();
		
		cgreen.setModel(gmodel);
		cgreen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cgreen.setBackground(Color.GREEN);
		cgreen.setBounds(126, 24, 88, 37);
		contentPane.add(cgreen);
		
		JComboBox cblue = new JComboBox();
		
		cblue.setModel(bmodel);
		cblue.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cblue.setBackground(Color.BLUE);
		cblue.setBounds(224, 24, 88, 37);
		contentPane.add(cblue);
		
		Label.setHorizontalAlignment(SwingConstants.CENTER);
		Label.setBounds(160, 219, 96, 30);
		contentPane.add(Label);
		Label.setOpaque(true);
		
		Button.setBounds(27, 219, 96, 27);
		contentPane.add(Button);
		
		TextField.setText("TextField");
		TextField.setHorizontalAlignment(SwingConstants.CENTER);
		TextField.setBounds(325, 224, 86, 20);
		contentPane.add(TextField);
		TextField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(355, 24, 86, 32);
		contentPane.add(comboBox);
		
		r = g = b = 0;
		comboBox.addItem(Button);
		comboBox.addItem(Label);
		comboBox.addItem(TextField);
		
		JLabel lblNewLabel = new JLabel("MUSTAFA ERCAN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(269, 273, 172, 29);
		contentPane.add(lblNewLabel);
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				x = (JComponent) comboBox.getSelectedItem();
		
					cred.addItemListener(new ItemListener() {
						public void itemStateChanged(ItemEvent e) {
							r = (int) cred.getSelectedIndex();
							x.setBackground(new Color(r,g,b));
						}
					});
					
					cgreen.addItemListener(new ItemListener() {
						public void itemStateChanged(ItemEvent e) {
							g = (int) cgreen.getSelectedIndex();
							x.setBackground(new Color(r,g,b));
						}
					});
					
					cblue.addItemListener(new ItemListener() {
						public void itemStateChanged(ItemEvent e) {
							b = (int) cblue.getSelectedIndex();
							x.setBackground(new Color(r,g,b));
						}
					});					
			}
		});

		
	}
}