package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class test4 extends JPanel implements MouseMotionListener {
	private int x = 230;
	private int y = 230;

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 500);
		g.setColor(Color.RED);
		g.drawString("Hello World!", x, y);
	}

	public static void main(String[] args) {
		test4 test = new test4();
		JFrame jf = new JFrame("Hello World");
		jf.add(test);
		jf.addMouseMotionListener(test);
		jf.setSize(500, 500);
		jf.setVisible(true);

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		System.out.println(x);
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
