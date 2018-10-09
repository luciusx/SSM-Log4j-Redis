package top.lucius.companent;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created on 2018/9/21 0021.
 *
 * @author lucius
 */
@Aspect
public class ControllerAop {

    @Pointcut("execution(*top.lucius.controller*)")
    public void pointCut(){

    }

    @After("pointCut()")
    public void after(){

    }
}

