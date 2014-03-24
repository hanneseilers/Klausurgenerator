package de.hanneseilers.klausurgenerator.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import de.hanneseilers.klausurgenerator.interfaces.JFrameListener;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ExamGeneratorGui extends JFrame implements WindowListener {

	private JFrameListener listener;

	/**
	 * Launch the application.
	 */
	public static void showGui(final JFrameListener listener) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamGeneratorGui frame = new ExamGeneratorGui(listener);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExamGeneratorGui(JFrameListener listener) {
		setTitle("Klausurengenerator");
		this.listener = listener;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Datei");
		mnFile.setMnemonic('D');
		menuBar.add(mnFile);
		
		JMenuItem mntmClose = new JMenuItem("Beenden");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mntmClose.setName("mntmClose");
		mntmClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mnFile.add(mntmClose);
		
		JMenu mnHelp = new JMenu("Hilfe");
		mnHelp.setMnemonic('H');
		menuBar.add(mnHelp);
		
		JMenuItem mntmUserguide = new JMenuItem("Handbuch");
		mntmUserguide.setName("mntmUserguide");
		mntmUserguide.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mnHelp.add(mntmUserguide);
		
		JMenuItem mntmAbout = new JMenuItem("Über");
		mntmAbout.setName("mntmAbout\r\n");
		mnHelp.add(mntmAbout);
		JPanel contentPane = new JPanel();
		contentPane.setName("contentPane");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setName("tabbedPane");
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		// Add window listener
		this.addWindowListener(this);		
		
		// Call listener
		if( this.listener != null ){
			this.listener.frameLoaded(this);
		}
	}
	
	
	/**
	 * Gets a component by name.
	 * @param name {@link String} name of the component.
	 * @return {@link Component} if found, {@code null} otherwise.
	 */
	public Component getComponentByName(String name){
		return findChildByName(this, name);
	}
	
	/**
	 * Function to get component by name from parent component.
	 * Cecks if parent has searched name, if not it searches in children. 
	 * @param parent 	Parent {@link Component}
	 * @param name		{@link String} name of the component
	 * @return			{@link Component} if component found, {@code null} otherwise.
	 */
	private Component findChildByName(Container parent, String name){
		if( parent.getName() != null && parent.getName().equals(name) ){
			return parent;
		}
		else{
			for( Component c : parent.getComponents() ){
				Component ret;
				if( (ret=findChildByName((Container) c, name)) != null ){
					return ret;
				}
			}
		}
		
		return null;
	}

	
	
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		if( listener != null ){
			listener.frameDisposed();
		}
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
}
