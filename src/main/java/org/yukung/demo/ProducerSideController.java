package org.yukung.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yukung
 */
@RestController
public class ProducerSideController {

    @PostMapping(path = "/check",
            consumes = "application/json",
            produces = "application/json")
    public Response check(@RequestBody Person person) {
        return null;
    }
}

class Person {
    public int age;
}

@AllArgsConstructor
@Getter
class Response {
    BeerCheckStatus status;
}

enum BeerCheckStatus {
    OK, NOT_OK
}


/*




    @PostMapping(path = "/check",
            consumes = "application/json",
            produces = "application/json")
    public Response check(@RequestBody Person person) {
        if (person.age >= 20) {
            return new Response(BeerCheckStatus.OK);
        }
        return new Response(BeerCheckStatus.NOT_OK);
    }


 */
