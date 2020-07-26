package creationPatAbsFac;

public class Dem {
	public String main(boolean b,String s) {
	      AbsFact shapeFact = FactoryProducer.getFactory(b);
	      if(s=="Rectangle") {
	    	  Shape shape1 = shapeFact.getShape(s);
		      return shape1.draw();
	      }
	      else {
	      Shape shape2 = shapeFact.getShape(s);
	      return shape2.draw();
	      }
	   }

}
