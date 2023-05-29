package com.example.ep2Server.controllers;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ep2Server.pojo.TReport;
import com.example.ep2Server.service.ReportService;
import com.example.ep2Server.service.StoreService;
import com.example.ep2Server.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
//程序的访问地址，以及资源
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private ReportService reportService;
    @Autowired
    private StoreService storeService;

    @GetMapping("/getreportlist")
    public Result getReportList(){
        List<TReport> reportList=reportService.list();
        return Result.success(reportList);
    }

    @GetMapping("/getreportbyid/{reportId}")
    public Result getReportById(@PathVariable String reportId){
        return Result.success(reportService.getById(reportId));
    }

    @PostMapping("/addreport/{storeName}")
    public Result addReport(@RequestBody TReport report,@PathVariable String storeName){
        TReport newReport =new TReport();
        BeanUtils.copyProperties(report,newReport);
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("store_name",storeName);
        String storeId=storeService.getOne(queryWrapper).getStoreId();
        newReport.setStoreId(storeId);
        newReport.setReportId(UUID.randomUUID().toString().substring(0,8));
        reportService.save(newReport);
        return Result.success();
    }

    @PutMapping("/changestatus/{reportId}/{storeId}")
    public Result getReportById(@RequestBody TReport report,@PathVariable String reportId,@PathVariable String storeId){
        TReport newReport=new TReport();
        BeanUtils.copyProperties(report,newReport);
        newReport.setReportId(reportId);
        newReport.setStoreId(storeId);
        System.out.println(newReport);
//        if(report.getReportStatus()==0)
//            newReport.setReportStatus(1);
//        else
//            newReport.setReportStatus(0);
        reportService.updateById(newReport);
        return Result.success();
    }

}
