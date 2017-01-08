package m.g

import org.junit.Test
import static org.junit.Assert.*
// import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
// import org.springframework.test.context.junit4.SpringRunner

// @RunWith(SpringRunner)
@SpringBootTest
class WebGroovyCntlTest {

	@Test
	void homeSaysHelloWorld() {
		assertSame("Says Hello Groovy Boot!", new WebGroovyCntl().home(), "Hello Groovy Boot!")

	}

}
