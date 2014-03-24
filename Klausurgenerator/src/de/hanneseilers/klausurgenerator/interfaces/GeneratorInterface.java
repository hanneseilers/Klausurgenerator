package de.hanneseilers.klausurgenerator.interfaces;

import java.util.List;

import javax.swing.JFrame;

import de.hanneseilers.klausurgenerator.core.Section;

public interface GeneratorInterface {

	/**
	 * @return {@link List} of available {@link Section} objects.
	 */
	public List<Section> getSections();
	
	/**
	 * @return {@link JFrame} main gui
	 */
	public JFrame getGui();
	
	/**
	 * Loads exam for editing
	 */
	public void loadExam();
	
}
