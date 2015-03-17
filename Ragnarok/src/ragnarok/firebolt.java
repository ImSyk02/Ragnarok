
package ragnarok;

/**
 *
 * @author Beau Marwaha
 */
import java.awt.Image;

import javax.swing.ImageIcon;

public class firebolt{

    private int x, y;
    private Image image;
    boolean visible;

    private final int BOARD_WIDTH = 950;
    private final int BOARD_HEIGHT = 950;
    private final int MISSILE_SPEED = 2;

    public firebolt(int x, int y) {
        ImageIcon ii = new ImageIcon(this.getClass().getResource("flame.gif"));
        image = ii.getImage();
        visible = true;
        this.x = x;
        this.y = y;
    }


    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int getImgW() {
        return image.getWidth(null);
    }

    public int getImgH() {
        return image.getHeight(null);
    }

    public boolean isVisible() {
        return visible;
    }
    
    public void moveLeft() {
        x -= MISSILE_SPEED;
        if (x < 0)
            visible = false;
    }
}