package jihye.backend_mock_exam.repository.menu.exam;

import jihye.backend_mock_exam.domain.exam.Answer;
import jihye.backend_mock_exam.domain.exam.Question;
import jihye.backend_mock_exam.domain.exam.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ExamMapper {

    // 주제 전체 조회
    List<Subject> findAllSubjects();

    // 주제 이름으로 주제 조회
    Subject findSubjectByName(String subjectName);

    // 주제 아이디로 주제 조회
    Subject findSubjectById(Long subjectId);

    // 주제별 난이도 목록 조회
    List<Integer> findLevelsBySubject(Long subjectId);

    // 전체 난이도 중 최소, 최대 난이도 조회
    List<Integer> findMinMaxLevel();

    // 주제에 해당하는 문제 수 조회
    Long findNumberOfSubject(@Param("subjectId") Long subjectId, @Param("level") int level);

    // 관리자가 설정한 출제 문항 분류 단위 조회
    Integer findQuestionUnitSetting();

    // 주제,난이도,문항수에 해당하는 문제 목록 조회
    List<Question> findShuffledQuestions(@Param("subjectId") Long subjectId, @Param("level") int level, @Param("number") int number);

    // 문제의 보기 목록 조회 (순서 랜덤)
    public List<Answer> findShuffledAnswers(Long questionId);

    // 문제의 정답 조회
    Long findCorrectAnswerByQuestion(Long questionId);
}