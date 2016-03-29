package DomaineVoiture;

/**
 * Created by clement on 29/03/2016.
 */
public class Route {
    private final int x;
    private final int y;
    private final int longueur_x;
    private final int longueur_y;

    public Route(int x, int y, int longueur_x, int longueur_y) {
        this.x = x;
        this.y = y;
        this.longueur_x = longueur_x;
        this.longueur_y = longueur_y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLongueur_X() {
        return longueur_x;
    }

    public int getLongueur_Y() {
        return longueur_y;
    }
}
