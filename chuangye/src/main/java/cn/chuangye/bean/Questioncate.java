package cn.chuangye.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * questioncate
 * @author 唐复星
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Questioncate implements Serializable {
    /**
     * 问题类别编号
     */
    private Integer qcId;

    /**
     * 问题类别名称
     */
    private String qcName;

    private static final long serialVersionUID = 1L;
}