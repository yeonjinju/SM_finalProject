package com.smhrd.web.admin;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FarmInsertMapper {
    int insertFarm(FarmInsertDTO dto);
}
