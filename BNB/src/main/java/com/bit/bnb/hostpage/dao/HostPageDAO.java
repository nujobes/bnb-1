package com.bit.bnb.hostpage.dao;

import com.bit.bnb.hostpage.model.EvaluationVO;
import com.bit.bnb.hostpage.model.MyRoomVO;
import com.bit.bnb.hostpage.model.ReservationRoomUserVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HostPageDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    private static String namespace="mappers.hostpage.";

    public List<MyRoomVO> ckMyRooms(String userId){
       return sqlSessionTemplate.selectList(namespace+"ckMyRooms",userId);
    }

    public List<ReservationRoomUserVO> getRoomMember(int roomsId){
        return sqlSessionTemplate.selectList(namespace+"getRoomMember",roomsId);
    }

    public List<EvaluationVO> getNotEvaluation(String hostId){
        return sqlSessionTemplate.selectList(namespace+"getNotEvaluation",hostId);
    }

    public List<EvaluationVO> getEvaluation(String hostId){
        return sqlSessionTemplate.selectList(namespace+"getEvaluation",hostId);
    }


}
