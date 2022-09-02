package com.liny.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liny.mall.mapper.UsersMapper;
import com.liny.mall.pojo.Users;
import com.liny.mall.service.UsersService;
import com.liny.mall.vo.ResultCodeEnum;
import com.liny.mall.vo.ResultVo;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;

/**
 * @author linyi
 * @date 2022/8/31
 * 1.0
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
        implements UsersService {

    @Override
    public Page getPage() {
        Page page = new Page(1, 3);
        Page page1 = this.page(page);
        return page1;
    }

    /**
     * 用户注册
     * @param name ：账号
     * @param pwd ： 密码
     * @return
     */
    @Override
    public ResultVo userResgit(String name, String pwd) {
        Users user = this.getOne(new LambdaQueryWrapper<Users>()
                .eq(name != null, Users::getUsername, name)
        );
        if(user != null){
            return ResultVo.fail().message("该账号已存在～");
        }
        Users users = new Users();
        users.setPassword(DigestUtils.md5DigestAsHex(pwd.getBytes()));
        users.setUsername(name);
        users.setUserRegtime(new Date());
        users.setUserModtime(new Date());
        if(this.save(users)) {
            return ResultVo.ok().message("注册成功～");
        }else {
            return ResultVo.fail().message("异常，注册失败～");
        }
    }

    /**
     * 用户登陆
     * @param name ：账号
     * @param pwd ： 密码
     * @return
     */
    @Override
    public ResultVo checkLogin(String name, String pwd) {
        Users user = this.getOne(new LambdaQueryWrapper<Users>()
                .eq(name != null, Users::getUsername, name)
        );
        if(user == null){
            return ResultVo.fail().message("账号不存在,请先注册");
        }
        if(!(user.getPassword().equals(DigestUtils.md5DigestAsHex(pwd.getBytes())))){
            return ResultVo.fail().message("密码错误");
        }
        if(user.getStatus() == 1){
            return ResultVo.fail().message("账户状态异常，请申诉");

        }
        return ResultVo.ok().message("登陆成功～");
    }
}
