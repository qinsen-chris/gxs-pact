package com.gclfax.modules.pact.dao;

import com.gclfax.modules.pact.entity.PactDictRelationEntity;
import com.gclfax.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface PactDictRelationDao extends BaseDao<PactDictRelationEntity> {

    List<Map<String,Object>> queryPactDictRelationList(Map<String,Object> map);

    int isExist(@Param("pactDictId") Long pactDictId, @Param("pactTemplateId")Long pactTemplateId);
}