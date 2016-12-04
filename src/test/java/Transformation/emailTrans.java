package Transformation;
import cucumber.api.Transformer;

public class emailTrans extends Transformer<String> {

@Override

public String transform(String emailDomain) {

return emailDomain.concat("@ea.com");

}

}
