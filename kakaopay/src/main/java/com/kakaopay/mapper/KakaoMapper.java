package com.kakaopay.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kakaopay.domain.KakaoT;

@Mapper
public interface KakaoMapper {

	public List<KakaoT> selectKakaoList(); 
	
	public int insertKakaoTest(KakaoT params);
}
