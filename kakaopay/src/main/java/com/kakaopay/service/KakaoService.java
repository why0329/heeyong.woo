package com.kakaopay.service;

import java.util.List;

import com.kakaopay.domain.KakaoT;

public interface KakaoService {

	public List<KakaoT> getKakaoList(); 
	
	public int setKakaoTest(KakaoT params);
}
