package groupware.groupwareForApproval.controller.approval;

import groupware.groupwareForApproval.entity.Approval;
import groupware.groupwareForApproval.entity.Member;
import groupware.groupwareForApproval.repository.ApprovalRepository;
import groupware.groupwareForApproval.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class ApprovalController {

    @Autowired
    private ApprovalRepository approvalRepository;

    @GetMapping("/get/approval")
    public List<Approval> allApproval() {
        log.info("all approval = {}", approvalRepository.selectAll());
        return approvalRepository.selectAll();
    }
}
