package springbootapplication.domain;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @Author 你的名字
 * @Date: 2023/3/27 14:38
 * @Instructions:
 */
@Data
@Repository
public class Login {
    private String username;
    private String password;
    private String email;
}
