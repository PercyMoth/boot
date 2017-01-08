package m.g

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController // shorthand for Controller and ResponseBody
public class WebGroovyCntl {

	@RequestMapping("/")
	public String home() {
		return	"Hello Groovy Boot!"
	}
}
