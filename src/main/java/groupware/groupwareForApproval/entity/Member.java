package groupware.groupwareForApproval.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Member {
    //회원 번호
    private Integer memberNo;

    // 회원아이디
    private String memberId;

    // 회원명
    private String memberName;

    // 부서아이디
    private Integer deptId;

    // 이메일
    private String email;

    // 휴대폰번호
    private String phoneNumber;

    // 회원가입일
    private LocalDate signDate;
}
