package groupware.groupwareForApproval.service;

import groupware.groupwareForApproval.repository.ApprovalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApprovalService {

    @Autowired
    private ApprovalRepository approvalRepository;

}
