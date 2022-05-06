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

    /**
     * 문서상태(결재상태) 0:임시저장, 1:대기중, 2:심사중, 3:반려, 4:완료
     * 대기중 : 기안자가 상신한 상태 [첫번째 결재자(기안자 아님)가 결재를 해야되는 상태 , 첫번째 결재자 입장에서는 미결상태]
     * 심사중 : 첫번째 결재자가 결재를 했고 다음 결재자가 아직 결재를 하지 않은 상태 (즉, 첫번째 결재자가 결재를 하면 결재상태는 심사중으로 변경된다.)
     */
    private Integer docStatus;

    /***
     * 회원번호 (작성자)
     * 작성자 : 문서를 기안한 사람
     */
    private Integer memberNo;
}
