package com.icia.ex2.controller;

import com.icia.ex2.dto.StudentDTO;
import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello1")
    public String hello1() {
        return "hello1";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "hello2";
    }

    @GetMapping("/hello-param1")
    public String helloparam1(@RequestParam("name") String name, @RequestParam("age") int age) {
        System.out.println("name = " + name + ", age = " + age);
        return "index";

    }

    //   @RequestMapping(value = "/form=param1", method = RequestMethod.GET)
    //   이런 어노테이션 방법도 있다
    @GetMapping("/form-param1")
    public String formparam1(@RequestParam("p1") String p1, @RequestParam("p2") String p2) {
        //  매개 변수 HttpServletRequest request 방법도 있다
        System.out.println("p1 = " + p1 + ", p2 = " + p2);
        return "index";
    }

    @PostMapping("/form-param2")
    public String formparam2(@RequestParam String p3, @RequestParam String p4) {
        // 화면에서 보내는 파라미터에 이름과 우리가 받아주는 변수의 이름이 일치하면
        // ("변수이름")을 생략할 수 있다
        System.out.println("p3 = " + p3 + ", p4 = " + p4);
        return "index";
    }
    @GetMapping("/hello3")
    public String hello3(Model model) {
        String s1 = "안녕하세요";
        model.addAttribute("m1",s1);
        return "hello3";
    }
    @GetMapping("/hello4")
    public String hello4(Model model){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("학생1");
        studentDTO.setStudentNumber("12341234");
        model.addAttribute("student",studentDTO);
        System.out.println("model = " + model);
        return "hello4";
    }
    // hello5 요청을 처리하는 메서드
    // 실행내용 : SttudentDTO 객체를 담는 ArrayList를 선언하고 학생 2명의 정보를 리스트에
    // 저장후 리스트를 모델에 담자
    @GetMapping("/hello5")
    public  String hello5(Model model) {
        List<StudentDTO> studentDTOSList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            studentDTOSList.add(newStudentDTO(i));
        }
        model.addAttribute("studentList", studentDTOSList);
        return "hello5";
    }
    private StudentDTO newStudentDTO(int i){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId((long) i);
        studentDTO.setStudentName("학생"+ i);
        studentDTO.setStudentNumber("111110"+i);
        return studentDTO;
    }
}
