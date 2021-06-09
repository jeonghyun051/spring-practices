package com.douzone.aoptest.service;

import org.springframework.stereotype.Service;

import com.douzone.aoptest.vo.ProductVo;

@Service
public class ProductService {

	public ProductVo find(String name) {
		System.out.println("[ProductService] finding...");
		
		// 인셉션 확인코드
//		if(1-1 == 0) {
//			throw new RuntimeException("Find Exception");
//		}
		return new ProductVo(name);
	}
}