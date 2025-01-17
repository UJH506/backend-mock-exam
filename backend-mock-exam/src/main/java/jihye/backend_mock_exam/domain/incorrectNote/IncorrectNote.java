package jihye.backend_mock_exam.domain.incorrectNote;

import lombok.Data;

import java.util.Date;

@Data
public class IncorrectNote {

    private Long incorrectNoteId;
    private Long userId;
    private Long questionId;
    private Long subjectId;
    private int level;
    private String questionText;
    private Date createdAt;
}
