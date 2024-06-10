package BlackJack;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class Card {
	
	String[] FaceCards= {"Ace","2","3","4","5","6","7","8","9","10","King","Queen","Jack"};
	String[] SuitCards = {"Diamond","Clubs","Spades","Hearts"};

	public String Face;
	public String Suit;
	public int Point;
	public Image xd;
	
	Random rnd = new Random();
	
	int x1,x2;
	
	
	public Card(int i,int j) {
	
		FaceCards[i] = this.Face;
		SuitCards[j] = this.Suit;
	
		
	}

	public Card() {
		
		//Random card.
		
		int x1 = rnd.nextInt(4);
		int x2 = rnd.nextInt(13);	
			
		FaceCards[x2] = this.Face;
		SuitCards[x1] = this.Suit;
		 
		 if(x1 == 0) {
			 if(x2 == 0) {
				xd = new ImageIcon( Card.class.getResource("/aced.jpg")).getImage();
			            
			 }
			 if(x2 == 1) {
				 xd = new ImageIcon( Card.class.getResource("/2d.jpg")).getImage();
				 Point=1;     
			 }
			 if(x2 == 2) {
				 xd = new ImageIcon( Card.class.getResource("/3d.jpg")).getImage();
				 Point=3;      
			 }
			 if(x2 == 3) {
				 xd = new ImageIcon( Card.class.getResource("/4d.jpg")).getImage();
				 Point=4;     
			 }
			 if(x2 == 4) {
				 xd = new ImageIcon( Card.class.getResource("/5d.jpg")).getImage();
				 Point=5;     
			 }
			 if(x2 == 5) {
				  xd = new ImageIcon( Card.class.getResource("/6d.jpg")).getImage();
				 Point=6;     
			 }
			 if(x2 == 6) {
				 xd = new ImageIcon( Card.class.getResource("/7d.jpg")).getImage();
				 Point=7;     
			 }
			 if(x2 == 7) {
				 xd = new ImageIcon( Card.class.getResource("/8d.jpg")).getImage();
				 Point=8;     
			 }
			 if(x2 == 8) {
				 xd = new ImageIcon( Card.class.getResource("/9d.jpg")).getImage();
				 Point=9;     
			 }
			 if(x2 == 9) {
				 xd = new ImageIcon( Card.class.getResource("/10d.jpg")).getImage();
				 Point=10;     
			 }
			 if(x2 == 10) {
				 xd = new ImageIcon( Card.class.getResource("/kingd.jpg")).getImage();
				 Point=10;     
			 }
			 if(x2 == 11) {
				 xd = new ImageIcon( Card.class.getResource("/queend.jpg")).getImage();
				 Point=10;     
			 }
			 if(x2 == 12) {
				 xd = new ImageIcon( Card.class.getResource("/jackd.jpg")).getImage();
				 Point=10;     
			 }	 
			 
		 }
		 if(x1 == 1) {
			 if(x2 == 0) {
				 xd = new ImageIcon( Card.class.getResource("/acec.jpg")).getImage();
			         
			 }
			 if(x2 == 1) {
				 xd = new ImageIcon( Card.class.getResource("/2c.jpg")).getImage();
				 Point=2;     
			 }
			 if(x2 == 2) {
				 xd = new ImageIcon( Card.class.getResource("/3c.jpg")).getImage();
				 Point=3;      
			 }
			 if(x2 == 3) {
				 xd = new ImageIcon( Card.class.getResource("/4c.jpg")).getImage();
				 Point=4;     
			 }
			 if(x2 == 4) {
				 xd = new ImageIcon( Card.class.getResource("/5c.jpg")).getImage();
				 Point=5;     
			 }
			 if(x2 == 5) {
				 xd = new ImageIcon( Card.class.getResource("/6c.jpg")).getImage();
				 Point=6;     
			 }
			 if(x2 == 6) {
				 xd = new ImageIcon( Card.class.getResource("/7c.jpg")).getImage();
				 Point=7;     
			 }
			 if(x2 == 7) {
				 xd = new ImageIcon( Card.class.getResource("/8c.jpg")).getImage();
				 Point=8;     
			 }
			 if(x2 == 8) {
				 xd = new ImageIcon( Card.class.getResource("/9c.jpg")).getImage();
				 Point=9;     
			 }
			 if(x2 == 9) {
				 xd = new ImageIcon( Card.class.getResource("/10c.jpg")).getImage();
				 Point=10;     
			 }
			 if(x2 == 10) {
				 xd = new ImageIcon( Card.class.getResource("/kingc.jpg")).getImage();
				 Point=10;     
			 }
			 if(x2 == 11) {
				 xd = new ImageIcon( Card.class.getResource("/queenc.jpg")).getImage();
				 Point=10;     
			 }
			 if(x2 == 12) {
				 xd = new ImageIcon( Card.class.getResource("/jackc.jpg")).getImage();
				 Point=10;     
			 }	 
			 
		 } 
		 if(x1 == 2) {
			 if(x2 == 0) {
				 xd = new ImageIcon( Card.class.getResource("/aces.jpg")).getImage();
				    
			 }
			 if(x2 == 1) {
				 xd = new ImageIcon( Card.class.getResource("/2s.jpg")).getImage();
				 Point=2;     
			 }
			 if(x2 == 2) {
				 xd = new ImageIcon( Card.class.getResource("/3s.jpg")).getImage();
				 Point=3;      
			 }
			 if(x2 == 3) {
				 xd = new ImageIcon( Card.class.getResource("/4s.jpg")).getImage();
				 Point=4;     
			 }
			 if(x2 == 4) {
				 xd = new ImageIcon( Card.class.getResource("/5s.jpg")).getImage();
				 Point=5;     
			 }
			 if(x2 == 5) {
				 xd = new ImageIcon( Card.class.getResource("/6s.jpg")).getImage();
				 Point=6;     
			 }
			 if(x2 == 6) {
				 xd = new ImageIcon( Card.class.getResource("/7s.jpg")).getImage();
				 Point=7;     
			 }
			 if(x2 == 7) {
				 xd = new ImageIcon( Card.class.getResource("/8s.jpg")).getImage();
				 Point=8;     
			 }
			 if(x2 == 8) {
				 xd = new ImageIcon( Card.class.getResource("/9s.jpg")).getImage();
				 Point=9;     
			 }
			 if(x2 == 9) {
				 xd = new ImageIcon( Card.class.getResource("/10s.jpg")).getImage();
				 Point=10;     
			 }
			 if(x2 == 10) {
				 xd = new ImageIcon( Card.class.getResource("/kings.jpg")).getImage();
				 Point=10;     
			 }
			 if(x2 == 11) {
				 xd = new ImageIcon( Card.class.getResource("/queens.jpg")).getImage();
				 Point=10;     
			 }
			 if(x2 == 12) {
				 xd = new ImageIcon( Card.class.getResource("/jacks.jpg")).getImage();
				 Point=10;     
			 }	 
			 
		 }
		 if(x1 == 3) {
			 if(x2 == 0) {
				 xd = new ImageIcon( Card.class.getResource("/aceh.jpg")).getImage();
			         
			 }
			 if(x2 == 1) {
				 xd = new ImageIcon( Card.class.getResource("/2h.jpg")).getImage();
				 Point=2;     
			 }
			 if(x2 == 2) {
				 xd = new ImageIcon( Card.class.getResource("/3h.jpg")).getImage();
				 Point=3;      
			 }
			 if(x2 == 3) {
				 xd = new ImageIcon( Card.class.getResource("/4h.jpg")).getImage();
				 Point=4;     
			 }
			 if(x2 == 4) {
				 xd = new ImageIcon( Card.class.getResource("/5h.jpg")).getImage();
				 Point=5;     
			 }
			 if(x2 == 5) {
				 xd = new ImageIcon( Card.class.getResource("/6h.jpg")).getImage();
				 Point=6;     
			 }
			 if(x2 == 6) {
				 xd = new ImageIcon( Card.class.getResource("/7h.jpg")).getImage();
				 Point=7;     
			 }
			 if(x2 == 7) {
				 xd = new ImageIcon( Card.class.getResource("/8h.jpg")).getImage();
				 Point=8;     
			 }
			 if(x2 == 8) {
				 xd = new ImageIcon( Card.class.getResource("/9h.jpg")).getImage();
				 Point=9;     
			 }
			 if(x2 == 9) {
				 xd = new ImageIcon( Card.class.getResource("/10h.jpg")).getImage();
				 Point=10;     
			 }
			 if(x2 == 10) {
				 xd = new ImageIcon( Card.class.getResource("/kingh.jpg")).getImage();
				 Point=10;     
			 }
			 if(x2 == 11) {
				 xd = new ImageIcon( Card.class.getResource("/queenh.jpg")).getImage();
				 Point=10;     
			 }
			 if(x2 == 12) {
				 xd = new ImageIcon( Card.class.getResource("/jackh.jpg")).getImage();
			     Point=10;    
			 }	 
			 
		 }

	}
	
	
	
	public int getPoint() {
		return Point;
	}
	
	public void setPoint(int x) {
		this.Point=x;
	}

	public String getFace() {
		return Face;
	}



	public void setFace(int x) {
		this.Face = FaceCards[x];
	}



	public String getSuit() {
		return Suit;
	}



	public void setSuit(int x) {
		this.Suit = SuitCards[x];
	}
	
	public Image getImage() {
		return xd;
	}
}
