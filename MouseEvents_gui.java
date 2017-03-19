package practise;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;


public class MouseEvents_gui extends JFrame {
	
	private JPanel mousePanel;
	private JLabel statusBar;
	
	public MouseEvents_gui()
	{
		super("title");
		setLayout(new FlowLayout());
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		Dimension d = new Dimension(500,500);
		mousePanel.setPreferredSize(d);
		add(mousePanel,BorderLayout.CENTER);
		
		statusBar = new JLabel("default");
		add(statusBar,BorderLayout.SOUTH);
		
		eventHandler handler = new eventHandler();
// there are 2 types of events that occurs when we use mouse. while moving mouse we have 
// moving or scrolling down event. While mouse stays we have events like (press, release, click, enter
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
		
	}
	private class eventHandler implements MouseListener, MouseMotionListener
	{
// mouseClick is different from mouse press and release. MouseClick means when you press and release the mouse button
		public void mouseClicked(MouseEvent event)
		{
			statusBar.setText(String.format("you clicked at %d, %d",event.getX(),event.getY()));
		}
		public void mouseMoved(MouseEvent event)
		{
			statusBar.setText("you moved mouse");
		}
		public void mousePressed(MouseEvent event)
		{
			statusBar.setText("you pressed mouse");
		}
		public void mouseReleased(MouseEvent event)
		{
			statusBar.setText("you released mouse");
		}
		public void mouseEntered(MouseEvent event)
		{
			statusBar.setText("you moved mouse");
			mousePanel.setBackground(Color.BLUE);
		}
		public void mouseExited(MouseEvent event)
		{
			statusBar.setText("you moved mouse");
			mousePanel.setBackground(Color.WHITE);
		}
		public void mouseDragged(MouseEvent event)
		{
			statusBar.setText("you dragged the mouse");
		}
	}
	

}
