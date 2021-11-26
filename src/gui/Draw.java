package gui;
import config.*;
import javax.swing.JLabel;
import java.awt.*;

//zeichnen der Gegenstände auf der Zeichenfläche
public class Draw extends JLabel{ 

    protected void paintComponent(Graphics g){

        //Definition von Draw Graphics
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON ); //Pixeldichte wird verbessert

        /*====================
             Gegenstände
        ====================*/ 

        //hintergrund
        g.setColor(new Color(0,225,255)); //alternativ zu new Color(0,0,0) auch möglich new Color.BLACK
        g.fillRect(0, 0, Var.screenwidth, Var.screenwidth); 
        g.setColor(Color.GREEN);
        g.fillRect(0, 500, Var.screenwidth, 100);

    
        
        //Spieler und Ball
        g.setColor(Color.BLACK);
        g.fillRect(Var.x, Var.y, 100, 25); //spieler 
        g.setColor(Color.RED);
        g.fillOval(Var.ballx, Var.bally,20, 20); //ball
        

        
        //Anzeige des Punktestandes
        g.setColor(Color.WHITE);
        g.setFont(g.getFont().deriveFont(40f));
        g.drawString("Score: " + Var.points, 10 , 75);
        g.drawString("BScore: " + Var.bestscore, 10 , 150);
        

        repaint();

    }
}
