package com.example.carerServer.service.ServiceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.carerServer.mapper.CommentMapper;
import com.example.carerServer.pojo.TComment;
import com.example.carerServer.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, TComment> implements CommentService {


}
