package com.smhrd.web.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.web.userDetailDTO.*;

@Mapper
public interface UserMapper {

    List<FarmDetailDTO> selectFarmsByUserPhone(String userPhone);

    FarmDetailDTO selectFarmByFarmIdx(Long farmIdx);

    List<GreenhouseDTO> selectGreenhousesByFarmIdx(Long farmIdx);

    List<CCTVDTO> selectCctvsByFarmIdx(Long farmIdx);

    List<ReportDTO> selectReportsByFarmIdx(Long farmIdx);

    List<FeedbackDTO> selectFeedbacksByFarmIdx(Long farmIdx);

    List<FarmDetailDTO> selectClassificationsByFarmIdx(Long farmIdx);
}
