package baoge.java.com.model;

import java.util.List;

public class UserCustom
{
    private User user;
    private List<User> userList;
    private Integer[] ages;

    public Integer[] getAges()
    {
        return ages;
    }

    public void setAges(Integer[] ages)
    {
        this.ages = ages;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public List<User> getUserList()
    {
        return userList;
    }

    public void setUserList(List<User> userList)
    {
        this.userList = userList;
    }

    @Override
    public String toString()
    {
        return "UserCustom{" + "user=" + user + ", userList=" + userList + '}';
    }
}