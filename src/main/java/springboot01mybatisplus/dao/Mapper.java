package springboot01mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import springboot01mybatisplus.domain.Logindata;

/**
 * @Author 你的名字
 * @Date: 2023/3/27 15:18
 * @Instructions:
 */
@Repository
public interface Mapper extends BaseMapper<Logindata> {
}
