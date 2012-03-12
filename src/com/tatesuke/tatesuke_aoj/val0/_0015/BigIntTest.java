package com.tatesuke.tatesuke_aoj.val0._0015;

import org.junit.Test;

import com.tatesuke.tatesuke_aoj.val0._0015.Main.BigInt;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class BigIntTest {

	@Test
	public void toStringのテスト() {
		BigInt bigInt = new BigInt("123456789012345678901234567890");
		assertThat(bigInt.toString(), is("123456789012345678901234567890"));
	}

	@Test
	public void toStringのテスト_ゼロ() {
		BigInt bigInt = new BigInt("0");
		assertThat(bigInt.toString(), is("0"));
	}

	@Test
	public void addのテスト() {
		BigInt bigInt1 = new BigInt("1");
		BigInt bigInt2 = new BigInt("1");
		BigInt result = bigInt1.add(bigInt2);

		assertThat(result.toString(), is("2"));
	}

	@Test
	public void addのテスト_繰り上がり() {
		BigInt bigInt1 = new BigInt("1");
		BigInt bigInt2 = new BigInt("9");
		BigInt result = bigInt1.add(bigInt2);

		assertThat(result.toString(), is("10"));
	}

	@Test
	public void addのテスト_オーバーフロー() {
		try {
			BigInt bigInt1 = new BigInt("99999999999999999999999999999999999999999999999999999999999999999999999999999999"); //80桁
			BigInt bigInt2 = new BigInt("1");
			bigInt1.add(bigInt2);
			fail();
		} catch (ArithmeticException e) {
			assertThat(e.getMessage(), is("overflow"));
		}
	}

	@Test
	public void 最初からオーバーフロー() {
		try {
			new BigInt("100000000000000000000000000000000000000000000000000000000000000000000000000000000"); //81桁
			fail();
		} catch (ArithmeticException e) {
			assertThat(e.getMessage(), is("overflow"));
		}
	}

	@Test
	public void addのテスト_サンプルの問題() {
		BigInt bigInt1 = new BigInt("1000");
		BigInt bigInt2 = new BigInt("800");
		BigInt result = bigInt1.add(bigInt2);
		assertThat(result.toString(), is("1800"));

		bigInt1 = new BigInt("9999999999999999999999999999999999999999");
		bigInt2 = new BigInt("1");
		result = bigInt1.add(bigInt2);
		assertThat(result.toString(), is("10000000000000000000000000000000000000000"));
	}

}
