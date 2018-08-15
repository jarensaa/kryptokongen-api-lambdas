package kryptokongen;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class EasterEgg implements RequestHandler<Object,String> {
    public String handleRequest(Object o, Context context) {
        return "Easter egg";
    }
}
