package cn.chuangye.service.impl;

import cn.chuangye.bean.Questioncate;
import cn.chuangye.dao.QuestioncateDao;
import cn.chuangye.service.QuestioncateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestioncateServiceImpl implements QuestioncateService {
    @Autowired
    private QuestioncateDao questioncateDao;
    @Override
    public Questioncate selectByKey(Integer qcId) {
        return questioncateDao.selectByKey(qcId);
    }

    @Override
    public List<Questioncate> selectAll() {
        return questioncateDao.selectAll();
    }

    @Override
    public int delete(Integer... qcIds) {
        return questioncateDao.delete(qcIds);
    }

    @Override
    public int insert(Questioncate questioncate) {
        return questioncateDao.insert(questioncate);
    }

    @Override
    public int update(Questioncate questioncate) {
        return questioncateDao.update(questioncate);
    }
}
