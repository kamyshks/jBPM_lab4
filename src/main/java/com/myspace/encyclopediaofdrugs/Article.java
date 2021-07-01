package com.myspace.encyclopediaofdrugs;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Article implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private com.myspace.encyclopediaofdrugs.Medicament medicament;
	private com.myspace.encyclopediaofdrugs.MedicamentFormula formula;
	private com.myspace.encyclopediaofdrugs.MedicamentGroup group;
	private com.myspace.encyclopediaofdrugs.MedicamentInterract interract;
	private com.myspace.encyclopediaofdrugs.MedicamentType type;
	private java.time.OffsetDateTime dateChange;

	private java.lang.String price;

	public Article() {
	}

	public com.myspace.encyclopediaofdrugs.Medicament getMedicament() {
		return this.medicament;
	}

	public void setMedicament(
			com.myspace.encyclopediaofdrugs.Medicament medicament) {
		this.medicament = medicament;
	}

	public com.myspace.encyclopediaofdrugs.MedicamentFormula getFormula() {
		return this.formula;
	}

	public void setFormula(
			com.myspace.encyclopediaofdrugs.MedicamentFormula formula) {
		this.formula = formula;
	}

	public com.myspace.encyclopediaofdrugs.MedicamentGroup getGroup() {
		return this.group;
	}

	public void setGroup(com.myspace.encyclopediaofdrugs.MedicamentGroup group) {
		this.group = group;
	}

	public com.myspace.encyclopediaofdrugs.MedicamentInterract getInterract() {
		return this.interract;
	}

	public void setInterract(
			com.myspace.encyclopediaofdrugs.MedicamentInterract interract) {
		this.interract = interract;
	}

	public com.myspace.encyclopediaofdrugs.MedicamentType getType() {
		return this.type;
	}

	public void setType(com.myspace.encyclopediaofdrugs.MedicamentType type) {
		this.type = type;
	}

	public java.time.OffsetDateTime getDateChange() {
		return this.dateChange;
	}

	public void setDateChange(java.time.OffsetDateTime dateChange) {
		this.dateChange = dateChange;
	}

	public java.lang.String getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.String price) {
		this.price = price;
	}

	public Article(com.myspace.encyclopediaofdrugs.Medicament medicament,
			com.myspace.encyclopediaofdrugs.MedicamentFormula formula,
			com.myspace.encyclopediaofdrugs.MedicamentGroup group,
			com.myspace.encyclopediaofdrugs.MedicamentInterract interract,
			com.myspace.encyclopediaofdrugs.MedicamentType type,
			java.time.OffsetDateTime dateChange, java.lang.String price) {
		this.medicament = medicament;
		this.formula = formula;
		this.group = group;
		this.interract = interract;
		this.type = type;
		this.dateChange = dateChange;
		this.price = price;
	}

}