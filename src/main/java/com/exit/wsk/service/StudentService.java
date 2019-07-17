package com.exit.wsk.service;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<Map<String, Object>> getMapStudentList(Map<String, Object> paramMap);

    //  int getCountList(Map<String, Object> paramMap);
}
