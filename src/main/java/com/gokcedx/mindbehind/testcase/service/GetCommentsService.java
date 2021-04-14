package com.gokcedx.mindbehind.testcase.service;

import com.gokcedx.mindbehind.testcase.exception.NotFoundException;
import com.gokcedx.mindbehind.testcase.model.CommentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Gökçe DOĞANAY
 * @since 1.0.0
 */
@Service
public class GetCommentsService {

    public List<CommentDto> getComments(String endPointUrl){
        List<CommentDto> commentDtoList;
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<CommentDto[]> responseEntity = restTemplate.getForEntity(endPointUrl, CommentDto[].class);
            CommentDto[] commentDtoArray = responseEntity.getBody();
            commentDtoList = Arrays.stream(commentDtoArray).collect(Collectors.toList());
        }catch (Exception e){
            throw new NotFoundException();
        }
        return commentDtoList;
    }
}
