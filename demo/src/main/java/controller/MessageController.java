package controller;

import model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class MessageController {
    //@ResponseBody
    @GetMapping("/message")
    Message send(){
        return new Message("first message");
    }

   @PostMapping("/message")
   Message echo(@RequestBody Message message){
        return message;
   }
}


