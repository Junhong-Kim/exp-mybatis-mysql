package kim.junhong.expmybatismysql.user.mapper;

import kim.junhong.expmybatismysql.user.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    List<User> selectUsers(User param);
    User selectUser(int seq);
}
