package springboot01mybatisplus.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springboot01mybatisplus.dao.Mapper;
import springboot01mybatisplus.domain.Logindata;
import springboot01mybatisplus.service.LoginService;

import java.util.List;

/**
 * @Author 你的名字
 * @Date: 2023/3/27 15:10
 * @Instructions:
 */
@Controller
public class Show {
  @Autowired
  private LoginService service;

  @RequestMapping("/login")
    public String getLogin(Model model){
    List<Logindata> loginData = service.getMapper();
    model.addAttribute("loginData",loginData);
    return "list";
  }
}
