package bot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextArea;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTextArea;
import java.awt.Scrollbar;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Canvas;
import java.awt.Window.Type;
import javax.swing.JTextPane;

public class DinoBot {

	private int counter;
	private String convo;
	private JFrame frmDinoBot;
	private JTextField tFMessage;
	private final Action action = new sendMessageAction();
	private JScrollPane scrollPane;
	private JTextPane textPane;
	private StyledDocument doc;
	
	private Style TeeTeeStyle;
	private Style userStyle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DinoBot window = new DinoBot();
					window.frmDinoBot.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DinoBot() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		counter = 0;
		convo = "";
		frmDinoBot = new JFrame();
		frmDinoBot.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ngkat\\Documents\\School\\!!!!UBCO\\18W2\\COSC 310\\dino1.png"));
		frmDinoBot.setTitle("Dino Bot");
		frmDinoBot.setBounds(100, 100, 940, 471);
		frmDinoBot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tFMessage = new JTextField();
		tFMessage.setFont(new Font("Papyrus", Font.PLAIN, 15));
		tFMessage.setColumns(10);
		
		JButton btnSendMsg = new JButton("SEND");
		btnSendMsg.setForeground(new Color(0, 0, 0));
		btnSendMsg.setBackground(new Color(135, 206, 250));
		btnSendMsg.setAction(action);
		btnSendMsg.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frmDinoBot.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
						.addComponent(tFMessage, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSendMsg, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tFMessage, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSendMsg, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(18))
		);
		panel.setLayout(new MigLayout("", "[750px,grow]", "[354px,grow]"));
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBar(null);
		panel.add(scrollPane, "cell 0 0,grow");
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Century", Font.PLAIN, 16));
		scrollPane.setViewportView(textPane);
		
		doc = textPane.getStyledDocument();
		
		frmDinoBot.getContentPane().setLayout(groupLayout);
		
		TeeTeeStyle = textPane.addStyle("teeTeeStyle", null);
		StyleConstants.setFontFamily(TeeTeeStyle,"Century");
		StyleConstants.setForeground(TeeTeeStyle,new Color(50,100,50));
		
		userStyle = textPane.addStyle("userStyle", null);
		StyleConstants.setFontFamily(userStyle,"Papyrus");
		StyleConstants.setForeground(userStyle,new Color(200,50,50));
		
		
		//chatBot.main(null);
		convo += chatBot.welcome();
		//textPane.setText(convo);
		try {
			doc.insertString(doc.getLength(), convo, TeeTeeStyle);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
	
	private void update() {
		try {
			doc.insertString(doc.getLength(), convo, TeeTeeStyle);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tFMessage.setText("");
	}
	
	private class sendMessageAction extends AbstractAction {
		public sendMessageAction() {
			putValue(NAME, "Send Message");
		}
		public void actionPerformed(ActionEvent e) {
			String text = tFMessage.getText();
			try {
				doc.insertString(doc.getLength(), "\n" + text, userStyle);
			} catch (BadLocationException e1) {
				e1.printStackTrace();
			}
			if (counter == 0) {
				convo = "\n" + chatBot.processName(text);
				counter+=1;
			}
			else {
				if(text.equals("wingdings"))
					textPane.setFont(new Font("Wingdings", Font.PLAIN, 15));
				if(text.equals("century"))
					textPane.setFont(new Font("Century", Font.PLAIN, 15));
				if(text.equals("nightmode"))
					frmDinoBot.getContentPane().setBackground(Color.black);
				convo = "\n" + chatBot.processText(text);
			}
			
			update();
		}
	}
}
