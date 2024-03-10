package com.lin.kabu_demo.entities;

import com.alibaba.fastjson2.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright(C),2022年-2022,霖霖
 *
 * @author 霖霖
 * @version 1.0
 * @date 2024/3/10 14:19
 * @Description 卡布西游网络协议消息定义
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageData {
    /**
     * 数据长度
     */
    private Integer len;
    /**
     * 通讯数据
     */
    private byte[] content;
    public MessageData(Object object){
        content = JSONObject.toJSONString(object).getBytes();
        len = content.length;
    }
}
