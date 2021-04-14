package com.gokcedx.mindbehind.testcase.service;

import com.gokcedx.mindbehind.testcase.model.CommentDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Gökçe DOĞANAY
 * @since 1.0.0
 */
@SpringBootTest
public class WriteCommentsServiceTests {
    @Autowired
    WriteCommentsService writeCommentsService;

    @Test
    public void writeCommentsTest(){
        ArrayList<CommentDto> commentDtoList= new ArrayList<>();
        CommentDto commentDto = new CommentDto();
        commentDto.setId(10L);
        commentDto.setBody("Test");
        commentDto.setPostId(20L);
        commentDtoList.add(commentDto);
        assertTrue(writeCommentsService.writeComments(commentDtoList));
    }
}
