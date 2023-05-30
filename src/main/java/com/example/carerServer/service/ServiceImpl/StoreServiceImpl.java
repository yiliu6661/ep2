package com.example.carerServer.service.ServiceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.carerServer.mapper.StoreMapper;
import com.example.carerServer.pojo.TStore;
import com.example.carerServer.service.StoreService;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl extends ServiceImpl<StoreMapper, TStore> implements StoreService {


}
