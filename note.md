# 文档访问地址：http://localhost:8080/doc.html

# MD5密码加密：
```java
String password = DigestUtils.md5DigestAsHex(pwd.getBytes());
``` 
# @CrossOrigin //允许跨域请求

# 传参类型可以以类的形式传。可扩展性高
```java
@ApiOperation("⽤户登录接⼝")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "username", value = "⽤户登录账 号", required = true),
            @ApiImplicitParam(dataType = "string", name = "password", value = "⽤户登录密 码", required = true)
    })
    @GetMapping("/login")
    public ResultVo login(@RequestParam("username") String name,
                          @RequestParam(value = "password") String pwd) {
        return usersService.checkLogin(name,pwd);
    }
    或者

    @GetMapping("/login")
    public ResultVo login( Users users) {
        return usersService.checkLogin(users.getUsername(), users.getPassword());
    }
```