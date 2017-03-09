package com.credit.service;

import com.alibaba.dubbo.config.annotation.Service;

import net.aimeizi.dubbo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public int getLength(String words) {
		if (words == null || words.isEmpty()) {
			return -1;
		} else {
			return words.length();
		}
	}
}
