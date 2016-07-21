package design.pattern.responsibilitychain;

public abstract class AbstractHanler {
	
	private AbstractHanler succesor;
	private int level;
	public AbstractHanler(AbstractHanler succesor,int level){
		this.succesor=succesor;
		this.level=level;
	}
	
	public void handleRequest(AbstractRequest request){
		if(request.getLevel()==level){
			handle(request);
		}else{
			if(succesor!=null){
				succesor.handleRequest(request);
			}else{
				System.out.println("none of us can hanle the problem");
			}
		}
	}
	
	public abstract void handle(AbstractRequest request);
	
	
	public static void main(String[] args) {
		ThirdHandler third=new ThirdHandler(null, 3);
		SecondHandler second=new SecondHandler(third, 2);
		FirstHandler first=new FirstHandler(second, 1);
		
		AbstractRequest request=new AbstractRequest("content", 4);
		
		first.handleRequest(request);
	}
}
