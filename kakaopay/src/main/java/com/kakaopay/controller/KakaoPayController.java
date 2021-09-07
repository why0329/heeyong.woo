package com.kakaopay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kakaopay.service.KakaoService;

@Controller
public class KakaoPayController {

	@Autowired
	private KakaoService kakaoService;

	@GetMapping(value = "/kakao/test.do")
	public String kakaoTest(Model model) {
		return "kakao/test";
	}
}
