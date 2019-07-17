package com.exit.wsk.serviceimpl;

import com.exit.wsk.mapper.StudentMapper;
import com.exit.wsk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Map<String, Object>> getMapStudentList(Map<String, Object> paramMap) {

        return studentMapper.getMapStudentList(paramMap);
    }

//    @Override
//    public int getCountList(Map<String, Object> paramMap) {
//        return studentMapper.getCountList(paramMap);
//    }
}
