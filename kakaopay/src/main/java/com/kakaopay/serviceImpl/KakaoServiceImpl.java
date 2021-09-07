package com.kakaopay.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kakaopay.domain.KakaoT;
import com.kakaopay.mapper.KakaoMapper;
import com.kakaopay.service.KakaoService;

@Service
public class KakaoServiceImpl implements KakaoService {

	@Autowired
	private KakaoMapper kakaoMapper;

	@Override
	public List<KakaoT> getKakaoList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setKakaoTest(KakaoT params) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
