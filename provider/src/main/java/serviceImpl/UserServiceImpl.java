package serviceImpl;

import bean.UserAddress;
import service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {
    public List<UserAddress> findUsers() {
        UserAddress u1=new UserAddress("wks","SH");
        UserAddress u2=new UserAddress("wks","BJ");

        return Arrays.asList(u1,u2);
    }
}
