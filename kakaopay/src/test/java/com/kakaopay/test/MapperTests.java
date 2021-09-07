package com.kakaopay.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kakaopay.domain.KakaoT;
import com.kakaopay.mapper.KakaoMapper;

@SpringBootTest
class MapperTests {

	@Autowired
	private KakaoMapper kakaoMapper;

	@Test
	public void testOfInsert() {
		KakaoT params = new KakaoT();
		params.setTitle("1번 테스트");
		params.setContent("1번 테스트 내용");
		params.setWriter("테스터");

		int result = kakaoMapper.insertKakaoTest(params);
		System.out.println("결과는 " + result + "입니다.");
	}
}
