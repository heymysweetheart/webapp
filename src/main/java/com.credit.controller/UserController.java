package com.credit.controller;

import com.credit.model.Person;
import com.credit.model.User;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leo on 15/8/3.
 */
@Controller
@RequestMapping("/")
public class UserController {
    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/rest")
    @ResponseBody //使用ResponseBody将函数的返回直接写入HttpResponse中。
    public String getJson() {
        Gson gson = new Gson();
        User leo = new User(1, 5, "leo");
        return gson.toJson(leo).toString();
    }

    @RequestMapping(value = "/getList")
    @ResponseBody //使用ResponseBody将函数的返回直接写入HttpResponse中。
//    返回：[{"id":1,"state":6,"nickname":"leo"},{"id":1,"state":7,"nickname":"leo"},{"id":1,"state":7,"nickname":"leo"},{"id":1,"state":5,"nickname":"leo"}]
    public String getList() {
        Gson gson = new Gson();
        ArrayList<User> users = new ArrayList<User>();
        User leo = new User(1, 5, "leo");
        User lea = new User(1, 6, "leo");
        User leb = new User(1, 7, "leo");
        User lec = new User(1, 7, "leo");
        users.add(lea);
        users.add(leb);
        users.add(lec);
        users.add(leo);
        return gson.toJson(users).toString();
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    @ResponseBody //使用ResponseBody将函数的返回直接写入HttpResponse中。
    public String postData(@ModelAttribute("person")Person person) {
        person.setbMR(person.getBMR(person));
        return person.toString();
    }

    @RequestMapping(value = "/getBMR", method = RequestMethod.GET)
    @ResponseBody //使用ResponseBody将函数的返回直接写入HttpResponse中。
    public String getData(@RequestParam("name") String name, @RequestParam("age") int age,
                          @RequestParam("weight") double weight, @RequestParam("height") double height,
                          @RequestParam("gender") String gender) {
        Person person = new Person(name, age, height, weight, gender);
        person.setbMR(person.getBMR(person));
        return person.toString();
    }

}
