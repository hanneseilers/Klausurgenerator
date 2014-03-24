package de.hanneseilers.klausurgenerator.core.sections.start;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.hanneseilers.klausurgenerator.core.Section;
import de.hanneseilers.klausurgenerator.interfaces.GeneratorInterface;

public class SectionStart extends Section {

	private PanelSectionStart gui;
	
	/**
	 * Consctrutor
	 * @param generator {@link GeneratorInterface}
	 */
	public SectionStart(GeneratorInterface generator) {
		super(generator);
		setTitle("Start");
	}
	
	@Override
	public Component getComponent() {
		gui = new PanelSectionStart();
		
		gui.btnLoadExam.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Loading exam
			}
		});
		
		gui.btnExit.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				getGenerator().getGui().dispose();
			}
		});
		
		return gui;
	}

}
