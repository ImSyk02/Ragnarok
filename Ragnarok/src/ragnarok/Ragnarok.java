package ragnarok;

/**
 * @author Beau Marwaha
 * @tester Kyle Lokey
 * @collab Akash Menon, James Troup
 */

/*
 * TO DO:
 * enemy pictures change fix
 * player picture change fix
 * hit detection on top of player
 * collision detection between enemies
 * enemy track on player pos (new enemy move AI)
 * sprite movement speed
 * ????
 * profit
 */

import javax.swing.JFrame;

public class Ragnarok extends JFrame {
    
    public Ragnarok() {

        add(new window(2));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);
        setTitle("Ragnarok");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        mainMenu x = new mainMenu();
    }
}