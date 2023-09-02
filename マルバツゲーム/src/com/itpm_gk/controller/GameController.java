package com.itpm_gk.controller;

import com.itpm_gk.MarubatsuGame;

public interface GameController {

	/**
	 * ゲーム起動用メソッド 
	 */
	void startUp();
	
	void setOnFinishListener(OnFinishListener listener);
	
	interface OnFinishListener{
		
		void onFinish(MarubatsuGame.Reason reason);
	}

}
