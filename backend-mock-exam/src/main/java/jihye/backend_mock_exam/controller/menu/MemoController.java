package jihye.backend_mock_exam.controller.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/memo")
public class MemoController {

    @GetMapping
    public String memo() {
        return "menu/memo/memo-list";
    }
}
