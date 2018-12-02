package kryptokongen;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class kryptokongen implements RequestHandler<Object, String> {
  public String handleRequest(Object o, Context context) {
    double randomNumber = Math.random();

    if (randomNumber > 0.8) {
      return "Jens";
    }

    return "Been";
  }
}
