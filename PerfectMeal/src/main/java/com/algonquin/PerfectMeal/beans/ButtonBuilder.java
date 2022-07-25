package com.algonquin.PerfectMeal.beans;

import java.util.ArrayList;
import java.util.UUID;

public class ButtonBuilder {

	private final String id;
	private final String name;
	private String displayValue = "";
	private String formAction = "";
	private ArrayList<String> cssClasses;

	public ButtonBuilder(String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;

	}

	public String getID() {
		return this.id;
	}

	public String getDisplayValue() {
		return this.displayValue;
	}

	public String getName() {
		return this.name;
	}

	public String getFormAction() {
		return this.formAction;
	}

	public ButtonBuilder setFormAction(String formAction) {
		this.formAction = formAction;
		return this;
	}

	public ButtonBuilder setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
		return this;
	}

	public Button build() {
		return new Button(this);
	}

}
