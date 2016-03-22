package AppliSimu;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import DomaineVoiture.Voiture;

public class CommandeVoiture extends JPanel implements ActionListener, KeyListener {

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
        fenetre.addKeyListener(this);
        this.maVoiture = maVoiture;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        System.out.println(keyEvent.getKeyCode());
             if(keyEvent.getKeyCode()== KeyEvent.VK_SPACE)
             {
                 maVoiture.arretervoiture();
                 System.out.println(maVoiture.getX()+"  "+maVoiture.getY());
             }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object bouton = event.getSource();
        if (bouton == boutonAccelerer)
            maVoiture.accelerer();
        else if(bouton == boutonInverserDirection)
            maVoiture.inverserDirection();
        else if(bouton == boutonAllerADroite)
            maVoiture.allerADroite();
        else if(bouton == boutonAllerAGauche)
            maVoiture.allerAGauche();

    }



}
