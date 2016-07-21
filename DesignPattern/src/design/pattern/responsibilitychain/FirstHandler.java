package design.pattern.responsibilitychain;

public class FirstHandler extends AbstractHanler {

	public FirstHandler(AbstractHanler succesor, int level) {
		super(succesor, level);
	}

	@Override
	public void handle(AbstractRequest request) {
		System.out.println("first handle"+request.getContent());
	}

}
