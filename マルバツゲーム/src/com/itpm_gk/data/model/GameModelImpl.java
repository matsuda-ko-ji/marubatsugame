package com.itpm_gk.data.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameModelImpl implements GameModel{
	
	/**
	 * 〇の番かどうかの値
	 * 〇の番の場合はtrueが返る。
	 */
	
	//どっちのターンか：0:〇,1:×
	private boolean circleTurn = true;
	
	/**
	 * マス目の状態
	 * None：なし、Circle：〇、Closs：×
	 */
	private List<CellState> cellStateList = new ArrayList<>(Arrays.asList(
			CellState.None, CellState.None, CellState.None,
			CellState.None, CellState.None, CellState.None,
			CellState.None, CellState.None, CellState.None		
	));
	
	public boolean isCircleTurn() {
		return circleTurn;
	}
	
	public void setCircleTurn(boolean isCircleTurn) {
		circleTurn = isCircleTurn;
	}
	
	public List<CellState> getCellStateList(){
		return cellStateList;
	}
	
	/**
	 * セルの状態更新メソッド
	 * @param num 1番～9番の値
	 * @param state　セルの状態
	 */
	
	public void setCellState(int num, CellState state) {
		cellStateList.set(num - 1, state);
		
	}
}
