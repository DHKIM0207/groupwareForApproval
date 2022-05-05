package groupware.groupwareForApproval.controller;

import groupware.groupwareForApproval.entity.Member;
import groupware.groupwareForApproval.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/member")
    public String hello() {
        return "hello";
    }

    @GetMapping("/get/member")
    public List<Member> allMember() {
        log.info("allmember = {}", memberRepository.allMember());
        return memberRepository.allMember();
    }
}
