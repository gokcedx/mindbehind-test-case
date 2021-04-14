package com.gokcedx.mindbehind.testcase.service;

import com.gokcedx.mindbehind.testcase.model.CommentDto;
import com.gokcedx.mindbehind.testcase.exception.FileWritingException;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * @author Gökçe DOĞANAY
 * @since 1.0.0
 */
@Service
public class WriteCommentsService {
    public boolean writeComments(List<CommentDto> commentDtoList){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("comments.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            oos.writeObject(commentDtoList);  // all
            CommentDto commentDto = commentDtoList.get(commentDtoList.size() - 1); // last dto model
            String formattedComment = commentDto.getId() + ", " + commentDto.getBody() + ", " + commentDto.getPostId();
            objectOutputStream.writeObject(formattedComment);
            objectOutputStream.close();
        } catch(IOException ex) {
            throw new FileWritingException();
        }
        return true;
    }
}
