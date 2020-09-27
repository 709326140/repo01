package cn.chuangye.controller;

import cn.chuangye.bean.Questioncate;
import cn.chuangye.service.QuestioncateService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/question")
public class QuestioncateController {
    @Autowired
    private QuestioncateService questioncateService;

    @RequestMapping("/questioncate")
    public String getQuestioncate(Model model){

        List<Questioncate> questioncates = questioncateService.selectAll();
        model.addAttribute(questioncates);
        return "question";
    }

}
