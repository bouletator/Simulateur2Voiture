package AppliSimu;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import DomaineVoiture.Voiture;

public class CommandeVoiture extends JPanel implements ActionListener{

    public JButton boutonAccelerer;
    public JButton boutonInverserDirection;
    public JButton boutonAllerADroite;
    public JButton boutonAllerAGauche;
    private Voiture maVoiture;


    public CommandeVoiture (JFrame fenetre, Voiture maVoiture) {

        super();
        this.setLayout(new FlowLayout());

        boutonAccelerer = new JButton("Accelerer");
        boutonAccelerer.addActionListener(this);
        this.add(boutonAccelerer);

        boutonInverserDirection = new JButton("Changer direction");
        boutonInverserDirection.addActionListener(this);
        this.add(boutonInverserDirection);

        boutonAllerADroite= new JButton("Droite");
        boutonAllerADroite.addActionListener(this);
        this.add(boutonAllerADroite);

        boutonAllerAGauche = new JButton("Gauche");
        boutonAllerAGauche.addActionListener(this);
        this.add(boutonAllerAGauche);

        fenetre.add(this);
        this.maVoiture = maVoiture;
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        Object bouton = event.getSource();
        if (bouton == boutonAccelerer)
            maVoiture.accelerer();
        else {
            if(bouton == boutonInverserDirection)
                maVoiture.inverserDirection();
            else{

                if(bouton == boutonAllerADroite)
                    maVoiture.allerADroite();
                else {
                    if(bouton == boutonAllerAGauche)
                        maVoiture.allerAGauche();

                }
            }

        }
    }


}
