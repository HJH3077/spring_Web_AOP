package com.ict.ex03;

public class Girl implements Person{
	// 소녀
	// 컴퓨터를 부팅한다. 		   (공통 관심)
	// 컴퓨터로 쇼핑을 한다. 		 (핵심 관심)
	// 컴퓨터로 드라마보기를 한다. 	 (핵심 관심)
	// 컴퓨터를 종료한다. 		   (공통 관심)
	
	@Override
	public void doSomething() {
		System.out.println("컴퓨터로 쇼핑을 한다."); 	
		System.out.println("=============================");
		System.out.println("컴퓨터로 드라마보기를 한다.");
	}
	
	@Override
	public void play() {
		System.err.println("도서관으로 나갑니다.");
	}
}
