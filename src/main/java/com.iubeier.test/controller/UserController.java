package com.iubeier.test.controller;

import com.iubeier.test.entity.UserEntity;
import com.iubeier.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by jankie on 16/1/9.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("showUser")
    public String showUserEntity(String id, ModelMap modelMap, HttpServletRequest request) {
        UserEntity user = userService.getUserById(id);
//        if(user == null){
//            user = new UserEntity();
//            user.setEmail("");
//            user.setUserId("");
//        }
        modelMap.put("user", user);
        return "showUser";
    }

    @RequestMapping("/user/{id}")
    public String detail(@PathVariable(value = "id") String id, ModelMap model) {
        UserEntity userEntity = userService.getUserById(id);
        System.out.println(userEntity.getEmail());
        model.put("user", userEntity);
        return "detail";
    }

    @RequestMapping("/userlist")
    public String list(ModelMap model){
        List<UserEntity> userList = userService.getUserList();
        model.put("users",userList);
        return  "list";
    }
}
