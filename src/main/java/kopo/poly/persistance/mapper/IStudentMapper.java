package kopo.poly.persistance.mapper;

import kopo.poly.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStudentMapper {


//     * 학생 등록 쿼리
//     * <p>
//     *
//     *함수명 : insertStudent -> Mapper XML 파일의 ID와 동일하며, 여러 개 작성 가능한 SQL 쿼리를 구분하기 위한 값
//     * parameter : StudentDTO pDTO -> SQL 실행에 필요한 파라미터가 존재하는 객체로 Mapper XML 파일의 parameterType과 동일
//     * 리턴타임 : void -> insert 함수 실행한 뒤, 조회된 결과가 없음을 의미
//     *
//     * @param pDTO 등록할 학생 정보
    void insertStudent(StudentDTO pDTO) throws Exception;
    void insertStudentList(List<StudentDTO> pList) throws Exception;
    void updateStudent(StudentDTO pDTO) throws Exception;
    void deleteStudent(StudentDTO pDTO) throws Exception; // 학생 삭제 쿼리

    // 학생 전체 조회 쿼리
    //<p>
    //함수명 : getStudentList -> Mapper XML 파일의 ID와 동일하며, 여러 개 작성 가능한 SQL 쿼리를 구분하기 위한 값
    //parameter : 없음
    //리턴타입 : List<StudentDTO> -> select 실행 결과가 2줄 이상(레코드 2개 이상)이면, 무조건 list 구조로 결과 받음

    //@return 학생 전체 조회 결과

    List<StudentDTO> getStudentList() throws Exception;

    //학생이 존재하는지 체크하기 위해 학생 아이디를 기준으로 1명 조회하기 쿼리

    StudentDTO getStudent(StudentDTO pDTO) throws Exception;

}
