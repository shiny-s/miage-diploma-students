package fr.pantheonsorbonne.miage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import fr.pantheonsorbonne.miage.diploma.DateSnippet;
import fr.pantheonsorbonne.miage.diploma.DiplomaSnippet;
import fr.pantheonsorbonne.miage.diploma.NameSnippet;

public class MiageDiplomaGenerator extends AbstractDiplomaGenerator {

	private Student student;
	private Date date = null;

	/**
	 * Create the generator using a student name
	 * 
	 * @param name
	 */
	public MiageDiplomaGenerator(Student student) {
		this(student, new Date());
	}

	public MiageDiplomaGenerator(Student student, Date date) {
		this.student = student;
		this.date = date;
	}

	@Override
	protected Collection<DiplomaSnippet> getDiplomaSnippets() {
		String studentName = this.student.getName() + " " + this.student.getTitle();
		return Arrays.asList(new DateSnippet(this.date), new NameSnippet(studentName));
	}

}
