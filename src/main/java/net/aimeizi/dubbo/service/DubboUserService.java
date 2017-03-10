package net.aimeizi.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;

import net.aimeizi.dubbo.entity.User;

/**
 * Created by 靳玉亮 (yuliangjin@creditease.cn) on 17/3/10.
 *
 * @description
 */
@Service
public class DubboUserService implements UserService{
  @Override
  public User save(User user) {
    User user1 = new User();
    if (!(user.getUserEnName().isEmpty() || user.getUserEnName() == null)) {
      user1.setUserName(user.getUserName());
    }
    user1.setUserName("Leo");
    return user1;
  }
}
