package com.example.ep2Server.service.ServiceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ep2Server.mapper.CommentMapper;
import com.example.ep2Server.pojo.TComment;
import com.example.ep2Server.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, TComment> implements CommentService {


}
