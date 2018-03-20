package test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import factorer.Factorer;

public class FactorsTest {
		

	@Test
	public void testFactorsOf1() {
		ArrayList<Integer> factors = new ArrayList<Integer>(); 
		ArrayList<Integer> answers;
		
		int numberToBeFactored = 1;
		
		Factorer factorer = new Factorer();
		
		answers = factorer.factor(numberToBeFactored);
		
		Assert.assertEquals(answers, factors);
	}
	
	@Test
	public void testFactorsOf2() {
		ArrayList<Integer> factors = new ArrayList<Integer>(); 
		ArrayList<Integer> expectedResult = new ArrayList<Integer>(); 
		
		expectedResult.add(2);
		
		int numberToBeFactored = 2;
		
		Factorer factorer = new Factorer();
		
		factors = factorer.factor(numberToBeFactored);
		
		Assert.assertEquals(expectedResult, factors);
	}
	
	@Test
	public void testFactorsOf3() {
		ArrayList<Integer> factors = new ArrayList<Integer>(); 
		ArrayList<Integer> expectedResult = new ArrayList<Integer>(); 
		
		expectedResult.add(3);
		
		int numberToBeFactored = 3;
		
		Factorer factorer = new Factorer();
		
		factors = factorer.factor(numberToBeFactored);
		
		Assert.assertEquals(expectedResult, factors);
	}
	
	@Test
	public void testFactorsOf4() {
		ArrayList<Integer> factors = new ArrayList<Integer>(); 
		ArrayList<Integer> expectedResult = new ArrayList<Integer>(); 
		
		expectedResult.add(2);
		expectedResult.add(2);
				
		int numberToBeFactored = 4;
		
		Factorer factorer = new Factorer();
		
		factors = factorer.factor(numberToBeFactored);
		
		Assert.assertEquals(expectedResult, factors);
	}
	
	@Test
	public void testFactorsOf5() {
		ArrayList<Integer> factors = new ArrayList<Integer>(); 
		ArrayList<Integer> expectedResult = new ArrayList<Integer>(); 
		
		expectedResult.add(5);
	
				
		int numberToBeFactored = 5;
		
		Factorer factorer = new Factorer();
		
		factors = factorer.factor(numberToBeFactored);
		
		Assert.assertEquals(expectedResult, factors);
	}
	
	@Test
	public void testFactorsOf6() {
		ArrayList<Integer> factors = new ArrayList<Integer>(); 
		ArrayList<Integer> expectedResult = new ArrayList<Integer>(); 
		
		expectedResult.add(2);
		expectedResult.add(3);
				
		int numberToBeFactored = 6;
		
		Factorer factorer = new Factorer();
		
		factors = factorer.factor(numberToBeFactored);
		
		Assert.assertEquals(expectedResult, factors);
	}
	
	@Test
	public void testFactorsOf7() {
		ArrayList<Integer> factors = new ArrayList<Integer>(); 
		ArrayList<Integer> expectedResult = new ArrayList<Integer>(); 
		
		expectedResult.add(7);
	
				
		int numberToBeFactored = 7;
		
		Factorer factorer = new Factorer();
		
		factors = factorer.factor(numberToBeFactored);
		
		Assert.assertEquals(expectedResult, factors);
	}
	
	@Test
	public void testFactorsOf8() {
		ArrayList<Integer> factors = new ArrayList<Integer>(); 
		ArrayList<Integer> expectedResult = new ArrayList<Integer>(); 
		
		expectedResult.add(2);
		expectedResult.add(2);
		expectedResult.add(2);
				
		int numberToBeFactored = 8;
		
		Factorer factorer = new Factorer();
		
		factors = factorer.factor(numberToBeFactored);
		
		Assert.assertEquals(expectedResult, factors);
	}

	@Test
	public void testFactorsOf9() {
		ArrayList<Integer> factors = new ArrayList<Integer>(); 
		ArrayList<Integer> expectedResult = new ArrayList<Integer>(); 
		
		expectedResult.add(3);
		expectedResult.add(3);
				
		int numberToBeFactored = 9;
		
		Factorer factorer = new Factorer();
		
		factors = factorer.factor(numberToBeFactored);
		
		Assert.assertEquals(expectedResult, factors);
	}
	
	@Test
	public void testFactorsOfBigNumber() {
		ArrayList<Integer> factors = new ArrayList<Integer>(); 
		ArrayList<Integer> expectedResult = new ArrayList<Integer>(); 
		
		expectedResult.add(3);
		expectedResult.add(5);
		expectedResult.add(11);
		expectedResult.add(17);
		expectedResult.add(23);
				
		int numberToBeFactored = 3*5*11*17*23;
		
		Factorer factorer = new Factorer();
		
		factors = factorer.factor(numberToBeFactored);
		
		Assert.assertEquals(expectedResult, factors);
	}

}
