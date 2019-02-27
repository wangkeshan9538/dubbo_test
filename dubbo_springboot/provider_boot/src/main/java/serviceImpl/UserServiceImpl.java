package serviceImpl;

import bean.UserAddress;
import org.apache.dubbo.config.annotation.Service;
import service.UserService;

import java.util.Arrays;
import java.util.List;



@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> findUsers() {
        UserAddress u1=new UserAddress("wks","SH");
        UserAddress u2=new UserAddress("wks","BJ");

        return Arrays.asList(u1,u2);
    }
}
