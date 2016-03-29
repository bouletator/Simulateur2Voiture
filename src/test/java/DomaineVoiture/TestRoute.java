package DomaineVoiture;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * Created by clement on 29/03/2016.
 */
public class TestRoute {

    private Route route;

    @Before
    public void setUp(){
        route = new Route (0,250,900,85);
    }

    @Test
    public void testGetX(){
        assertEquals(0,route.getX());
    }

    @Test
    public void testGetY(){
        assertEquals(250, route.getY());
    }

    @Test
    public void testGetLongueur_X(){
        assertEquals(900, route.getLongueur_X());
    }

    @Test
    public void testGetLongueur_Y(){
        assertEquals(85, route.getLongueur_Y());
    }
}
