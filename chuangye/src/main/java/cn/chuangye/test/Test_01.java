package cn.chuangye.test;

import cn.chuangye.bean.Questioncate;
import cn.chuangye.service.QuestioncateService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_01 {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        QuestioncateService bean = applicationContext.getBean(QuestioncateService.class);
        //bean.update(new Questioncate().setQcId(2).setQcName("市场经济"));
        //System.out.println(bean.selectByKey(1));
        //bean.insert(new Questioncate().setQcName("创业"));
        //bean.delete(3,4,5,6,7);
        bean.selectAll().forEach(System.out::println);
    }
}
