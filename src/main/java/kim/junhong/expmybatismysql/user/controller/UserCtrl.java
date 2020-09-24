package kim.junhong.expmybatismysql.user.controller;

import kim.junhong.expmybatismysql.user.dto.User;
import kim.junhong.expmybatismysql.user.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@MapperScan(basePackages = "kim.junhong.expmybatismysql.user.mapper")
public class UserCtrl {

    private final UserMapper userMapper;

    @Autowired
    public UserCtrl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping
    public List<User> getUsers(@RequestParam(value = "country", defaultValue = "") String country) {
        final User param = new User(0, null, country);
        return userMapper.selectUsers(param);
    }

    @GetMapping("/{seq}")
    public User getUser(@PathVariable int seq) {
        return userMapper.selectUser(seq);
    }
}
