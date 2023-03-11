package com.example.controller;

import com.example.common.Result;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController//所有方法均返回json数据
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 增
     * @param user
     * @return
     */
    @PostMapping
    public Result add(@RequestBody User user){
        userService.save(user);
        return Result.success();
    }

    /**
     * 改
     * @param user
     * @return
     */
    @PutMapping
    public Result update(@RequestBody User user){
        userService.save(user);
        return Result.success();
    }

    /**
     * 删除
     * /user/1
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){
        userService.delete(id);
        return Result.success();
    }

    /**
     * id查询
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<User> findById(@PathVariable Long id){
        userService.findById(id);
        return Result.success();
    }
    /**
     * 分页模糊查询
     * @return
     */
    @GetMapping("/page")
    public Result<Page<User>> findPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                       @RequestParam(defaultValue = "10") Integer pageSize,
                                       @RequestParam(required = false) String name){

        return Result.success(userService.findPage(pageNum,pageSize,name));
    }

}
