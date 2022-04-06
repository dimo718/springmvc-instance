package baoge.java.com.controller;
import baoge.java.com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/json")
public class JsonController
{
    // 通过method属性指定当前这个请求的请求方式必须是POST
    @RequestMapping(value = "/userJson", method = RequestMethod.POST)
    @ResponseBody // 调用方打打法返回的结果转换为一个json对象
    // RequestBody 把从前端接收的json字符串转换为对应类型对象
    public User json(@RequestBody User user)
    {
        return user;
    }
}
