package com.springbook.biz.common;

public class BeforeAdvice {
	public void afterReturningAdvice() {
		System.out.println("[사전처리]비지니스 로직 수행 전 동작");
	}

}
