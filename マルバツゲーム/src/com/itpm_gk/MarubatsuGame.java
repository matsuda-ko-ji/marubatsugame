package com.itpm_gk;

public interface MarubatsuGame {
	/**
	 * 実行用メソッド
	 */
	void exec();
	/**
	 * 終了用メソッド
	 */
	void finish(Reason reason);
	enum Reason{
		
		USER_CHOOSES, //ユーザが選択
		
		RUNTIME_ERROR //実行時エラー
	}
}
