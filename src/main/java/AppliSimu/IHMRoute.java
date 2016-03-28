package AppliSimu;

import DomaineVoiture.Voiture;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by saindy on 28/03/16.
 */
public class IHMRoute  extends JPanel{


   public IHMRoute(JFrame fenetre)
   {
       this.setLocation(0,300);
       fenetre.add(this);
   }

    public IHMRoute()
    {
        this.setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.black);
        g.fillRect(0,250,50000,60);
    }
}
