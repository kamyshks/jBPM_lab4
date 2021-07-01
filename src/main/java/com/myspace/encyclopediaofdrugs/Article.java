package com.myspace.encyclopediaofdrugs;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Article implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.time.OffsetDateTime dateChange;

	private java.lang.String price;

	private java.util.List<java.lang.String> links;

	private java.lang.Boolean isPublished;

	private java.lang.String title;

	private com.myspace.encyclopediaofdrugs.Medicament medicament;

	public Article() {
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

	public java.util.List<java.lang.String> getLinks() {
		return this.links;
	}

	public void setLinks(java.util.List<java.lang.String> links) {
		this.links = links;
	}

	public java.lang.Boolean getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(java.lang.Boolean isPublished) {
		this.isPublished = isPublished;
	}

	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public com.myspace.encyclopediaofdrugs.Medicament getMedicament() {
		return this.medicament;
	}

	public void setMedicament(
			com.myspace.encyclopediaofdrugs.Medicament medicament) {
		this.medicament = medicament;
	}

	public Article(java.time.OffsetDateTime dateChange, java.lang.String price,
			java.util.List<java.lang.String> links,
			java.lang.Boolean isPublished, java.lang.String title,
			com.myspace.encyclopediaofdrugs.Medicament medicament) {
		this.dateChange = dateChange;
		this.price = price;
		this.links = links;
		this.isPublished = isPublished;
		this.title = title;
		this.medicament = medicament;
	}

}