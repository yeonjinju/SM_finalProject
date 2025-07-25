package com.smhrd.web.user;

import lombok.Data;

@Data
public class UserDTO {
	// Farm
	private Long farmIdx;
	private String farmName;
	private String farmAddr;
	private String farmPhone;
	private String farmCrops;
	private String farmArea;
	private String farmImg;
	
	// User
	private String userPhone;
//	private String userPw;
	private String userName;

}


// 로그인하면 농장만 뜨지않나?