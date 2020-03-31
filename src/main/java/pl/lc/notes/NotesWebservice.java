package pl.lc.notes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NotesWebservice {
	
	@RequestMapping("/hello-world/{message}")
	public String test(@PathVariable String message) {
		return "Hello from test server! Message: " + message;
	}
}