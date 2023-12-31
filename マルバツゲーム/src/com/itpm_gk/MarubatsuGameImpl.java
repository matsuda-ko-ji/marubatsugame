package com.itpm_gk;

import com.itpm_gk.controller.GameController;
import com.itpm_gk.controller.GameController.OnFinishListener;
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
		
		gameController.setOnFinishListener(new OnFinishListener() {

			@Override
			public void onFinish(Reason reason) {
				finish(reason);
			}	
		});
	}
	@Override
	public void exec() {
		//ゲーム開始
		gameController.startUp();
		
	}

	@Override
	public void finish(Reason reason) {
		//ゲーム終了
		switch(reason) {
			case USER_CHOOSES:
				System.exit(0);
				break;
			default:
				break;
		}
		
	}
	

}
