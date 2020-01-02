package com.example.wstest.dao;

import com.example.wstest.dao.basedao.BaseRepository;
import com.example.wstest.model.Users;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UsersRepository extends BaseRepository<Users,Integer>, JpaSpecificationExecutor<Users> {


    public Users findByPhone(String phone);
}
