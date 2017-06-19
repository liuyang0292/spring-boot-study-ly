package com.ly.firstboot.demo.dao;

import com.ly.firstboot.demo.entity.Keyword;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.List;

/**
 * Created by lyy on 2017-06-19.
 * 这里面是创建一个KeywordDao接口，并不需要创建UserRepository实现，springboot默认会帮你实现，继承自CrudRepository
 */

@Repository
@Table(name="tbl_keyword")
@Qualifier("KeywordDao")
public interface KeywordDao extends CrudRepository<Keyword,Integer>{

    public Keyword findOne(Integer id);

    public Keyword save(Keyword keyword);

    /**
     @ Param 代表的是sql语句中的占位符，例如这里的@Param(“name”)代表的是:name占位符。
     */
    @Query("select t from Keyword t where t.status=:status")
    public List<Keyword> findKeywordByStatus(@Param("status") Integer status);
}
