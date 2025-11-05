package mypack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditController {
  @GetMapping("/audit/ping")
  public String ping() {
    return "audit-ok";
  }
}
