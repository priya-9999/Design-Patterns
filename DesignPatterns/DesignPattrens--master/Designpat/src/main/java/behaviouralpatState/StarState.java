package behaviouralpatState;

public class StarState implements State{
	public String doAction(Conte conte) {
	      String s="Player is in start state";
	      conte.setState(this);	
	      return s;
	   }

	   public String toString(){
	      return "Start State";
	      }
}
