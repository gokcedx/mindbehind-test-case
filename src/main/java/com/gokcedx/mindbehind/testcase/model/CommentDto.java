package com.gokcedx.mindbehind.testcase.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Gökçe DOĞANAY
 * @since 1.0.0
 */
@Getter
@Setter
@EqualsAndHashCode
public class CommentDto implements Serializable {
    private Long id;
    private String body;
    private Long postId;
}
