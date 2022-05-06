package groupware.groupwareForApproval.controller;

import groupware.groupwareForApproval.entity.Department;
import groupware.groupwareForApproval.entity.Member;
import groupware.groupwareForApproval.repository.DepartmentRepository;
import groupware.groupwareForApproval.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/get/department")
    public List<Department> allDepartment() {
        log.info("allDepartment = {}", departmentRepository.selectAll());
        return departmentRepository.selectAll();
    }
}
