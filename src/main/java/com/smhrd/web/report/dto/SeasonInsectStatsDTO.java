package com.smhrd.web.report.dto;

import lombok.Data;

@Data
public class SeasonInsectStatsDTO {
    private String season;       // 봄, 여름, 가을, 겨울
    private String insectName;   // 해충 이름
    private int countYear1;      // ex) 2024년 탐지수
    private int countYear2;      // ex) 2025년 탐지수
    private int predictedYear3;  // ex) 2026년 예측수
}
