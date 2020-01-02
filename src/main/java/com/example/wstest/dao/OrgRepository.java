package com.example.wstest.dao;

import com.example.wstest.dao.basedao.BaseRepository;
import com.example.wstest.model.Org;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrgRepository extends BaseRepository<Org,Integer>, JpaSpecificationExecutor<Org> {
}
