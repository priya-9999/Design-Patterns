package creationPatAbsFac;

public class FactoryProducer {
	public static AbsFact getFactory(boolean rounded){   
	      if(rounded){
	         return new RoundedShapeFactory();         
	      }else{
	         return new ShapeFact();
	      }
	   }

}
