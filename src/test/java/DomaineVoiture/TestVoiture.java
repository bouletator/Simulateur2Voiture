package DomaineVoiture;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestVoiture {
	
	private Voiture maVoiture;
	
	@Before
	public void setUp(){
		maVoiture = new Voiture (100, 50, 10);
	}

    //TODO: bloc given when then
	@Test
	public void  testEvolutionXenFonctionVitesseSurUnTopSeconde() {
		
		maVoiture.miseAJourPosition();
		
		assertEquals(110, maVoiture.getX());
	}
	
	@Test
	public void testAcceleration(){
		
		maVoiture.accelerer();
		
		assertEquals(20, maVoiture.getVitesse());
	}
	
	@Test
	public void testAccelerationLimite() {
		
		maVoiture.setVitesse(100);
		maVoiture.accelerer();
		assertEquals(100, maVoiture.getVitesse());
		
	}

	@Test
	public void testChangementDeSens() {
		
		maVoiture.setDirection(0);
		maVoiture.inverserDirection();
		assertEquals(180, maVoiture.getDirection());
		
	}
	
	@Test
	public void testChangementDeSensEtEvolutionDeX() {
		
		maVoiture.setDirection(0);
		maVoiture.inverserDirection();
		maVoiture.miseAJourPosition();
		assertEquals(90, maVoiture.getX());
		
	}
	
	@Test
	public void testPositionLimiteHaute() {
		
		maVoiture.setVitesse(1000);
		maVoiture.miseAJourPosition();
		assertEquals(1000, maVoiture.getX());
		
	}
	
	@Test
	public void testPositionLimiteBasse() {
		
		maVoiture.setVitesse(1000);
		maVoiture.inverserDirection();
		maVoiture.miseAJourPosition();
		assertEquals(0, maVoiture.getX());
		
	}

	@Test
	public void testDirectionDroite()
	{
		maVoiture.allerADroite();
		maVoiture.miseAJourPosition();
		assertEquals(maVoiture.getX(), 100);
		assertEquals(60,maVoiture.getY());
	}

	@Test
	public void testDirectionGauche(){
		maVoiture.allerAGauche();
		maVoiture.miseAJourPosition();
		assertEquals(maVoiture.getX(), 100);
		assertEquals(40,maVoiture.getY());
	}

	@Test
	public void testChangerSensEtAllerADroite(){
		maVoiture.inverserDirection();
		maVoiture.allerADroite();
		maVoiture.miseAJourPosition();
		assertEquals(40,maVoiture.getY());
	}

	@Test
	public void testChangerSensEtAllerAGauche(){
		maVoiture.inverserDirection();
		maVoiture.allerAGauche();
		maVoiture.miseAJourPosition();
		assertEquals(60,maVoiture.getY());
	}

	@Test
	public void testLimitePositionHauteY(){
		maVoiture.setVitesse(1000);
		maVoiture.allerADroite();
		maVoiture.miseAJourPosition();
		assertEquals(1000,maVoiture.getY());
	}

	@Test
	public void testLimitePositionBasseY(){
		maVoiture.setVitesse(1000);
		maVoiture.allerAGauche();
		maVoiture.miseAJourPosition();
		assertEquals(0,maVoiture.getY());
	}

	@Test
	public void testArretVoiture(){
        int x=maVoiture.getX();
        int y=maVoiture.getY();
        maVoiture.arretervoiture();
        maVoiture.miseAJourPosition();
        assertEquals(x,maVoiture.getX());
        assertEquals(y,maVoiture.getY());
    }

}
