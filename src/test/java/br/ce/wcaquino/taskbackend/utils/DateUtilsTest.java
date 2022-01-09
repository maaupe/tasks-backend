package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Test;

import org.junit.Assert;

public class DateUtilsTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		
		LocalDate date = LocalDate.of(2019, 01, 01);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));

		
	}
	
	@Test
	public void deveRetornarFalseParaDatasPassadas() {
		
		LocalDate date = LocalDate.of(2019, 01, 01);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));

		
	}
	
	
	@Test
	public void deveRetornarTrueParaDatasAtual() {
		
		LocalDate date = LocalDate.now();
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));

		
	}
	

}
