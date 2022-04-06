package baoge.java.com.controller;

import baoge.java.com.model.User;
import baoge.java.com.model.UserCustom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: springmvc-instance
 * @description: 样例
 * @author: GongBaoXiong
 * @create: 2022-03-15 15:51 周二
 **/
@Controller
@RequestMapping("/test")
public class TestController
{
    //注意：请求路径=类上面@RequestMapping的value + 方法上面@RequestMapping的value

    //定义访问请求路径及映射方法http://localhost:8080/test/one
    @RequestMapping("/one")
    public ModelAndView hello()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello111");
        return mv;
    }




    @RequestMapping("/two")
    // @RequestParam 命名参数注解http://localhost:8080/test/two?msg="消息"
    public ModelAndView hello1(@RequestParam("msg") String message)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        //绑定视图需要渲染数据
        mv.addObject("message", message);
        return mv;

    }

    /**
     * 对象参数类型绑定
     *
     * @param user
     */
    @RequestMapping("/receiveUser")
    public void pojo(User user)
    {
        System.out.println(user);
    }

    /**
     * 嵌套对象绑定
     *
     * @param userCustom
     */
    @RequestMapping("/receiveUserCustom")
    public void pojo(UserCustom userCustom)
    {
        System.out.println(userCustom);
    }

    ////////////////////// 构建高级参数绑定测试实例////////////////
    @GetMapping("list")
    // model使用绑定渲染到页面数据
    public String list(Model model)
    {
        // 构建一个用户集合
        List<User> list = Arrays.asList(new User(1L, "张三", 12), new User(2L, "李四", 33), new User(3L, "王五", 44));
        model.addAttribute("userList", list);
        return "users";
    }

    /**
     * 绑定高级参数-数组测试
     *
     * @param userCustom
     */
    @RequestMapping("/receiveArray")
    public void pojo2(UserCustom userCustom)
    {
        System.out.println(userCustom.getAges());
        for (int age : Arrays.asList(userCustom.getAges()))
        {
            System.out.println(age);
        }
    }

    @RequestMapping("/receiveArray")
    public void pojo2(ArrayList<Integer> ages)
    {
        for (int age : ages)
        {
            System.out.println(age);
        }
    }

    @RequestMapping("/receiveList")
    public void pojo1(UserCustom userCustom)
    {
        System.out.println(userCustom);
    }



    // 通过method属性指定当前这个请求的请求方式必须是POST
    @RequestMapping(value = "/userJson",method = RequestMethod.POST)
    @ResponseBody // 调用方法返回的结果转换为一个json对象
    // RequestBody 把从前端接收的json字符串转换为对应类型对象
    public User json(@RequestBody User user)
    {
        return user;
    }


    @GetMapping("system/{module}/{function}")
    public String load(
            @PathVariable("module") String module,
            @PathVariable("function") String function
                      )
    {
        return module+"/"+function;
    }









}




