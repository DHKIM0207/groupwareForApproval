package groupware.groupwareForApproval.repository;

import groupware.groupwareForApproval.entity.ApprovalDoc;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApprovalDocRepository {

    List<ApprovalDoc> selectAll();

}
