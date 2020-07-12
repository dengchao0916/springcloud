package com.dengchao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : dengchao
 * @description :
 * @create : 2020/7/12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private long id;

    private String name;

    private int age;
}
