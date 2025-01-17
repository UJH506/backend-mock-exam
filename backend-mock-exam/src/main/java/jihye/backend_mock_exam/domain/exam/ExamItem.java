package jihye.backend_mock_exam.domain.exam;

import lombok.Data;

import java.util.List;

@Data
public class ExamItem {

    private Question question;
    private List<Answer> answers;
    private Answer correctAnswer;

    public ExamItem() {
    }

    public ExamItem(Question question, List<Answer> answers) {
        this.question = question;
        this.answers = answers;
    }
}
