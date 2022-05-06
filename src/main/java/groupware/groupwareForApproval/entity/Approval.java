package groupware.groupwareForApproval.entity;

import lombok.Data;

@Data
public class Approval {
    // 결재번호
    private Integer apvNo;

    // 문서번호
    private Integer docNo;

    // 결재순서 0,1,2,3 ...
    private Integer apvOrder;

    // 결재종류 0 : 기안, 1: 결재, 2: 합의, 3: 참조
    private Integer apvType;

    // 결재의견
    private String apvComment;
}
