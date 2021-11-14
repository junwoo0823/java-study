package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
JUnit 테스트 수행순서

@BeforeClass - beforeTest() : 테스트클래스 로딩후 객체생성 전에 static 멤버 준비위해 먼저 호출됨.
@Before - setUp() : 테스트클래스 객체생성후 테스트 호출에 앞서 먼저 호출됨.
@Test - testDiv()
@After - tearDown() : 테스트 호출후 정리작업 위해 호출됨. 다음 테스트를 위해 현재 객체를 폐기함.
@Before - setUp() : 테스트클래스 객체생성후 테스트 호출에 앞서 먼저 호출됨.
@Test - testMul()
@After - tearDown() : 테스트 호출후 정리작업 위해 호출됨. 다음 테스트를 위해 현재 객체를 폐기함.
@Before - setUp() : 테스트클래스 객체생성후 테스트 호출에 앞서 먼저 호출됨.
@Test - testSub()
@After - tearDown() : 테스트 호출후 정리작업 위해 호출됨. 다음 테스트를 위해 현재 객체를 폐기함.
@Before - setUp() : 테스트클래스 객체생성후 테스트 호출에 앞서 먼저 호출됨.
@Test - testSum()
@After - tearDown() : 테스트 호출후 정리작업 위해 호출됨. 다음 테스트를 위해 현재 객체를 폐기함.
@AfterClass - afterTest() : 테스트클래스가 메모리에서 해제되기 전에 static 정리작업 위해 마지막으로 호출됨.

*/

public class CalculatorTests {
	
	private Calculator calc;
	
	@BeforeClass
	public static void beforeTest() {
		System.out.println("@BeforeClass - beforeTest() : 테스트클래스 로딩후 객체생성 전에 static 멤버 준비위해 먼저 호출됨.");
	}
	
	@Before
	public void setUp() {
		System.out.println("@Before - setUp() : 테스트클래스 객체생성후 테스트 호출에 앞서 먼저 호출됨.");
		
		calc = new Calculator();
	}
	
	@Test
	public void testSum() {
		System.out.println("@Test - testSum()");
		
		assertEquals(30, calc.sum(20, 10));
	}
	
	@Test
	public void testSub() {
		System.out.println("@Test - testSub()");
		
		assertEquals(10, calc.sub(20, 10));
	}
	
	@Test
	public void testMul() {
		System.out.println("@Test - testMul()");
		
		assertEquals(200, calc.mul(20, 10));
	}
	
	@Test
	public void testDiv() {
		System.out.println("@Test - testDiv()");
		
		assertEquals(2, calc.div(20, 0));
	}
	
	@After
	public void tearDown() {
		System.out.println("@After - tearDown() : 테스트 호출후 정리작업 위해 호출됨. 다음 테스트를 위해 현재 객체를 폐기함.");
	}
	
	@AfterClass
	public static void afterTest() {
		System.out.println("@AfterClass - afterTest() : 테스트클래스가 메모리에서 해제되기 전에 static 정리작업 위해 마지막으로 호출됨.");
	}
	
}






