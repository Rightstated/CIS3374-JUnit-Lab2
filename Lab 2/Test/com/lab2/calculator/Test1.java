package com.lab2.calculator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.lab2.transit.FareCalculator;
@RunWith(Parameterized.class)
public class Test1 {
private double expected;
private int age;
private String time;
private boolean isHoliday;
private static final double DELTA = 1e-15;
	@Test
	public void test(double expected,int age, String time, boolean isHoliday) {
		this.expected=expected;
		this.age=age;
		this.time=time;
		this.isHoliday=isHoliday;
		fail("Not yet implemented");
	}
	@Parameters
	public static Collection<Object[]> testParams(){
		return Arrays.asList(new Object[][]{{0.0,4,"6:00",false},{70,"6:00",true},{70,"6:00",false},{5,"6:00",true},{5,"6:00",false},{70,"8:00",true},{70,"8:00",false},{5,"8:00",true},{5,"8:00",false},{60,"6:00",true},{60,"6:00",false},{60,"8:00",true},{60,"8:00",false}});
	}
	@Test
	public void calculateFareTest() {
		assertEquals(expected,FareCalculator.calculateFare(age, time, isHoliday),DELTA);
	}
}
