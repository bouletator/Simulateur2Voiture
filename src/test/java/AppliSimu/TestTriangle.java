package AppliSimu;


import static org.junit.Assert.*;

import DomaineVoiture.Voiture;
import org.junit.Before;
import org.junit.Test;

public class TestTriangle {

    private Voiture maVoiture;

	@Before
	public void setUp() throws Exception {
        maVoiture = new Voiture(100, 50, 10);
	}
	
	@Test
	public void testConversionMetresPixels() {
		
		IHMVoiture monTriangle = new IHMVoiture(maVoiture,null,null);
		
		int xPixels = monTriangle.calculerPositionPixels(110);
		
		assertEquals(55, xPixels);
	}

}
