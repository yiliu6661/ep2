package com.example.ep2Server.service.ServiceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ep2Server.mapper.ReportMapper;
import com.example.ep2Server.pojo.TReport;
import com.example.ep2Server.service.ReportService;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl extends ServiceImpl<ReportMapper, TReport> implements ReportService {


}
