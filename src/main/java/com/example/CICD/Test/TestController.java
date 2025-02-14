package com.example.CICD.Test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

  @GetMapping("/test")
  public String getTest() {
    return "Value";
  }

  @GetMapping("/test2")
  public String getTest2() {
    return "ValueValueValueValueValueValueValueVal"
        + "ueValueValueValueValueValueValueValueVa"
        + "lueValueValueValueValueValueValueValueV"
        + "ValueValueValueValueValueValueValue";
  }

}
