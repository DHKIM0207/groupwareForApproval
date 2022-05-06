package groupware.groupwareForApproval.controller;

import groupware.groupwareForApproval.entity.Approval;
import groupware.groupwareForApproval.entity.ApprovalDoc;
import groupware.groupwareForApproval.repository.ApprovalDocRepository;
import groupware.groupwareForApproval.repository.ApprovalRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class ApprovalDocController {

    @Autowired
    private ApprovalDocRepository approvalDocRepository;

    @GetMapping("/get/approvalDoc")
    public List<ApprovalDoc> allApprovalDoc() {
        log.info("all approvalDoc = {}", approvalDocRepository.selectAll());
        return approvalDocRepository.selectAll();
    }
}
