package com.example.ep2Server.controllers;

import com.example.ep2Server.pojo.TStore;
import com.example.ep2Server.service.StoreService;
import com.example.ep2Server.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
//程序的访问地址，以及资源
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @GetMapping("/getstorelist")
    public Result getStoreList(){
        List<TStore> storeList=storeService.list();
        return Result.success(storeList);
    }

}
