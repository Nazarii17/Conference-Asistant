package lms.itcluster.conference.assistant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class GreetingController {

    @GetMapping("/heyGuys")
    public String getHeyGuysPage() {
        return "heyGuys";
    }

    @GetMapping("/")
    public void getHeyGuysPage(HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Location", "https://rt.pornhub.com/");
        httpServletResponse.setStatus(302);
    }

}
