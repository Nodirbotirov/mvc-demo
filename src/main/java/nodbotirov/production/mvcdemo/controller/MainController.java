package nodbotirov.production.mvcdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/mvc/demo-application")
    public String IndexPage() {
        return "index";
    }

    @GetMapping("/mvc/say-hello")
    public String greetingsPage(
            @RequestParam String name,
            Model model
    ) {
        model.addAttribute("name", name);

        return "greetings";
    }
    @GetMapping("/mvc/quiz")
    public String quizPage() {
        return "quiz";
    }

    @PostMapping("/mvc/quiz")
    public String sumbitedQuizPage(
            @RequestParam String q1,
            @RequestParam String q2,
            @RequestParam String q3,
            @RequestParam String q4,
            @RequestParam String q5,
            Model model
    ) {
        int result = 0;
        if ("2".equals(q1)) result ++;
        if ("1".equals(q2)) result ++;
        if ("1".equals(q3)) result ++;
        if ("1".equals(q4)) result ++;
        if ("3".equals(q5)) result ++;

        model.addAttribute("result", result);

        return "quiz";
    }
}
