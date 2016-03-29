package AppliSimu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;



import DomaineVoiture.Voiture;

public class IHMVoiture extends JFrame implements Observer{

    private double paramatreConversionMetresPixels = 0.5;
    private Voiture maVoiture;
    private CommandeVoiture maCommandeVoiture;
    private int pixelXCourant=0;
    private int pixelYCourant=300;
    private IHMRoute maRoute;


    //TODO : utiliser un observer de la voiture pour les bords
    private void initGraphique() {
        this.setTitle("Simulateur de Voiture");
        this.setSize(505, 505);

      // this.setLayout(new GridLayout(3,2));

        this.maCommandeVoiture = new CommandeVoiture(this, maVoiture);
        this.maRoute=new IHMRoute(this);


        if(maVoiture.getY()==0)
        {
            maCommandeVoiture.boutonAllerAGauche.setEnabled(false);
        }
        else
        {
            maCommandeVoiture.boutonAllerAGauche.setEnabled(true);
        }

        this.setVisible(true);

    }

    public IHMVoiture(Voiture maVoiture) {
        super();
        this.maVoiture = maVoiture;
        maVoiture.addObserver(this);

        initGraphique();
    }

    public IHMVoiture() {
        super();
        initGraphique();
        this.maVoiture = null;
    }

    //TODO: extraire la fonction dans conversion
    public int calculerPositionPixels(int xMetres) {
        return (int) (paramatreConversionMetresPixels*xMetres);
    }




    @Override
    public void update(Observable arg0, Object arg1) {
        this.repaint();
    }

    @Override
    public void paint(Graphics contexteGraphique) {
        super.paint(contexteGraphique);
        contexteGraphique.setColor(Color.red);

        if(maVoiture.directionEnDegres == 90 || maVoiture.directionEnDegres == 270)
            dessinerVoiture2(contexteGraphique);
        else
            dessinerVoiture(contexteGraphique);
    }


    private void dessinerVoiture(Graphics contexteGraphique) {
        int xMetres = maVoiture.getX();
        int xPixel = calculerPositionPixels(xMetres);
        pixelXCourant=xPixel;

        contexteGraphique.fillRect(pixelXCourant, pixelYCourant, 30, 15);
        System.out.println(maVoiture.getX()+"  "+maVoiture.getY());
    }

    private void dessinerVoiture2(Graphics contexteGraphique) {
        int yMetres = maVoiture.getY();
        int yPixel = calculerPositionPixels(yMetres);
        pixelYCourant=300 + yPixel;
        maCommandeVoiture.boutonAllerAGauche.setEnabled(true);
        contexteGraphique.fillRect(pixelXCourant, pixelYCourant, 15, 30);

        System.out.println(maVoiture.getX() + "  " + maVoiture.getY());
    }


}
