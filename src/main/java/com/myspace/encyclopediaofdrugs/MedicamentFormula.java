package com.myspace.encyclopediaofdrugs;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MedicamentFormula implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String title;
	private java.lang.String text;
	private java.lang.String description;

	public MedicamentFormula() {
	}

	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.String getText() {
		return this.text;
	}

	public void setText(java.lang.String text) {
		this.text = text;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public MedicamentFormula(java.lang.String title, java.lang.String text,
			java.lang.String description) {
		this.title = title;
		this.text = text;
		this.description = description;
	}

}