package com.sinosdx.maven.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @Author: yanshuailong
 * @Date: 2020/6/29 11:21
 */
@Component
@Lazy
public class LogCostInterceptor implements HandlerInterceptor {
    private static Logger logger = LoggerFactory.getLogger(LogCostInterceptor.class);

//    @Autowired
//    private AnalyseTimeLogMapper analyseTimeLogMapper;

//    @Autowired
//    private PublicUtil publicUtil;

    long start = System.currentTimeMillis();

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        start = System.currentTimeMillis();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        Long spend = System.currentTimeMillis() - start;
        logger.error("拦截器统计时长" + (spend));
        if ((spend<1300 ||spend > 250000) && !httpServletRequest.getRequestURI().contains("/barProductConfig/handleData") ) {
//            AnalyseTimeLogPo analyseTimeLogPo = new AnalyseTimeLogPo();
//            analyseTimeLogPo.setAnalyseTimeLogId(publicUtil.getColumnId(analyseTimeLogPo));
//            analyseTimeLogPo.setAddress(httpServletRequest.getRequestURI());
//            analyseTimeLogPo.setLogTime(new Date());
//            analyseTimeLogPo.setReqTime(spend.intValue());
//            analyseTimeLogPo.setType(0);
//            analyseTimeLogPo.setReqEnd(new Date());
//            analyseTimeLogMapper.insertSelective(analyseTimeLogPo);
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
