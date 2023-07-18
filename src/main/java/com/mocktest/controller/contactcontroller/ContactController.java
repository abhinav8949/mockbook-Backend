package com.mocktest.controller.contactcontroller;

import com.mocktest.model.contact.Contact;
import com.mocktest.service.EmailService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
@CrossOrigin("http://localhost:4200/")
public class ContactController {
    @Autowired
    private EmailService emailService;
    @Operation(summary = "Send Email to team")
    @PostMapping("/email")
    public ResponseEntity<?> recievingUserContactEmail(@RequestBody Contact contact){

        boolean status=this.emailService.recivedUserEmail(contact);

        if(status){
            System.out.println("Email sent to: "+contact);
            return new ResponseEntity<>("Email sent successfully", HttpStatus.OK);
        }else {
            System.out.println("Email not sent.");
            return new ResponseEntity<>("Email not sent", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

//    @PostMapping("/send")
//    public String sendEmailToUser(){
//        return "email sent to user";
//    }

}
