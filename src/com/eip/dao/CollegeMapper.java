package com.eip.dao;

import com.eip.pojo.College;
import com.eip.pojo.Highschool;

import java.util.List;

public interface CollegeMapper {
    /*
     * 1.获取所有组织机构信息
     * 2.根据组织机构id查询其具体信息
     * 3.根据组织机构对象（利用其中id的属性）更新组织机构信息
     * 4.根据组织机构对象增加一条组织机构信息
     * 5.根据组织机构id对该组织机构信息进行删除
     * */

    List<College> selectColleges();

    College selectCollegeById(Integer id);

    Integer updateCollegeByObj(College college);

    Integer insertCollegeByObj(College college);

    Boolean deleteCollegeById(Integer id);

    List<College> selectCollegesByName(String name);
}
