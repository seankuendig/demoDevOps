package ch.nyp.demoDevOps.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("Halloo", HttpStatus.OK);
    }
}
