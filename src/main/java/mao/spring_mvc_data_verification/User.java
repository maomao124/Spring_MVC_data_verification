package mao.spring_mvc_data_verification;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

/**
 * Project name(项目名称)：Spring_MVC_data_verification
 * Package(包名): mao.spring_mvc_data_verification
 * Class(类名): User
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/10
 * Time(创建时间)： 20:19
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class User
{
    @NotNull(message = "用户id不能为空")
    private Integer id;
    @NotNull
    @Length(min = 2, max = 8, message = "用户名不能少于2位大于8位")
    private String name;
    @Email(regexp = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]", message = "邮箱格式不正确")
    private String email;

    /**
     * Instantiates a new User.
     */
    public User()
    {
    }

    /**
     * Instantiates a new User.
     *
     * @param id    the id
     * @param name  the name
     * @param email the email
     */
    public User(Integer id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId()
    {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id)
    {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("email：").append(email).append('\n');
        return stringbuilder.toString();
    }
}
