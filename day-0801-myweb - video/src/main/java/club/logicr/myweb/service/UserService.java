package club.logicr.myweb.service;

import club.logicr.myweb.entity.User;

/**
 * @author Jan on 2018/8/4.
 * @version 1.0
 */
public interface UserService {
    /**
     * 登录，服务层
     * @param user
     * @return
     */
    boolean login(User user);

    /**
     * 退出登录
     * @param user
     * @return
     */
    boolean logout(User user);

    /**
     * 当前用户名存在否判断
     * @param user
     * @return
     */
    boolean exist(User user);

    /**
     * 用户注册
     * @param user
     * @return
     */
    boolean register(User user);

}
