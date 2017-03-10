package com.credit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 靳玉亮 (yuliangjin@creditease.cn) on 17/3/10.
 *
 * @description
 */
@Controller
@RequestMapping("/yuliang")
public class TestController {
  @RequestMapping(value = "test", method = RequestMethod.GET)
  @ResponseBody
  public String test() {
    return "hello spring!";
  }
}
