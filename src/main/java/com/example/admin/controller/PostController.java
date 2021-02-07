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

    // HTTP PUT/PATCH 메소드
    // POST메소드와 마찬가지로 Body에 데이터가 들어 있으며, 주로 업데이트에 사용된다.
    // PUT과 PATCH메소드의 차이점은? 왜 이렇게 메소드가 나눠져있을까? REST API가 무엇일까? 고민해봅시다.

    @PutMapping("/putMethod")
    public void put(){}

    @PatchMapping("/patchMethod")
    public void patch(){}

    // HTTP DELETE 메소드
    // GET 메소드와 마찬가지로 주소에 파라미터가 들어가고, 데이터를 삭제 할 떼 사용한다.

    // REST의 개념 HTTP 프로토콜에 있는 Method를 활용한 아키텍처 스타일이다.
    // REST 메소드를 이용해 적절한 url을 설계하는 방법들을 알아보자.
}
