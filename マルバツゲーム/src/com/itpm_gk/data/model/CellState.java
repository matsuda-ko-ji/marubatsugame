package com.itpm_gk.data.model;

public enum CellState {
	
	None(0),
	
	Circle(1),
	
	Closs(2);
	
	private int id;
	
	private CellState(int id) {
		this.id = id;
	}

}
