package day54_june1;

public class Engine {
	
	/*
	 * final instance fileds : engineType as String cilinderCount as int
	 * 
	 * 2 arg constructors to set the fields value
	 * 
	 * instance method : start() accept no param and return nothing print engine
	 * <type> with cilinderCount <count> is starting toString method
	 */
	
	final String engineType;
	final int cylinderCount;

	public Engine(String engineType, int cylinderCount) {
		this.engineType = engineType;
		this.cylinderCount = cylinderCount;
	}

	public void start() {
		System.out.println("engine: < " + engineType 
					+ " >, cylinder type:  " + cylinderCount
					+ " >");
	}

	@Override
	public String toString() {
		return "Engine [engineType=" 
	+ engineType + ", cylinderCount=" 
				+ cylinderCount + "]";
	}

	
	
}