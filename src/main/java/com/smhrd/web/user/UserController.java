package com.smhrd.web.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.web.userDetailDTO.FarmDetailDTO;
import com.smhrd.web.userDetailDTO.FarmDetailResponseDTO;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
    private UserService userService;

	// 1. 로그인 유저 휴대폰번호로 농장 리스트 조회
    @GetMapping("/farms")
    public ResponseEntity<List<FarmDetailDTO>> getUserFarms(@RequestParam String userPhone) {
        List<FarmDetailDTO> farms = userService.getFarmsByUserPhone(userPhone);
        return ResponseEntity.ok(farms);
    }
    
    // 2. farmIdx로 농장 상세 정보 조회s
    @GetMapping("/farms/{farmIdx}/detail")
    public ResponseEntity<FarmDetailResponseDTO> getFarmDetail(@PathVariable Long farmIdx) {
        FarmDetailResponseDTO detail = userService.getFarmDetail(farmIdx);
        return ResponseEntity.ok(detail);
    }
    
}
