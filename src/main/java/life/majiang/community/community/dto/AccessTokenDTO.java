package life.majiang.community.community.dto;

import lombok.Data;

@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_url;
    private String state;
}
