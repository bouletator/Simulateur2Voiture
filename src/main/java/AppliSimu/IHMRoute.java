package AppliSimu;

import DomaineVoiture.Route;
import DomaineVoiture.Voiture;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by saindy on 28/03/16.
 */
public class IHMRoute extends JPanel{

    private Route[] routes;

    public IHMRoute(JFrame fenetre, Route ... r)
    {
       routes = r;
        //this.setSize(route.getLongueur_X(), route.getLongueur_Y());
        //this.setBounds(route.getX(),route.getY(),route.getLongueur_X(),route.getLongueur_Y());
       fenetre.add(this);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.black);

        for(int i =0; i < routes.length; i++){
            Route route = routes[i];
            g.fillRect(route.getX(),route.getY(),route.getLongueur_X(),route.getLongueur_Y());
        }


        /*g.fillRect(250,250,95,400);
        g.fillRect(250,600,900,95);
        g.fillRect(1100,50,95,645);*/


    }
}
