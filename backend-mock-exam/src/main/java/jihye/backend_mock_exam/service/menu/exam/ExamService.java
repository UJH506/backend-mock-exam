package jihye.backend_mock_exam.service.menu.exam;

import jihye.backend_mock_exam.domain.exam.Subject;

import java.util.List;

public interface ExamService {

    // 주제 목록 조회
    List<Subject> findAllSubjects();
    
    // 주제 이름으로 주제 조회
    Subject findSubjectByName(String subjectName);
    
    // 주제별 난이도 목록 조회
    List<Integer> levelListOfSubject(Long subjectId);

    // 통합 문제 난이도 목록 조회
    List<Integer> allSubjectLevel();

    // 주제에 해당하는 문제 수 조회
    Long NumberOfSubject(String subjectName, int level);

    // 출제 문항 수 목록 연산
    List<Integer> createQuestionNumberList(String subjectName, int level);
}
