package com.offcn.springbootipathydemo.dao;

import com.offcn.springbootipathydemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/11
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByName(String name);
    User findByNameAndAge(String name,Integer age);
}
