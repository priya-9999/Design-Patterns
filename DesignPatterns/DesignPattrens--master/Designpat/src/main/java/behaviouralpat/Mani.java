package behaviouralpat;

public class Mani {
private InterpreterEngine engine;
    
    public Mani(InterpreterEngine engine) {
        this.engine = engine;
        //System.out.println("***"+engine);
    }
    
    public int interpret(String input) {
        Expression expression = null;
        
        if(input.contains("add")) {
            expression = new Addexten(input);
        } else if(input.contains("multiply")) {
            expression = new MultiplyExpression(input);
        }
        
        
        int result = expression.interpret(engine);
        System.out.println(input);
        //System.out.println("    "+engine);
        return result;
    }
    
    public static void main(String[] args) {
        Mani main = new Mani(new InterpreterEngine());
        
        System.out.println("Result: " + main .interpret("add 28 and 39"));
        System.out.println("Result: " + main .interpret("multiply " + main .interpret("add 10 and 10"
        		+ "") + " and 10"));
    }

}
