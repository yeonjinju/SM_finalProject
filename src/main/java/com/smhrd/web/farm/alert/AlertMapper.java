package com.smhrd.web.farm.alert;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AlertMapper {

    // 알림 목록 조회
    public List<AlertDTO> getAlertList(@Param("farmIdx") Long farmIdx);

    // 알림 확인 처리
    public int updateNotiCheck(@Param("anlsIdx") Long anlsIdx);


}

