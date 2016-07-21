package design.pattern.responsibilitychain;

public class AbstractRequest {

	private Object content;
	private int level;
	public AbstractRequest(Object content,int level){
		this.content=content;
		this.level=level;
	}
	public Object getContent() {
		return content;
	}
	public int getLevel() {
		return level;
	}
}