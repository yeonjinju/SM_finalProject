package com.smhrd.web.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.web.userDetailDTO.*;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    // 유저 휴대폰번호로 농장 리스트 조회
    public List<FarmDetailDTO> getFarmsByUserPhone(String userPhone) {
        return userMapper.selectFarmsByUserPhone(userPhone);
    }

    // farmIdx로 농장 상세 정보 조회
    public FarmDetailResponseDTO getFarmDetail(Long farmIdx) {
        FarmDetailResponseDTO response = new FarmDetailResponseDTO();

        FarmDetailDTO farm = userMapper.selectFarmByFarmIdx(farmIdx);
        response.setFarm(farm);
        response.setGreenhouses(userMapper.selectGreenhousesByFarmIdx(farmIdx));
        response.setCctvs(userMapper.selectCctvsByFarmIdx(farmIdx));
        response.setReports(userMapper.selectReportsByFarmIdx(farmIdx));
        response.setFeedbacks(userMapper.selectFeedbacksByFarmIdx(farmIdx)); // 피드백 추가 (mapper 필요)
        response.setClassifications(userMapper.selectClassificationsByFarmIdx(farmIdx)); // 분류 추가 (mapper 필요)

        return response;
    }
}
