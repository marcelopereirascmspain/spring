package io.demo

import org.springframework.boot.*
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {
  val counter = AtomicLong()

  @RequestMapping("/greeting")
  fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
    return Greeting(counter.incrementAndGet(), "Hello, $name")
  }
}
