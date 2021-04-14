package com.gokcedx.mindbehind.testcase.controller;

import com.gokcedx.mindbehind.testcase.model.CommentDto;
import com.gokcedx.mindbehind.testcase.service.GetCommentsService;
import com.gokcedx.mindbehind.testcase.service.WriteCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Gökçe DOĞANAY
 * @since 1.0.0
 */
@RestController
@RequestMapping(value="/mindbehind")
public class CommentsController {

    @Autowired
    GetCommentsService getCommentsService;

    @Autowired
    WriteCommentsService writeCommentsService;

    final String endPointUrl = "https://my-json-server.typicode.com/typicode/demo/comments";

    @GetMapping("/getComments")
    public String getComments(){
        List<CommentDto> commentDtoList = getCommentsService.getComments(endPointUrl);
        boolean success = writeCommentsService.writeComments(commentDtoList);
        return "Success: "+ success + "! Check [comments.txt]";
    }
}
