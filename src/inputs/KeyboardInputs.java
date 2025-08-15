package inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> gamePanel.changeYDelta(-5); // Up
            case KeyEvent.VK_S -> gamePanel.changeYDelta(5);  // Down
            case KeyEvent.VK_A -> gamePanel.changeXDelta(-5); // Left
            case KeyEvent.VK_D -> gamePanel.changeXDelta(5);  // Right
        }
    }
}