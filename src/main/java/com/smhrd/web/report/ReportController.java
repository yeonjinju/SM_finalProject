package com.smhrd.web.report;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @Operation(summary = "오늘 알림 통계")
    @GetMapping("/today/{farmIdx}")
    public List<ReportDTO> getTodayReport(@PathVariable Long farmIdx) {
        return reportService.getTodayReports(farmIdx);
    }

    @Operation(summary = "일별 통계")
    @GetMapping("/daily")
    public List<ReportDTO> getDailyReports(@RequestParam String year,
                                           @RequestParam String month,
                                           @RequestParam String day) {
        return reportService.getDailyReports(year, month, day);
    }

    @Operation(summary = "월별 통계")
    @GetMapping("/monthly")
    public List<ReportDTO> getMonthlyReports(@RequestParam String year,
                                             @RequestParam String month) {
        return reportService.getMonthlyReports(year, month);
    }

    @Operation(summary = "연별 통계")
    @GetMapping("/yearly")
    public List<ReportDTO> getYearlyReports(@RequestParam String year) {
        return reportService.getYearlyReports(year);
    }
}
