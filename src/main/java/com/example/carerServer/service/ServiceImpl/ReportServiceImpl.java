package com.example.carerServer.service.ServiceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.carerServer.mapper.ReportMapper;
import com.example.carerServer.pojo.TReport;
import com.example.carerServer.service.ReportService;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl extends ServiceImpl<ReportMapper, TReport> implements ReportService {


}
