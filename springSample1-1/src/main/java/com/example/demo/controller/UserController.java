package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
/**
 * ユーザー情報 Controller
 */
@Controller
public class UserController {
  /**
   * ユーザー情報 Service
   */
  //2行追加
  @Autowired
  UserService userService;

  /**
   * ユーザー情報一覧画面を表示
   * @param  model Model
   * @return  ユーザー情報一覧画面のHTML
   */
  @RequestMapping("/user/list")
	public String displayList(Model model) {

    //3行追加
	  List<UserEntity> userlist = userService.searchAll();
	  model.addAttribute("userlist", userlist);
	  return "user/list";
      }
	
	  /**
		 * ユーザー新規登録画面を表示
		 * @param  model Model
		 * @return  ユーザー情報一覧画面
		 */
	@RequestMapping("/user/add")
	  public String displayAdd(Model model) {
	  return "user/add";
	 }
		/**
		 * ユーザー情報詳細画面を表示
		 * @param  id 表示するユーザーID
		 * @param  model Model
		 * @return  ユーザー情報詳細画面
		 */
	@RequestMapping("/user/{id}")
	 public String displayView(@PathVariable  Integer id, Model model) {
	 return "user/view";
	 }
}