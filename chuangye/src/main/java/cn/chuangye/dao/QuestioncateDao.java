package cn.chuangye.dao;

import cn.chuangye.bean.Questioncate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestioncateDao {
    /**
     * 根据问题类别ID查询类别
     * @param qcId 问题类别ID
     * @return 问题类别
     */
    Questioncate selectByKey(Integer qcId);

    /**
     * 查询所有问题类别
     * @return 问题类别
     */
    List<Questioncate> selectAll();

    /**
     * 根据类别ID删除类别
     * @param qcIds
     * @return
     */
    int delete(@Param("qcIds") Integer...qcIds);

    /**
     * 增加类别
     * @param questioncate
     * @return
     */
    int insert(Questioncate questioncate);

    /**
     * 修改类别
     * @param questioncate
     * @return
     */
    int update(Questioncate questioncate);
}