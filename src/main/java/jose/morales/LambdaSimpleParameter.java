package jose.morales;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.log4j.Logger;

public class LambdaSimpleParameter implements RequestHandler<String, String> {

    private static final Logger log = Logger.getLogger(LambdaSimpleParameter.class);

    public String handleRequest(String uid, Context context){
        log.debug("Running LambdaSimpleParameter lambda function");
        return "Hello World " + uid;
    }
}

