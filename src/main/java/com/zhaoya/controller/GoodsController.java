package com.zhaoya.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zhaoya.domain.Goods;
import com.zhaoya.domain.Vo;
import com.zhaoya.service.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService service;
	
	@RequestMapping("list")
	public String list(Model m,Vo vo,@RequestParam(defaultValue = "1")int pageNum) {
		PageInfo<Goods> info=service.getGoodsList(vo,pageNum);
		m.addAttribute("info", info);
		m.addAttribute("vo", vo);
		return "list";
	}
}
