package com.example.switter;

import com.example.switter.domain.Message;
import com.example.switter.repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {


    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(@RequestParam(name = "text", required = false, defaultValue = "Default World") String text,
                       @RequestParam(name = "tag", required = false) String tag,
                       Map<String, Object> model) {


//        Iterable<Message> messages = messageRepo.findAll();
        model.put("name", text);
        return "main";
    }

    @PostMapping
    public String postMessage(@RequestParam(name = "text", required = false, defaultValue = "Default World") String text,
                              @RequestParam(name = "tag", required = false) String tag,
                              Map<String, Object> model) {
//        Message message = new Message(text, tag);
//        messageRepo.save(message);
//        Iterable<Message> messages = messageRepo.findAll();
        model.put("name", text);
        return "main";
    }
}
