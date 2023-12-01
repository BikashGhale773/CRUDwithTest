package com.example.RestAPI;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class RestApiApplicationTests {

	//Creating instance variable as an object of Calculator
	private Calculator c = new Calculator();

    @Test
    @Disabled
	void contextLoads() {
	}
    @Test
    public void sumTest(){
        int expectedResult = 10;
        int actualResult = c.sum(3,5,2);
        System.out.println("result====" + actualResult);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void productTest(){
        assertEquals(10,c.product(2,5));
    }




	//@Test
	//void testSum(){
		//expected
	//	int expectedResult = 10;

		//actual
		//int actualResult = c.sum(2,3,4);

		//assertThat(actualResult).isEqualTo(expectedResult);


//	@Test
//	//not to run this test
//	@Disabled
//	void testProduct(){
//		//expected
//		int expected = 10;
//
//		//actual
//		int actualResult = c.product(5,2);
//		assertThat(actualResult).isEqualTo(expected);
//	}
}
