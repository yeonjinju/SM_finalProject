package com.smhrd.web.report;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ReportMapper {
    List<ReportDTO> findTodayReports(@Param("farmIdx") Long farmIdx);
    List<ReportDTO> findDailyReports(@Param("year") String year, @Param("month") String month, @Param("day") String day);
    List<ReportDTO> findMonthlyReports(@Param("year") String year, @Param("month") String month);
    List<ReportDTO> findYearlyReports(@Param("year") String year);
}
