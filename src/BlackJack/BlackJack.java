package BlackJack;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BlackJack extends JFrame {

	private JPanel contentPane;
	
	public int PlyrScore=0;
	public int CmptrScore = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackJack frame = new BlackJack();
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
	public BlackJack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 992, 690);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Random rnd = new Random();
		Image xd = new ImageIcon(BlackJack.class.getResource("/back.jpg")).getImage();
		
		
		
		JLabel Computer1 = new JLabel("New label");
		Computer1.setBounds(347, 96, 75, 119);
		contentPane.add(Computer1);
		
		Computer1.setIcon(new ImageIcon(xd));
		
		
		JLabel Computer2 = new JLabel("New label");
		Computer2.setBounds(432, 96, 75, 119);
		contentPane.add(Computer2);
		
        Computer2.setIcon(new ImageIcon(xd));
        
        
        
        JLabel Computer3 = new JLabel("");
		Computer3.setBounds(517, 96, 81, 119);
		contentPane.add(Computer3);
		
		Computer3.setIcon(new ImageIcon(xd));
		Computer3.setVisible(false);
		
		
		
		JLabel Computer4 = new JLabel("");
		Computer4.setBounds(608, 96, 75, 119);
		contentPane.add(Computer4);
		
		Computer4.setIcon(new ImageIcon(xd));
		Computer4.setVisible(false);

		JLabel Title = new JLabel("Black Jack Game");
		Title.setBounds(347, 28, 289, 41);
		Title.setFont(new Font("Arial Black", Font.BOLD, 29));
		Title.setForeground(new Color(204, 0, 0));
		contentPane.add(Title);
		
		JLabel TxtCmp = new JLabel("Computer's Cards");
		TxtCmp.setForeground(new Color(255, 250, 250));
		TxtCmp.setFont(new Font("Arial Black", Font.PLAIN, 20));
		TxtCmp.setBounds(40, 131, 211, 57);
		contentPane.add(TxtCmp);
		
		JLabel Player1 = new JLabel("New label");
		Player1.setBackground(new Color(0, 128, 0));
		Player1.setBounds(347, 353, 81, 119);
		contentPane.add(Player1);
		
		Player1.setIcon(new ImageIcon(xd));


		JLabel Player2 = new JLabel("New label");
		Player2.setBounds(448, 353, 81, 119);
		contentPane.add(Player2);
		
		Player2.setIcon(new ImageIcon(xd));
		
		
		
		
		JLabel TxtPlyr = new JLabel("Player' Cards:");
		TxtPlyr.setForeground(new Color(255, 255, 255));
		TxtPlyr.setFont(new Font("Arial Black", Font.PLAIN, 20));
		TxtPlyr.setBounds(40, 388, 211, 57);
		contentPane.add(TxtPlyr);
		
		JLabel Player3 = new JLabel("New label");
		Player3.setBounds(547, 355, 89, 114);
		contentPane.add(Player3);
		Player3.setIcon(new ImageIcon(xd));
		
		Player3.setVisible(false);
		
		JLabel PointCmp = new JLabel("Computer Point: " + CmptrScore);
		PointCmp.setForeground(new Color(255, 255, 255));
		PointCmp.setFont(new Font("Arial Black", Font.PLAIN, 15));
		PointCmp.setBounds(40, 202, 201, 41);
		contentPane.add(PointCmp);
		
		JLabel PlyrPoint = new JLabel("Player Point: " + PlyrScore);
		PlyrPoint.setForeground(new Color(255, 255, 255));
		PlyrPoint.setFont(new Font("Arial Black", Font.PLAIN, 15));
		PlyrPoint.setBounds(40, 458, 192, 41);
		contentPane.add(PlyrPoint);
		
		JButton PlayAgain = new JButton("Play Again !");
		PlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ex= new BlackJack();
				ex.setVisible(true);
			}
		});
		PlayAgain.setFont(new Font("Arial Black", Font.PLAIN, 14));
		PlayAgain.setBounds(617, 227, 132, 41);
		contentPane.add(PlayAgain);
		PlayAgain.setVisible(false);
		
		JButton Exit = new JButton("Exit !");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Exit.setBounds(617, 285, 132, 41);
		contentPane.add(Exit);
		Exit.setVisible(false);
		
		JLabel FinishTxt = new JLabel("");
		FinishTxt.setForeground(new Color(255, 0, 0));
		FinishTxt.setFont(new Font("Arial Black", Font.PLAIN, 18));
		FinishTxt.setBounds(268, 239, 330, 74);
		contentPane.add(FinishTxt);
		
		
		JButton HitBttn = new JButton("Hit!");
		HitBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Card Cmpt2 = new Card();
				Card Plyr3 = new Card();
				
				Player3.setVisible(true);
				
				Computer2.setIcon(new ImageIcon(Cmpt2.getImage()));
				Player3.setIcon(new ImageIcon(Plyr3.getImage()));
				
				PlyrScore+=Plyr3.getPoint();
				CmptrScore+=Cmpt2.getPoint();
				
				if(Plyr3.getFace()=="Ace") {
					if(PlyrScore>=11) {
						Plyr3.setPoint(1);
					}
					
					else {
						Plyr3.setPoint(11);
					}
				}
				
				
				PlyrPoint.setText("Player Point: " + PlyrScore);
				PointCmp.setText("Computer Point: " + CmptrScore);
				
				PlayAgain.setVisible(true);
				Exit.setVisible(true);
				
				if(CmptrScore<17) {
					Card Cmpt3= new Card();
					Computer3.setIcon(new ImageIcon(Cmpt3.getImage()));
					Computer3.setVisible(true);
					CmptrScore+=Cmpt3.getPoint();
					PointCmp.setText("Computer Point: " + CmptrScore);
					
					if(CmptrScore<17) {
						Card Cmpt4= new Card();
						Computer3.setIcon(new ImageIcon(Cmpt4.getImage()));
						Computer3.setVisible(true);
						CmptrScore+=Cmpt4.getPoint();
						PointCmp.setText("Computer Point: " + CmptrScore);
					}
				}
				
				FinishTxt.setVisible(true);
				
				if(CmptrScore<=21) {
					
					if(CmptrScore>PlyrScore) {
						FinishTxt.setText("You Lost !");
					}
					
					else if(PlyrScore>CmptrScore) {
						FinishTxt.setText("You Won !");
					}
					
					else if(CmptrScore==PlyrScore) {
						FinishTxt.setText("Draw !");
					}
				}
				
				else if(CmptrScore>21) {
					
					if(PlyrScore>21) {
						FinishTxt.setText("Draw !");
					}
					
					else if (PlyrScore<=21) {
						FinishTxt.setText("You Won !");
					}
					
					else if(CmptrScore==PlyrScore) {
						FinishTxt.setText("Draw !");
					}
				}
							
			}	
		});
		HitBttn.setFont(new Font("Arial Black", Font.PLAIN, 15));
		HitBttn.setBounds(803, 222, 132, 47);
		contentPane.add(HitBttn);
		HitBttn.setVisible(false);
		
		JButton StayBttn = new JButton("Stay!");
		StayBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Card Cmpt2 = new Card();
				
				
				Computer2.setIcon(new ImageIcon(Cmpt2.getImage()));

				CmptrScore+=Cmpt2.getPoint();
				
				PlyrPoint.setText("Player Point: " + PlyrScore);
				PointCmp.setText("Computer Point: " + CmptrScore);
				
				PlayAgain.setVisible(true);
				Exit.setVisible(true);
				
				if(CmptrScore<17) {
					Card Cmpt3= new Card();
					Computer3.setIcon(new ImageIcon(Cmpt3.getImage()));
					Computer3.setVisible(true);
					CmptrScore+=Cmpt3.getPoint();
					PointCmp.setText("Computer Point: " + CmptrScore);
					
					if(CmptrScore<17) {
						Card Cmpt4= new Card();
						Computer3.setIcon(new ImageIcon(Cmpt4.getImage()));
						Computer3.setVisible(true);
						CmptrScore+=Cmpt4.getPoint();
						PointCmp.setText("Computer Point: " + CmptrScore);
					}
				}
				
				FinishTxt.setVisible(true);
				
				if(CmptrScore<=21) {
					
					if(CmptrScore>PlyrScore) {
						FinishTxt.setText("You Lost !");
					}
					
					else if(PlyrScore>CmptrScore) {
						FinishTxt.setText("You Won !");
					}
					
					else if(CmptrScore==PlyrScore) {
						FinishTxt.setText("Draw !");
					}
				}
				
				else if(CmptrScore>21) {
					
					if(PlyrScore>21) {
						FinishTxt.setText("Draw !");
					}
					
					else if (PlyrScore<=21) {
						FinishTxt.setText("You Won !");
					}
					
					else if(CmptrScore==PlyrScore) {
						FinishTxt.setText("Draw !");
					}
				}
							
			}
		});
		StayBttn.setFont(new Font("Arial Black", Font.PLAIN, 15));
		StayBttn.setBounds(803, 280, 132, 47);
		contentPane.add(StayBttn);
		StayBttn.setVisible(false);	
		
		
		JButton Play = new JButton("Play!");
		Play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HitBttn.setVisible(true);
				StayBttn.setVisible(true);
				
				Play.setVisible(false);
				
				Card Cmpt1 = new Card();
				Card Plyr1 = new Card();
				Card Plyr2 = new Card();
				
				
				Computer1.setIcon(new ImageIcon(Cmpt1.xd));
				Player1.setIcon(new ImageIcon(Plyr1.xd));
				Player2.setIcon(new ImageIcon(Plyr2.xd));
				
				if(Plyr1.getFace()=="Ace") {
					if(PlyrScore>=11) {
						Plyr1.setPoint(1);
					}
					
					else {
						Plyr1.setPoint(11);
					}
				}
				
				else if(Plyr2.getFace()=="Ace") {
					if(PlyrScore>=11) {
						Plyr2.setPoint(1);
					}
					
					else {
						Plyr2.setPoint(11);
					}
				}
				
				PlyrScore=Plyr1.getPoint()+Plyr2.getPoint();
				CmptrScore=Cmpt1.getPoint();
				
				PlyrPoint.setText("Player Point: " + PlyrScore);
				PointCmp.setText("Computer Point: " + CmptrScore);
			}
		});
		
		Play.setFont(new Font("Arial Black", Font.PLAIN, 17));
		Play.setBounds(803, 45, 132, 57);
		contentPane.add(Play);
		
	
	}
}

	

