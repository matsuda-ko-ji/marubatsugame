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

	@Override
	public void gameDisplay() {
		
		String str1 = "１|２|３";
		String str2 = "４|５|６";
		String str3 = "７|８|９";
		String str4 = "━ ━ ━";
			
		System.out.println(str1);
		System.out.println(str4);
		System.out.println(str2);
		System.out.println(str4);
		System.out.println(str3);
		System.out.println("〇のターンです");
		System.out.println("入力する番号を選んでください");
		
		String userInput = scanner.nextLine();
		
		switch(userInput) {
			case"1":
				callback.displayBordItem(BordItem.CHANGE_NUMBER);
				String str5 = str1.replace("１","〇");
				System.out.println(str5);
				System.out.println(str4);
				System.out.println(str2);
				System.out.println(str4);
				System.out.println(str3);
				System.out.println("×のターンです");
				System.out.println("入力する番号を選んでください");
			case"2":
				System.out.println();
			case"3":
				System.out.println();
			case"4":
				System.out.println();
			case"5":
				System.out.println();
			case"6":
				System.out.println();
			case"7":
				System.out.println();
			case"8":
				System.out.println();
			case"9":
				System.out.println();
				
		}
	}
}
