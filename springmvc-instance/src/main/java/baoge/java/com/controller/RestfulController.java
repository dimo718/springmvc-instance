package baoge.java.com.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("restful")
@RestController
// ===>  @Controller + @ResponseBody
// 整过controller中的方法如果不单独指定返回类型默认都是json字符串
public class RestfulController
{
    @GetMapping("system/{module}/{function}")
    public String load(@PathVariable("module") String module, @PathVariable("function") String function)
    {
        return module + "/" + function + "update";

    }
}
