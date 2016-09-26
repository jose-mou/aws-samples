package jose.morales;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.log4j.Logger;

import java.util.UUID;

public class LambdaComplexParameter implements RequestHandler<LambdaComplexParameter.ComplexParameter, LambdaComplexParameter.ComplexResult> {

    private static final Logger log = Logger.getLogger(LambdaSimpleParameter.class);

    public ComplexResult handleRequest(ComplexParameter parameter, Context context) {
        log.debug("Running LambdaComplexParameter lambda function");
        log.debug("Processed INPUT " + parameter);
        ComplexResult returnedObject = new ComplexResult(parameter);
        log.debug("Returned OUTPUT " + returnedObject);
        return returnedObject;
    }

    public static class ComplexParameter {

        private String name;
        private String description;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "[name : " + name + ", description : " + description + "]";
        }
    }

    public static class ComplexResult {

        private String id;
        private String name;
        private String description;

        public  ComplexResult(){}

        public  ComplexResult(ComplexParameter cp){
            this.name = cp.getName();
            this.description = cp.getDescription();
            this.id = UUID.randomUUID().toString();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "[id : " + id + ", name : " + name + ", description : " + description + "]";
        }
    }
}

