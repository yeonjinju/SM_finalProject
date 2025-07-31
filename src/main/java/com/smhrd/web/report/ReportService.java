package com.smhrd.web.report;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    @Autowired
    private ReportMapper reportMapper;

    public List<ReportDTO> getTodayReports(Long farmIdx) {
        return reportMapper.findTodayReports(farmIdx);
    }

    public List<ReportDTO> getDailyReports(String year, String month, String day) {
        return reportMapper.findDailyReports(year, month, day);
    }

    public List<ReportDTO> getMonthlyReports(String year, String month) {
        return reportMapper.findMonthlyReports(year, month);
    }

    public List<ReportDTO> getYearlyReports(String year) {
        return reportMapper.findYearlyReports(year);
    }
}
