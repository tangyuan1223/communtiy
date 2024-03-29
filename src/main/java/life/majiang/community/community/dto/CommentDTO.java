package life.majiang.community.community.dto;

import life.majiang.community.community.model.User;
import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtModified;
    private Long gmtCreate;
    private Long likeCount;
    private String content;
    private Integer commentCount;
    private User user;
}
