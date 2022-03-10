package mao.spring_mvc_data_verification;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.awt.*;
import java.util.List;

/**
 * Project name(项目名称)：Spring_MVC_data_verification
 * Package(包名): mao.spring_mvc_data_verification
 * Class(类名): UserController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/10
 * Time(创建时间)： 20:28
 * Version(版本): 1.0
 * Description(描述)： 无
 */


@Controller
public class UserController
{
    @RequestMapping("/validate")
    public String validate(@Valid User user, BindingResult result)
    {
        System.out.println(user);
        // 获取异常信息对象
        List<ObjectError> errors = result.getAllErrors();
        System.out.println(errors.size());
        if (errors.size() > 0)
        {
            Toolkit.getDefaultToolkit().beep();
            // 将异常信息输出
            for (ObjectError error : errors)
            {
                System.out.println(error.getDefaultMessage());
            }
        }
        return "index";
    }

    @RequestMapping(value = "/addUser")
    public String add()
    {
        return "addUser";
    }
}
