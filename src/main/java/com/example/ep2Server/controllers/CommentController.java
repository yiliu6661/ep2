package com.example.ep2Server.controllers;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ep2Server.pojo.TComment;
import com.example.ep2Server.service.CommentService;
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
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/getcomment/{storeid}")
    public Result commentList(@PathVariable String storeid){
        QueryWrapper query=new QueryWrapper();
        query.eq("store_id",storeid);
        List<TComment> commentList=commentService.list(query);
        return Result.success(commentList);
    }
    @PostMapping("/addcomment/{storeId}")
    public Result addComment(@RequestBody TComment comment,@PathVariable String storeId){
       TComment newComment=new TComment();
        BeanUtils.copyProperties(comment,newComment);
        newComment.setCommentId(UUID.randomUUID().toString().substring(0,8));
        newComment.setStoreId(storeId);
        System.out.println(newComment);
        commentService.save(newComment);
        return Result.success();
    }

}
