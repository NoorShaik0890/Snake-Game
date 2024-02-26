package snake_GameDevelopment;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	GameFrame(){
		Game_Panel panel = new Game_Panel();
		this.add(panel);
		this.setTitle(" Snake ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);	
	}
}
