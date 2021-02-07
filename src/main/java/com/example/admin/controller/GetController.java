package com.example.admin.controller;

import com.example.admin.controller.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // LocalHost : 8080/api
public class GetController {

    // HTTP GET 메소드 실습
    //  주소창에 파라미터가 노출된다. ex)? 로시작 :: ?id=1234&password=abc
    // 브라우저에서 주소에 대한 캐시가 이루어 진다. History 관리가 된다.
    //  -> 정보를 얻을 때 사용. (검색 내용, 이벤트 페이지, 상품 정보 등 노출 시 이득되는 정보)
    //  -> 정보가 노출되면 안될때 사용하면 보안 취약점이 될 수 있다.
    @RequestMapping(method = RequestMethod.GET,path = "/getMethod")
    public String getRequest(){
        return "Hi getMethod";
    }

    @GetMapping("/getParameter") //localhost:8080/api/getParameter?id=1234&password=abc
    public String getParameter(@RequestParam String id, @RequestParam String password){
        System.out.println("id : " + id);
        System.out.println("password : " + password);
        return  id + password;
    }

    @GetMapping("/getParameter1") //localhost:8080/api/getParameter1?id=1234&password=abc변경
    public String getParameter1(@RequestParam String id, @RequestParam(name = "password") String pwd){
        // 파라미터 변수명 변경
        System.out.println("id : " + id);
        System.out.println("password : " + pwd);
        return  id + pwd;
    }

    @GetMapping("/getMultiParameter") //localhost:8080/api/getMultiParameter?account=1234&email=abc변경?page=10
    public String getMultiParameter(SearchParam searchParam){ // Class 형태로 묶음단위 파라미터 처리
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());
        return "OK";
    }

    @GetMapping("/getMultiParameter1") //localhost:8080/api/getMultiParameter1?account=1234&email=abc변경&page=10
    public SearchParam getMultiParameter1(SearchParam searchParam){
        // Spring에서 기본 채택 및 사용하는 JSON 컨버터인 Jackson 라이브러리이 클래스를 JSON 형태로 응답값을 만들어주는 방법
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());
        return searchParam; // {"accout":null,"email":"abc변경?page=10","page":0}
    }
}
