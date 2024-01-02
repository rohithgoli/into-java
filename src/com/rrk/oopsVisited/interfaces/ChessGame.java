package com.rrk.oopsVisited.interfaces;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Move piece front");
	}

	@Override
	public void down() {
		System.out.println("Move piece back");
	}

	@Override
	public void left() {
		System.out.println("Move piece left");
	}

	@Override
	public void right() {
		System.out.println("Move piece right");
	}
	
}
