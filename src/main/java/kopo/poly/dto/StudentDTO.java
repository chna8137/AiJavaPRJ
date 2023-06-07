package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentDTO {

    private String userId; // 회원 아이디
    private String userName; // 회원 이름
    private String email; // 이메일
    private String addr; // 주소
}
