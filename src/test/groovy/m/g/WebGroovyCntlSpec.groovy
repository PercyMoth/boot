package m.g

import org.springframework.boot.test.context.SpringBootTest

@RunWith(SpringRunner.class)
@SpringBootTest
class WebGroovyCntlSpec extends spock.lang.Specification {

	@Test
	void homeSaysHelloWorld() {
		assertSame("Says Hello Groovy Boot!", new WebGroovyCntl().home(), "Hello Groovy Boot!")

	}

}
