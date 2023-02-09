package com.dongdong.pojo;

import java.io.Serializable;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Category implements Serializable {
    /**
     * 主题id
     */
    private Integer categoryid;

    /**
     * 父id
     */
    private Integer pid;

    /**
     * 主题名字
     */
    private String categoryname;

    private static final long serialVersionUID = 1L;
}

