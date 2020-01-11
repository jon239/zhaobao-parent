package com.zhaobao.manager.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "managerService")
interface ManagerServiceInterface {
    @RequestMapping("/hi")
    String sayHi(@RequestParam(value = "name") String name);
}