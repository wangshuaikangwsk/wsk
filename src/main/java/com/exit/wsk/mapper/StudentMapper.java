package com.exit.wsk.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {
    List<Map<String, Object>> getMapStudentList(@Param("paramMap") Map<String, Object> paramMap);

    // int getCountList(@Param("paramMap") Map<String, Object> paramMap);
}
