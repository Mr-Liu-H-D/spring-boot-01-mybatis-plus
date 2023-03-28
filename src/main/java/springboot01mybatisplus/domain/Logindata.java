package springboot01mybatisplus.domain;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @Author 你的名字
 * @Date: 2023/3/27 15:13
 * @Instructions:
 */
@Data
@Repository
public class Logindata {
    private String usename;
    private String password;
    private String email;
}
