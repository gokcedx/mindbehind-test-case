package com.gokcedx.mindbehind.testcase.service;

import com.gokcedx.mindbehind.testcase.model.CommentDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Gökçe DOĞANAY
 * @since 1.0.0
 */
@SpringBootTest
public class GetCommentsServiceTests {
    @Autowired
    GetCommentsService getCommentsService;

    @Test
    public void getCommentsTest(){
        ArrayList<CommentDto> mockList = getMockArray();
        assertEquals(mockList,getCommentsService.getComments("https://my-json-server.typicode.com/typicode/demo/comments"));
    }

    public ArrayList<CommentDto> getMockArray(){
        //Mock array from real data in endpoint url
        ArrayList<CommentDto> commentDtoList= new ArrayList<>();
        CommentDto commentDto = new CommentDto();
        commentDto.setId(1L);
        commentDto.setBody("some comment");
        commentDto.setPostId(1L);
        commentDtoList.add(commentDto);
        CommentDto commentDto2 = new CommentDto();
        commentDto2.setId(2L);
        commentDto2.setBody("some comment");
        commentDto2.setPostId(1L);
        commentDtoList.add(commentDto2);
        return commentDtoList;
    }
}
