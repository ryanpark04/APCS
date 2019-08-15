import java.awt.*;
import javax.swing.JFrame;

public class CowFrame extends JFrame {
	private final Color BISQUE = new Color(0xcdb79e);
	
	public CowFrame () {
		init();
	}
	
	public void init() {
		setSize(700,600);
		setBackground(Color.WHITE);
		repaint();
	}
	
	public void paint(Graphics g) {
		int legposx = 120;
		boolean cow = true;
		if (cow) {
			g.setColor(BISQUE);
			g.fillRect(legposx, 300, 30, 130);
			g.fillRect(420, 300, 30, 130);
			g.setColor(Color.PINK);
			g.fillOval(100, 250, 100, 100);
			g.setColor(BISQUE);
			g.fillRect(50,300,50,150);
			g.fillRect(350, 300, 50, 150);
			g.setColor(BISQUE);
			g.fillRect(50, 100, 400, 200);
			g.setColor(BISQUE);
			g.fillOval(350, 50, 200, 100);
			g.setColor(Color.BLACK);
			g.drawOval(350, 50, 200, 100);
			g.fillOval(470,75,20,20);
			
		}
	}
}
