package m.g

import spock.lang.*

// import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class WebGroovyCntlSpec extends Specification {

	def "Web Cntl Say Hello"() {
	when:
	
		WebGroovyCntl cntl = new WebGroovyCntl()
	then:

		cntl.home() == "Hello Groovy Boot!"

	}

}
