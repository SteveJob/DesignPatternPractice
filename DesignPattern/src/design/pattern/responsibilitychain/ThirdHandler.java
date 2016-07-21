package design.pattern.responsibilitychain;

public class ThirdHandler extends AbstractHanler {

	public ThirdHandler(AbstractHanler succesor, int level) {
		super(succesor, level);
	}

	@Override
	public void handle(AbstractRequest request) {
		System.out.println("third handle"+request.getContent());
	}

}
