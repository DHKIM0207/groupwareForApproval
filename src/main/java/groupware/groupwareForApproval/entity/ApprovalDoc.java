package groupware.groupwareForApproval.entity;

import lombok.Data;

@Data
public class ApprovalDoc {
    // 문서번호
    private Integer docNo;

    // 제목
    private String docTitle;

    // 문서내용
    private String docContent;

    // 문서상태(결재상태) 0:미결, 1:진행, 2:반려, 3:완료 TODO : 추후 변경될 수 있음 ...(Approval로 옮길 가능성도 있다.)
    private Integer docStatus;

    // 회원번호
    private Integer memberNo;
}
