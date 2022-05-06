package groupware.groupwareForApproval.repository;

import groupware.groupwareForApproval.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentRepository {

    List<Department> selectAll();

}
