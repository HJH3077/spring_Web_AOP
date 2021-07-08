package com.ict.ex03;

public class Boy implements Person {
	// 소년
	// 컴퓨터를 부팅한다. (공통 관심)
	// 컴퓨터로 게임을 한다. (핵심 관심)
	// 컴퓨터로 영화보기를 한다. (핵심 관심)
	// 컴퓨터를 종료한다. (공통 관심)

	@Override
	public void doSomething() {
		try {
			System.out.println("컴퓨터로 게임을 한다.");
			int result = 15/0; // throw처리 시
			System.out.println("=============================");
			System.out.println("컴퓨터로 영화보기를 한다.");
		} catch (Exception e) {
			// return ; 안해도 되긴함
		}
	}

	@Override
	public void play() {
		System.out.println("운동하러 나갑니다.");
	}
}
