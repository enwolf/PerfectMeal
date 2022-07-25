package com.algonquin.PerfectMeal.beans;

import java.util.ArrayList;

public class Button {

	private String id;
	private String name;
	private ArrayList<String> cssClasses;
	private String displayValue = "";
	private String formAction = "";

	public Button() {

	}

	public Button(ButtonBuilder buttonBuilder) {
		this.id = buttonBuilder.getID();
		this.name = buttonBuilder.getName();
		this.displayValue = buttonBuilder.getDisplayValue();
		this.formAction = buttonBuilder.getFormAction();

	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDisplayValue() {
		return displayValue;
	}

	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}

	public void setFormAction(String formAction) {
		this.formAction = formAction;
	}

	public String getFormAction() {
		return this.formAction;
	}

}
