package LAB_6;
public class Visitor implements EnglishGreeter, ShonaGreeter {

    // required: without this override the class does not compile
    @Override
    public void hello() {
        EnglishGreeter.super.hello();
        ShonaGreeter.super.hello();
    }
}
