package groupware.groupwareForApproval.repository;

import groupware.groupwareForApproval.entity.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberRepository {

    List<Member> allMember();

}
