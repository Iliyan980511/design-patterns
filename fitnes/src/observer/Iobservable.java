package observer;

import observer.Iobserver;

public interface Iobservable {
	public void subscribe(Iobserver observer);
	public void unsubscribe(Iobserver observer);
	public void notifyobservers();
	public String getUpdate();

}
