package com.example.admin.controller;

import com.example.admin.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {
    // HTTP POST 메소드 실습
    //  주소창에 파라미터가 노출지 않는다. ex) localhost:8080/api/postMultiParameter
    //  GET 메소드 보다 보안에 안전하다. But 맘먹으면 Request Body를 까볼 수 있다.
    //  GET 처럼 대놓고 보여주는 것보다 안정하고. JSON형식으로 통신하기 편리하다.
    // HTTP 메소드에대한 정리를 꼼꼼히 해보는 것도 큰 도움이 된다. (개발에 도움이 될 뿐만아니라 면접에서 단골 질문)
    //      사용 예시 - HTML <Form>, Ajax 검색
    //              json, xml, multipart-form / text-plain

//    @RequestMapping(method = RequestMethod.POST, path = "/postMethod")
    @PostMapping("/postMethod") // Default -> json
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }

}
