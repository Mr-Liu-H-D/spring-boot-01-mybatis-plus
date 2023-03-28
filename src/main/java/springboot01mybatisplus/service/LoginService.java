package springboot01mybatisplus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot01mybatisplus.dao.Mapper;
import springboot01mybatisplus.domain.Logindata;

import java.util.List;

/**
 * @Author 你的名字
 * @Date: 2023/3/27 15:28
 * @Instructions:
 */
@Service
public class LoginService {
    @Autowired
    private Mapper mapper;
    public List<Logindata> getMapper(){
        return mapper.selectList(null);
    }
}
