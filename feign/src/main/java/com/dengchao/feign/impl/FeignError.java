package com.dengchao.feign.impl;

import com.dengchao.entity.Student;
import com.dengchao.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author : dengchao
 * @description :
 * @create : 2020/7/12
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中...";
    }
}
