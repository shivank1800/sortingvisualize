package sorting_visualizer;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener{

	public boolean[] keys = new boolean[120];
	public boolean s, b, m, i;
	
	public void update() {
		s = keys[KeyEvent.VK_S];
		b = keys[KeyEvent.VK_B];
		m = keys[KeyEvent.VK_M];
		i = keys[KeyEvent.VK_I];
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}
	
	
}
