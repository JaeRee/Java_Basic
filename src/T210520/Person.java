package T210520;

public class Person {
	long id;
	
	Person(){}								// 기본 생성자
	
	Person(long id){
		this.id = id;
	}
	
	
	public boolean equals(Object obj) {
		
		if(obj != null && obj instanceof Person) {
			
			return id == ((Person)obj).id;
			
		}else {
			return false;
		}
		
	}
}