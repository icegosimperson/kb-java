package ex.ch11.ex09;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // 기본 생성자도 만들어주는 코드
@AllArgsConstructor // 필드가 전부 포함된 생성자를 생성
public class Member {
    private String id;
    private String name;
    private int age;

}
