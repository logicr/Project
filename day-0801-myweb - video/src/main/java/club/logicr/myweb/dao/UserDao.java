package club.logicr.myweb.dao;

import club.logicr.myweb.entity.User;

/**
 * @author Jan on 2018/8/4.
 * @version 1.0
 */
public interface UserDao {
    /**
     * 用户注册
     * @param user
     * @return
     */
    boolean userLogin(User user);

    /**
     * 注册用户
     * @param user
     * @return
     */
    boolean register(User user);

    /**
     * 查询当前用户是否存在
     * @param user
     * @return
     */
    boolean userExist(User user);
}
