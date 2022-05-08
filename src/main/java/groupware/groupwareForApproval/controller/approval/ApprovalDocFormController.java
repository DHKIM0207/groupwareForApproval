package groupware.groupwareForApproval.controller.approval;

import groupware.groupwareForApproval.entity.ApprovalDoc;
import groupware.groupwareForApproval.repository.ApprovalDocRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@RestController
public class ApprovalDocFormController {

    @Autowired
    private ApprovalDocRepository approvalDocRepository;

    @GetMapping("/approvalDocForm")
    public ModelAndView goApprovalDocForm(HttpServletRequest request, ApprovalDoc approvalDocInfo) {
        //사용자 세션 정보 (지금 없으므로 하드코딩)
        Integer userSession = 1;

        ModelAndView mv = new ModelAndView();

        if (approvalDocInfo.getDocNo() == null) { //신규
            approvalDocInfo.setDocStatus(1); //대기중
            approvalDocInfo.setMemberNo(userSession); //세션 사용자(지금은 세션이 없으므로 하드코딩)
            mv.addObject("approvalDocInfo", approvalDocInfo);
            // TODO : 결재 리스트 (Approval List) 필요한지?
            //mv.addObject("approvalList", approvalList);
        } else { //수정
            /**
             * TODO: 1. get ApprovalDoc Info and return Model
             * TODO: 2. get Approval List and return Model
             * */
        }

        mv.setViewName("approval/approvalDocForm");
        return mv;
    }
}
