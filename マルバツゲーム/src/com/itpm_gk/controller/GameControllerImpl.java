package com.itpm_gk.controller;

import com.itpm_gk.data.model.GameModel;
import com.itpm_gk.ui.GameView;

public class GameControllerImpl implements GameController{

	private GameView gameView;
	
	private GameModel gameModel;
	
	public GameControllerImpl(GameView gameView,GameModel gameModel) {
		this.gameView = gameView;
		this.gameModel = gameModel;
	}
	
	@Override
	public void startUp() {
		
		gameView.displayTitle();
		
	}

	@Override
	public void setOnFinishListener(OnFinishListener listener) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	

}
