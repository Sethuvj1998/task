package com.Onesofts.Devops.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/get")
public class Devops {
@GetMapping(value="/msg")
public String getmsg() {
	return "THE MESSAGE RECIVED";
}
}
