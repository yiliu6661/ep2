package com.example.ep2Server.service.ServiceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ep2Server.mapper.StoreMapper;
import com.example.ep2Server.pojo.TStore;
import com.example.ep2Server.service.StoreService;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl extends ServiceImpl<StoreMapper, TStore> implements StoreService {


}
