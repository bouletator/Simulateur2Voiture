package AppliSimu;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import DomaineVoiture.Voiture;
import org.omg.CORBA.PUBLIC_MEMBER;

public class CommandeVoiture extends JPanel implements ActionListener,KeyListener{

    public JButton boutonAccelerer;
    public JButton boutonInverserDirection;
    public JButton boutonAllerADroite;
    public JButton boutonAllerAGauche;
    private Voiture maVoiture;


    public CommandeVoiture (final JFrame fenetre, final Voiture maVoiture) {

        super();



        this.setLayout(new FlowLayout());

        this.setSize(505,70);

        boutonAccelerer = new JButton("Accelerer");
        boutonAccelerer.addActionListener(this);
        boutonAccelerer.addKeyListener(this);
        this.add(boutonAccelerer);

        boutonInverserDirection = new JButton("Changer direction");
        boutonInverserDirection.addActionListener(this);
        boutonInverserDirection.addKeyListener(this);
        this.add(boutonInverserDirection);

        boutonAllerADroite= new JButton("Droite");
        boutonAllerADroite.addActionListener(this);
        boutonAllerADroite.addKeyListener(this);
        this.add(boutonAllerADroite);

        boutonAllerAGauche = new JButton("Gauche");
        boutonAllerAGauche.addActionListener(this);
        boutonAllerAGauche.addKeyListener(this);
        this.add(boutonAllerAGauche);

        fenetre.setFocusable(true);
        fenetre.addKeyListener(this);

        fenetre.add(this);
        this.maVoiture = maVoiture;

    }

    public void nonFocus()
    {
        boutonAccelerer.setFocusable(false);
        boutonInverserDirection.setFocusable(false);
        boutonAllerADroite.setFocusable(false);
        boutonAllerAGauche.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object bouton = event.getSource();
        if (bouton == boutonAccelerer) {
            maVoiture.accelerer();
            nonFocus();}
        else if(bouton == boutonInverserDirection) {
            maVoiture.inverserDirection();
            nonFocus();}
        else if(bouton == boutonAllerADroite) {
            maVoiture.allerADroite();
            nonFocus();}
        else if(bouton == boutonAllerAGauche) {
            maVoiture.allerAGauche();
            nonFocus();}
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {}

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_SPACE) {
            maVoiture.arretervoiture();
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {}

}
