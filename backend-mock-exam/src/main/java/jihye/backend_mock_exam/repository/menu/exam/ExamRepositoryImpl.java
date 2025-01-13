package jihye.backend_mock_exam.repository.menu.exam;

import jihye.backend_mock_exam.domain.exam.Answer;
import jihye.backend_mock_exam.domain.exam.Question;
import jihye.backend_mock_exam.domain.exam.Subject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ExamRepositoryImpl implements ExamRepository {

    private final ExamMapper examMapper;

    // 주제 전체 조회
    @Override
    public List<Subject> findAllSubjects() {
        return examMapper.findAllSubjects();
    }

    // 주제 이름으로 주제 조회
    @Override
    public Subject findSubjectByName(String subjectName) {
        return examMapper.findSubjectByName(subjectName);
    }

    // 주제 아이디로 주제 조회
    @Override
    public Subject findSubjectById(Long subjectId) {
        return examMapper.findSubjectById(subjectId);
    }

    // 주제별 난이도 목록 조회
    @Override
    public List<Integer> findLevelsBySubject(Long subjectId) {
        return examMapper.findLevelsBySubject(subjectId);
    }

    // 전체 난이도 중 최소, 최대 난이도 조회
    @Override
    public List<Integer> findMinMaxLevel() {
        return examMapper.findMinMaxLevel();
    }

    // 주제에 해당하는 문제 수 조회
    @Override
    public Long findNumberOfSubject(Long subjectId, int level) {
        return examMapper.findNumberOfSubject(subjectId, level);
    }

    // 관리자가 설정한 출제 문항 분류 단위 조회
    @Override
    public Integer findQuestionUnitSetting() {
        return examMapper.findQuestionUnitSetting();
    }

    // 주제,난이도,문항수에 해당하는 문제 목록 조회
    @Override
    public List<Question> findShuffledQuestions(Long subjectId, int level, int number) {
        return examMapper.findShuffledQuestions(subjectId, level, number);
    }

    // 문제의 보기 목록 조회 (순서 랜덤)
    @Override
    public List<Answer> findShuffledAnswers(Long questionId) {
        return examMapper.findShuffledAnswers(questionId);
    }

    // 문제의 정답 조회
    @Override
    public Long findCorrectAnswerByQuestion(Long questionId) {
        return examMapper.findCorrectAnswerByQuestion(questionId);
    }
}