package com.exit.wsk.controller;

import com.exit.wsk.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("getStudentList")
    public String getStudentList(Model model) {
//, @RequestParam(name = "cpage",defaultValue = "1")int cpage,
//                             @RequestParam(name = "mohu",defaultValue = "")String mohu
//        int pageSize = 2;//每页条数
//        int index=(cpage-1)*pageSize;//起始页数

        Map<String, Object> paramMap = new HashMap<String, Object>();

//        paramMap.put("pageSize",pageSize);
//        paramMap.put("index",0);
//        paramMap.put("mohu",mohu);

        List<Map<String, Object>> mapStudentList = studentService.getMapStudentList(paramMap);
//        int count = studentService.getCountList(paramMap);
//
//        Map<String, Object> page = PageUtil.page("getStudentList", cpage, pageSize, count, mohu);

        model.addAttribute("mapStudentList", mapStudentList);
//               model.addAttribute("page",page);
//        model.addAttribute("mohu",mohu);

        return "list";
    }


}
