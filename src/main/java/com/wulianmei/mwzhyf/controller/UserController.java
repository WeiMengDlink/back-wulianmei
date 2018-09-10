package com.wulianmei.mwzhyf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <Description> TODO <br>
 *
 * @author MWZHYF <br>
 * @version 1.0 <br>
 * @CreateDate 2018/9/1017:38<br>
 * @see com.wulianmei.controller <br>
 * @since V1.0 <br>
 */
@RestController
public class UserController {

    @GetMapping("hello")
    public String hello(){
        return "hello" ;
    }
}
