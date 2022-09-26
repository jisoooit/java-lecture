package ch15;

public interface Queue {
	void enQueue(String title);
	String dequeue();
	
	int getSize();
}
