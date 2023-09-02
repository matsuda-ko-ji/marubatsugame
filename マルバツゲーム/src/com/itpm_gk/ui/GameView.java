package com.itpm_gk.ui;

public interface GameView {

	void displayTitle(OnUserInputCallback callback);
	
	void gameDisplay();
	/**
	 * ユーザ－入力用コールバック
	 */
	interface OnUserInputCallback{
		// タイトル画面の選択表示
		void selectTitleScreenItem(TitleScreenItem item);
		
		void displayBoadItem(BoadItem bord);
	
	}
	
	
	/**
	 * タイトル画面選択項目
	 */
	enum TitleScreenItem{
		GAME_START,//ゲーム開始
		GAME_FINISH//ゲーム終了
	}
	
	enum BordItem{
		
	}
}
