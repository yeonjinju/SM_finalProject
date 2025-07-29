package com.smhrd.web.farm.alert;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertService {

    @Autowired
    private AlertMapper alertMapper;

    public List<AlertDTO> getAlertList(Long farmIdx) {
        return alertMapper.getAlertList(farmIdx);
    }
    
    public void markAsRead(Long anlsIdx) {
        System.out.println("updateNotiCheck 실행, anlsIdx = " + anlsIdx);
        alertMapper.updateNotiCheck(anlsIdx);
    }



}
