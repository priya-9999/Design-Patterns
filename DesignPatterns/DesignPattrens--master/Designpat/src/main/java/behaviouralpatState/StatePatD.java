package behaviouralpatState;

public class StatePatD {
	public String get(){
	      Conte conte = new Conte();

	      StarState startState = new StarState();
	      String res=startState.doAction(conte);
	      String result= res+conte.getState().toString();
	      return result;
	   }
	   public String Stop() {
		   Conte conte = new Conte();
	      StopState stopState = new StopState();
	      String Res=stopState.doAction(conte);
	      String result=Res+conte.getState().toString();
	      return result;
	   }
}
