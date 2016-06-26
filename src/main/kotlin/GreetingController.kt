package io.demo

import org.springframework.boot.*
import org.springframework.web.bind.annotation.*
import org.springframework.ui.*
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {
  val counter = AtomicLong()

  @RequestMapping("/greeting")
  fun greeting(
      @RequestParam(value = "name", defaultValue = "World") name: String,
      model: Model): String {

    model.addAttribute("name", "john")

    return "listing_template"
  }
}
