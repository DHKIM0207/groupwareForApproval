package groupware.groupwareForApproval.repository;

import groupware.groupwareForApproval.entity.Approval;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApprovalRepository {

    List<Approval> selectAll();

}
