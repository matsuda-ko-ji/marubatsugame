package com.itpm_gk;

import com.itpm_gk.controller.GameController;
import com.itpm_gk.controller.GameControllerImpl;
import com.itpm_gk.data.model.GameModel;
import com.itpm_gk.data.model.GameModelImpl;
import com.itpm_gk.ui.GameView;
import com.itpm_gk.ui.GameViewImpl;

public class MarubatsuGameImpl implements MarubatsuGame{
	
	private GameController gameController;
	
	public MarubatsuGameImpl() {
		
		GameView gameView = new GameViewImpl();
		
		GameModel gameModel = new GameModelImpl();
		
		gameController = new GameControllerImpl(gameView,gameModel);
		
	}
	@Override
	public void exec() {
		//ゲーム開始
		gameController.startUp();
		
	}

	@Override
	public void finish(Reason reason) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	

}
