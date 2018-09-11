package com.wulianmei.mwzhyf.controller;

import com.wulianmei.mwzhyf.model.User;
import com.wulianmei.mwzhyf.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private UserService userService;
    /**
     *
     * <Description> TODO <br>
     *
     * @author MWZHYF <br>
     * @version 1.0 <br>
     * @param input param <br>
     * @return result
     */
    @GetMapping("hello")
    public String hello(){
        return "hello" ;
    }
    /**
     *
     * <Description> TODO <br>
     *
     * @author MWZHYF <br>
     * @version 1.0 <br>
     * @param input param <br>
     * @return result
     */
    @GetMapping("/user/{id}")
    @ApiOperation("查询单个用户")
    public User queryUser(@PathVariable("id") String id){
        return userService.queryUser(id);
    }
    /**
     *
     * <Description> TODO <br>
     * register the system
     * @author MWZHYF <br>
     * @version 1.0 <br>
     * @param input param <br>
     * @return result
     */
    @PostMapping("/user")
    @ApiOperation("注册用户")
    public User register(@RequestBody User user){
        return userService.createUser(user);
    }


}
