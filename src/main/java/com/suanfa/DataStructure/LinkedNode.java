package com.suanfa.DataStructure;

import lombok.Data;

/**
 * @Author XuS1zhuo
 * @Description TODO
 * @Date 2023/1/14 21:24
 * @Version 1.0
 */
@Data
public class LinkedNode {
    //数据存放
    public Object data;
    //下一个元素
    public LinkedNode next;
    //上一个元素
    public LinkedNode prev;

    public LinkedNode(Object data) {
        this.data = data;
    }

}
