package AppliSimu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import DomaineVoiture.Route;
import DomaineVoiture.Voiture;

public class ProtoSimu {

	public static final int dureeUneSecondeEnMilliSecondes = 500;

	public static void main(String[] args) {

		final Voiture maVoiture = new Voiture (0,0, 10);
		Route r = new Route(0,250,900,85);
		Route r2 = new Route(250,250,95,400);
		Route r3 = new Route(250,600,900,95);
		Route r4 = new Route(1100,50,95,645);
		IHMVoiture monTriangle = new IHMVoiture(maVoiture, r, r2, r3, r4);
		Timer timerAvancer = new Timer(dureeUneSecondeEnMilliSecondes, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				maVoiture.miseAJourPosition();
			}
		});
		
		timerAvancer.start();
		
		while(true){
		}

	}

}
