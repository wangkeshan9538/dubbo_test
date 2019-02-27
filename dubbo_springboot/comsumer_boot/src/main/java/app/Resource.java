package app;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.List;

@Service
public class Resource {

    @Reference
    UserService service;

    public void findAll(){
        List<UserAddress> list=service.findUsers();
        list.forEach(System.out::println);
    }

}
