package com.queue.circularqueue;

public class Main {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		Flowers rose = new Flowers("shrub", "Sweet", "rose");
		Flowers orchid = new Flowers("plantation", "no smell", "orchid");
		Flowers sunflower = new Flowers("plant", "Sour", "SunFlower");
		Flowers marigold = new Flowers("shrub", "Sweet", "Marigold");
		Flowers tulip = new Flowers("small plant", "Sweet", "Tulip");

		CircleQueue queue = new CircleQueue(5);
		FlowerCircleQueue flowerQueue = new FlowerCircleQueue(3);
		
		queue.add(janeJones);
		flowerQueue.add(sunflower);
		queue.add(johnDoe);
		queue.remove();
		flowerQueue.add(marigold);
		queue.add(marySmith);
		flowerQueue.remove();
		queue.remove();
		flowerQueue.add(tulip);
		flowerQueue.add(orchid);
		queue.add(mikeWilson);
		queue.remove();
		flowerQueue.remove();
		queue.add(billEnd);
		flowerQueue.add(rose);
		queue.remove();
		queue.add(janeJones);
		flowerQueue.printQueue();
		queue.printQueue();
	}
}
