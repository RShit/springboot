package com.example.springboot.controller;

import com.example.springboot.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主界面
 * @author liuyy
 * @date 2019年5月7日16:17:28
 */
@Controller
public class IndexController extends BaseController {
    private static Logger logger = LoggerFactory.getLogger(PassController.class);
    @RequestMapping("/index")
    public String index(Model model){
        logger.debug(SecurityUtils.getSubject().isAuthenticated()+"");
        model.addAttribute("userName",getCurrentUser().getFullName());
        return "index";
    }
}
