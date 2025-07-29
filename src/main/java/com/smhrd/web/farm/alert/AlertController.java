package com.smhrd.web.farm.alert;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/user/alert")
public class AlertController {

    @Autowired
    private AlertService alertService;

    @Operation(summary = "알림 목록 조회")
    @GetMapping("/list/{farmIdx}")
    public ResponseEntity<List<AlertDTO>> getAlertList(@PathVariable Long farmIdx) {
        List<AlertDTO> alerts = alertService.getAlertList(farmIdx);
        return ResponseEntity.ok(alerts);
    }

    @Operation(summary = "알림 읽음 처리")
    @PostMapping("/read/{anlsIdx}")
    public ResponseEntity<String> markAlertAsRead(@PathVariable Long anlsIdx) {
        alertService.markAsRead(anlsIdx);
        return ResponseEntity.ok("알림 읽음 처리 완료");
    }
}
