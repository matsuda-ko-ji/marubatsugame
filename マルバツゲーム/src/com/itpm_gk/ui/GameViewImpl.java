package com.itpm_gk.ui;

import java.util.Scanner;

public class GameViewImpl implements GameView{

	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public void displayTitle(OnUserInputCallback callback) {
		System.out.println("マルバツゲーム");
		System.out.println("1:スタート");
		System.out.println("2:終了");
		
		String userInput = scanner.nextLine();
		
		switch (userInput) {
			case"1"://START
				System.out.println("ゲームを開始します");
				callback.selectTitleScreenItem(TitleScreenItem.GAME_START);
				break;
			case"2"://終了
				System.out.println("ゲームを終了します");
				callback.selectTitleScreenItem(TitleScreenItem.GAME_FINISH);
				break;		
		}
	
	}
}
