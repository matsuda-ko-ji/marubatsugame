package com.itpm_gk.controller;

import com.itpm_gk.MarubatsuGame.Reason;
import com.itpm_gk.data.model.GameModel;
import com.itpm_gk.ui.GameView;
import com.itpm_gk.ui.GameView.TitleScreenItem;

public class GameControllerImpl implements GameController, GameView.OnUserInputCallback{

	private GameView gameView;
	
	private GameModel gameModel;
	
	private OnFinishListener listener;
	
	public GameControllerImpl(GameView gameView,GameModel gameModel) {
		this.gameView = gameView;
		this.gameModel = gameModel;
	}
	
	@Override
	public void startUp() {
		
		gameView.displayTitle(this);
		
	}

	@Override
	public void setOnFinishListener(OnFinishListener listener) {
		this.listener = listener;
		
	}

	@Override
	public void selectTitleScreenItem(TitleScreenItem item) {
		switch(item) {
			case GAME_START:
				gameView.gameDisplay();
				break;
			case GAME_FINISH:
				listener.onFinish(Reason.USER_CHOOSES);
				break;
				
		}
		
	}
	
	
	
	

}
