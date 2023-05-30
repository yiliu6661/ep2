package com.example.carerServer.controllers;

import com.example.carerServer.form.ApplyStore;
import com.example.carerServer.pojo.TApply;
import com.example.carerServer.pojo.TReport;
import com.example.carerServer.pojo.TStore;
import com.example.carerServer.service.ApplyService;
import com.example.carerServer.service.StoreService;
import com.example.carerServer.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
//程序的访问地址，以及资源
@RequestMapping("/apply")
public class ApplyController {
    @Autowired
    private ApplyService applyService;
    @Autowired
    private StoreService storeService;

    @GetMapping("/getapply")
    public Result applyList(){
        List<TApply> applies=applyService.list();
        return Result.success(applies);
    }


    @GetMapping("/getapplybyid/{applyId}")
    public Result getApplyId(@PathVariable String applyId){
        TApply apply=applyService.getById(applyId);
        return Result.success(apply);
    }

    @PostMapping("/addapply")
    @Transactional //添加事务回滚，保持数据原子性
    public Result addApply(@RequestBody ApplyStore applyStore){
    TApply newApply=new TApply();
    BeanUtils.copyProperties(applyStore,newApply);
    //生成apply数据
    java.sql.Date start=java.sql.Date.valueOf(applyStore.getStart());
    java.sql.Date end=java.sql.Date.valueOf(applyStore.getEnd());
    newApply.setStartDate(start);
    newApply.setEndDate(end);
    String storeId=UUID.randomUUID().toString().substring(0,8);
    newApply.setStoreId(storeId);

    //生成店铺
    TStore newStore=new TStore();
    BeanUtils.copyProperties(applyStore,newStore);
    newStore.setStoreId(storeId);



    //添加事务回滚
        try {
            storeService.save(newStore);
            applyService.save(newApply);
            return Result.success();
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return  Result.fail();
        }
    }

    @PutMapping("/changeapply/{applyId}")
    public Result getReportById(@RequestBody TApply apply, @PathVariable String applyId){

        apply.setBusinessLicenseNumber(applyId);
        applyService.updateById(apply);
        return Result.success();
    }
}
