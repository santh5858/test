import java.util.logging.Logger;
import java.util.logging.Level;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.catalyst.advanced.CatalystAdvancedIOHandler;

public class Sample implements CatalystAdvancedIOHandler {
	private static final Logger LOGGER = Logger.getLogger(Sample.class.getName());
	
	@Override
    public void runner(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			LOGGER.log(Level.INFO, "Hel!!!!!!okl!!!!!!o Arun Gokul");
			LOGGER.log(Level.INFO, "Todsdkljvnkjwndvkange");
			LOGGER.log(Level.INFO, "NEWNEWNEwkjnwejnkjjkwekNWENNWENNWNENWNENENWWENNWE");
						LOGGER.log(Level.INFO, "dsfsdf dslfknwkd fwej fjkwekf kwekfkjwekf wekjf");
			LOGGER.log(Level.INFO, "WORK ergergergNOWW!!!!");
			LOGGER.log(Level.INFO, "AHHHHHHHHH!!!!");
			response.setStatus(200);
		}
		catch(Exception e) {
			LOGGER.log(Level.SEVERE,"Exception in Sample",e);
			response.setStatus(500);
		}
        response.getWriter().write("Hello From Arun");
	}
	
}
