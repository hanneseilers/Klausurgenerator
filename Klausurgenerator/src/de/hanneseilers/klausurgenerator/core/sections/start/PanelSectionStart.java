package de.hanneseilers.klausurgenerator.core.sections.start;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import de.hanneseilers.klausurgenerator.core.Exam;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Font;

@SuppressWarnings("serial")
public class PanelSectionStart extends JPanel {
	public JLabel lblNewLabel;
	public JButton btnNewExam;
	public JButton btnEditQuestions;
	public JButton btnLoadExam;
	public JButton btnExit;
	public JButton btnSettings;
	public JList<Exam> lstLastExams;
	public JLabel lblNewLabel_1;
	public JLabel lblNewLabel_2;

	/**
	 * Create the panel.
	 */
	public PanelSectionStart() {
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,}));
		
		lblNewLabel = new JLabel("Willkommen beim Klausurgenerator.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblNewLabel, "2, 2, 5, 1");
		
		lblNewLabel_1 = new JLabel("<html><body>Um Klausuren und Aufgaben zu verwalten, wählen Sie einen der folgenden Buttons, das Datei-Menü oder die angezeigten Registerkarten.</body></html>");
		add(lblNewLabel_1, "2, 4, 5, 1");
		
		btnNewExam = new JButton("Neue Klausur");
		btnNewExam.setMnemonic('n');
		add(btnNewExam, "4, 8");
		
		btnLoadExam = new JButton("Klausur laden");
		btnLoadExam.setMnemonic('l');
		add(btnLoadExam, "4, 10");
		
		btnEditQuestions = new JButton("Aufgaben bearbeiten");
		btnEditQuestions.setMnemonic('b');
		add(btnEditQuestions, "4, 12");
		
		btnSettings = new JButton("Einstellungen");
		add(btnSettings, "4, 14");
		
		btnExit = new JButton("Programm beenden");
		btnExit.setMnemonic('e');
		add(btnExit, "4, 16");
		
		lblNewLabel_2 = new JLabel("Zuletzt verwendete Klausuren:");
		add(lblNewLabel_2, "2, 20, 5, 1");
		
		lstLastExams = new JList<Exam>();
		add(lstLastExams, "2, 22, 5, 1, fill, fill");

	}

}
