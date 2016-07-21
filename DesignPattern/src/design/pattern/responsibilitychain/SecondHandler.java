package design.pattern.responsibilitychain;

public class SecondHandler extends AbstractHanler {

	public SecondHandler(AbstractHanler succesor, int level) {
		super(succesor, level);
	}

	@Override
	public void handle(AbstractRequest request) {
		System.out.println("second handle"+request.getContent());
	}

}
