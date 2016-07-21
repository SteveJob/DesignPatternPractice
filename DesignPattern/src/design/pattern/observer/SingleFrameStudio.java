package design.pattern.observer;

public class SingleFrameStudio extends Observer {

	@Override
	public void publish(Observable observable) {
		// TODO Auto-generated method stub
		System.out.println("一帧工作室接受到更新，更新内容为：");
		System.out.println(observable.getContent());
	}

}
