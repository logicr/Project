package club.logicr.myweb.service.impl;

import club.logicr.myweb.dao.UserDao;
import club.logicr.myweb.entity.User;
import club.logicr.myweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * @author Jan on 2018/8/4.
 * @version 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public boolean login(User user) {
        if (null == user) {
            return false;
        }
        if (StringUtils.isEmpty(user.getUsername()) || StringUtils.isEmpty(user.getPassword())) {
            return false;
        }
        return userDao.userLogin(user);
    }

    @Override
    public boolean logout(User user) {
        return false;
    }

    @Override
    public boolean exist(User user) {
        return userDao.userExist(user);
    }

    @Override
    public boolean register(User user) {
        return userDao.register(user);
    }

}
