// import java.applet.*;
import java.awt.*;
/*<applet code="App4" width=600 height=600>
</applet>*/

public class App4{
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.drawOval(30, 30, 30, 30);
		g.setColor(Color.YELLOW);
		g.drawOval(50, 45, 30, 30);
		g.setColor(Color.BLACK);
		g.drawOval(70, 30, 30, 30);
		g.setColor(Color.GREEN);
		g.drawOval(90, 45, 30, 30);
		g.setColor(Color.RED);
		g.drawOval(110, 30, 30, 30);
	}
    public static void main(String[] args) {
        new App4();
    }
}
