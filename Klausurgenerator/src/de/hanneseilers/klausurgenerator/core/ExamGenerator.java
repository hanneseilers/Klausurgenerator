package de.hanneseilers.klausurgenerator.core;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import de.hanneseilers.klausurgenerator.core.sections.start.SectionStart;
import de.hanneseilers.klausurgenerator.gui.ExamGeneratorGui;
import de.hanneseilers.klausurgenerator.interfaces.GeneratorInterface;
import de.hanneseilers.klausurgenerator.interfaces.JFrameListener;

/**
 * Main class
 * @author Hannes Eilers
 *
 */
public class ExamGenerator implements JFrameListener, GeneratorInterface {

	private ExamGeneratorGui gui = null;
	private List<Section> sections;
	
	/**
	 * Constructor
	 */
	public ExamGenerator() {}	
	
	/**
	 * Initializes sections
	 */
	private void initializeSections(){
		sections.add( new SectionStart(this) );
	}

	@Override
	public JFrame getGui() {
		return gui;
	}

	@Override
	public void frameLoaded(JFrame frame) {
		gui = (ExamGeneratorGui) frame;
		sections = new ArrayList<Section>();
		initializeSections();
		
		// show sections
		JTabbedPane tabbedPane = (JTabbedPane) gui.getComponentByName("tabbedPane");
		for( Section s : sections ){
			tabbedPane.addTab( s.getTitle(), s.getIcon(), s.getComponent(), s.getTip() );
		}
	}

	@Override
	public void frameDisposed() {
		gui = null;
		sections = null;
	}
	
	/**
	 * MAIN FUNCTION
	 * @param args
	 */
	public static void main(String[] args) {
		ExamGeneratorGui.showGui( new ExamGenerator() );
	}

	@Override
	public List<Section> getSections() {
		return sections;
	}

	@Override
	public void loadExam() {
		// TODO Loading exam
	}

}
