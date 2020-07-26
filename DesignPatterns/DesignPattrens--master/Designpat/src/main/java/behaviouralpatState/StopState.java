package behaviouralpatState;

public class StopState implements State {
	public String doAction(Conte conte){
	      String v="Player is in stop state";
	      conte.setState(this);
	      return v;
	   }

	   public String toString(){
	      return "Stop State";
	   }

}
