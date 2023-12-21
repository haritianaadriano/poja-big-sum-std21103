package poja.big.sum.endpoint.rest.controller.health;

import java.math.BigInteger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BigSumController {

  @GetMapping("/big-sum")
  public BigInteger sumBigInteger(@RequestParam(name = "a")BigInteger a, @RequestParam(name = "b")BigInteger b) {
    return a.add(b);
  }
}
