package com.sinosdx.maven.controller.test;

import com.wf.captcha.ArithmeticCaptcha;
import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

/**
 * @Date 2022/2/9 17:20
 * @Author gongzhenyu
 * @Describe
 */
@Controller
public class CaptchaController {

    @RequestMapping("/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CaptchaUtil.out(request, response);
    }

    @RequestMapping("/captcha1")
    public void captcha1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArithmeticCaptcha arithmeticCaptcha=new ArithmeticCaptcha();
        OutputStream out = response.getOutputStream();
        arithmeticCaptcha.out(out);
    }
}
