import app.Resource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        Resource demoService = (Resource)context.getBean(Resource.class); // 获取远程服务代理
        demoService.findAll(); // 执行远程方法
        System.in.read();
    }
}
