package de.hanneseilers.klausurgenerator.core;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JPanel;

import de.hanneseilers.klausurgenerator.interfaces.GeneratorInterface;

/**
 * Abstract class for construction new sections. 
 * @author Hannes Eilers
 *
 */
public abstract class Section {

	private GeneratorInterface generator;
	
	private SectionType sectionType = SectionType.DEFAULT;
	private String title = "SectionTitle";
	private String tip = null;
	private Icon icon = null;
	
	/**
	 * Constructor
	 * @param generator {@link GeneratorInterface} instance storing section
	 */
	public Section(GeneratorInterface generator){
		this.generator = generator;
	}
	
	/**
	 * Gets another {@link Section} with specific type.
	 * @param type	{@link SectionType} of other {@link Section}
	 * @return 		{@link Section} if found, {@code null} otherwise
	 */
	protected Section getOtherSection(SectionType type){
		if( getGenerator() != null ){
			for( Section s : getGenerator().getSections() ){
				if( s.getSectionType() == type ){
					return s;
				}
			}
		}
		
		return null;
	}
	
	/**
	 * @return {@link Component} with gui elements for this section
	 */
	public Component getComponent(){
		return new JPanel();
	}

	/**
	 * @return the generator
	 */
	protected GeneratorInterface getGenerator() {
		return generator;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the tip
	 */
	public String getTip() {
		return tip;
	}

	/**
	 * @return the icon
	 */
	public Icon getIcon() {
		return icon;
	}

	/**
	 * @param title the title to set
	 */
	protected void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param tip the tip to set
	 */
	protected void setTip(String tip) {
		this.tip = tip;
	}

	/**
	 * @param icon the icon to set
	 */
	protected void setIcon(Icon icon) {
		this.icon = icon;
	}

	/**
	 * @param sectionType the sectionType to set
	 */
	protected void setSectionType(SectionType sectionType) {
		this.sectionType = sectionType;
	}

	/**
	 * @return the sectionType
	 */
	public SectionType getSectionType() {
		return sectionType;
	}
	
}
