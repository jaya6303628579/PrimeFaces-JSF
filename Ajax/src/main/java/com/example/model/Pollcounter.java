package com.example.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="pc", eager = true)
@ViewScoped
public class Pollcounter {
	private int increment;

	public Pollcounter(int increment) {
		super();
		this.increment = increment;
	}

	public Pollcounter() {
		super();
	}

	public int getIncrement() {
		return increment;
	}

	public void setIncrement(int increment) {
		this.increment = increment;
	}
	public void increse() {
		increment++;
	}
}
