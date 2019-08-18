package day31_April20;

public class method7CallAnotherMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    /*
	     * step1: boil the water step2: add pasta to the water step3: add some olive oil
	     * step4: add salt step5: mix it and taste it step6: put it in a plate
	     * 
	     */
//	    System.out.println("step1: boil the water");
//	    System.out.println("step2: add pasta to the water");
//	    System.out.println("step3: add some olive oil");
//	    System.out.println("step4: add salt ");
//	    System.out.println("step5: mix it and taste it ");
//	    System.out.println("step6: put it in a plate ");
//	    prepare();
//	    addIngridient();
//	    tasteAndBringtoTheTable();

	    AskSpouseToPrepareMeal();

	  }

	  public static void AskSpouseToPrepareMeal() {

	    prepare();
	    addIngridient();
	    tasteAndBringtoTheTable();
	    
	  }

	  public static void prepare() {
	    System.out.println("step1: boil the water");
	    System.out.println("step2: add pasta to the water");
	  }

	  public static void addIngridient() {
	    System.out.println("step3: add some olive oil");
	    System.out.println("step4: add salt ");
	  }

	  public static void tasteAndBringtoTheTable() {
	    System.out.println("step5: mix it and taste it ");
	    System.out.println("step6: put it in a plate ");
	  }

	}
