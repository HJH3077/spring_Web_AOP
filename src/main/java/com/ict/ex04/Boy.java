package com.ict.ex04;

import org.springframework.stereotype.Component;

@Component("boy")
public class Boy implements Person{
	// 소년
	// 컴퓨터를 부팅한다.         (공통관심)
	// 컴퓨터로 게임을 한다.      (핵심관심)
	// 컴퓨터로 영화보기를 한다.  (핵심관심)
	// 컴퓨터를 종료한다.         (공통관심)
	
	@Override
	public void doSomething() {
		try {
			System.out.println("=====================");
			System.out.println("컴퓨터로 게임을 한다.");
			// int result = 15/0;
			System.out.println("컴퓨터로 영화보기를 한다.");
			System.out.println("=====================");
		} catch (Exception e) {
			//return ;	
		}
	}
	@Override
	public void play() {
		System.out.println("운동하러 나갑니다.");
	}
}
