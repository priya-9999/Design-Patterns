package behaviouralpatState;

public class Conte {
	private State state;

	   public Conte(){
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }

}
