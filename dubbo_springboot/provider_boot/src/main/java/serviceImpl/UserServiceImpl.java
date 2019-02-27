package serviceImpl;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.UserService;

import java.util.Arrays;
import java.util.List;


@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> findUsers() {
        UserAddress u1=new UserAddress("wks","SH");
        UserAddress u2=new UserAddress("wks","BJ");

        return Arrays.asList(u1,u2);
    }
}
