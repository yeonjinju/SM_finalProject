package com.smhrd.web.farm.alert.dto;


import lombok.Data;

@Data
public class ImageInfoDTO {
	// 탐지영상 가져오기, QC_IMAGE 테이블에서 가져온 이미지 URL
    private String imgUrl;
    
    private String createdAt;
    private Long anlsIdx;    
//    private Long gptIdx;
//    private String userQes;
//    private String userFile1;
//    private String userFile2;
//    private String userFile3;
//    private String gptContent;
    

}
