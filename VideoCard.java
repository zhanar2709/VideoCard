package chapter20;

public class VideoCard {

	public String name;
	public int weight;
	public int memory;
	public int price;
	
	public VideoCard(){
		
	}
	
	public VideoCard(String name, int weight, int memory, int price){
		this.name=name;
		this.weight=weight;
		this.memory=memory;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "VideoCard [name=" + name + ", weight=" + weight + ", memory=" + memory + ", price=" + price + "]";
	}
	
	
	
}
