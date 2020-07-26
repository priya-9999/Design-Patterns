package behaviouralpat;

public class Addexten implements Expression {
private String expression;
    
    public Addexten(String expression) {
        this.expression = expression;
    }
    public int interpret(InterpreterEngine engine) {
        return engine.add(expression);
    }

}
