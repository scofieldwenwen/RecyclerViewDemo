package com.tronsis.recyclerviewdemo.data;

import com.tronsis.recyclerviewdemo.bean.BookBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author scofield@tronsis.com
 * @date 2016/7/10 9:50
 */
public class MoocDataList {

    public static List<BookBean> getBooksData(int size) {
        List<BookBean> beanList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            beanList.add(new BookBean("book item <" + i + ">", 500, 65.3f, System.currentTimeMillis(),"This book is good for you to read."));
        }
        return beanList;
    }

}
