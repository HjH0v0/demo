package com.example.dao;


import com.example.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    /**
     * 模糊查询
     * @param name
     * @return
     */
    @Query(value = "select  * from user where name like %?1%",nativeQuery = true)//like后忘打空格
    Page<User> findNameLike(String name, PageRequest pageRequest);
}
