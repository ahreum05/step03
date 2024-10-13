package sample1;

public class MessageBeanImpl implements MessageBean{
	private String fruit;
	private int cost;
	
	public MessageBeanImpl() {
	}
	public MessageBeanImpl(String fruit){
		this.fruit = fruit;
	}
	
	@Override
	public void sayHello() {		
		System.out.println(fruit + ", " + cost);
	}

	@Override
	public void sayHello(String a, int b) {
		System.out.println(a + ", " + b);
	}
	
	// getter / setter
		public String getFruit() {
			return fruit;
		}
		public void setFruit(String fruit) {
			this.fruit = fruit;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
}
