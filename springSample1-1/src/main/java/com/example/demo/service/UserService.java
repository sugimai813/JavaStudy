package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.UserRequest;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
	/**
	 * ユーザー情報 Repository
	 */
	//2行追加
   @Autowired
   private static UserRepository userRepository;


	/**
	 * ユーザー情報 全検索
	 * @return  検索結果
	 */
	public List<UserEntity> searchAll() {
		//1行追加
		return userRepository.findAll();

	}
	
	/**
	 * ユーザー情報 主キー検索
	 * @return  検索結果
	 */
	public Optional<UserEntity> findById(Integer id) {
		//実装1行
		return userRepository.findById(id);
	}

	/**
	 * ユーザー情報 新規登録
	 * @param  user ユーザー情報
	 */
	public static void create(UserRequest userRequest) {
		Date now = new Date();
		UserEntity user = new UserEntity();
                        //実装2行
		user.setName(userRequest.getName());
		user.setAddress(userRequest.getAddress());
		user.setPhone(userRequest.getPhone());
		user.setCreateDate(now);
		user.setUpdateDate(now);
                       //保存するメソッド実装1行
		userRepository.save(user);
}
}