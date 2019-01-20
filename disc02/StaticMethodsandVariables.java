public static void main(String[] args) {

	Cat a = new Cat("Cream", "Meow!");
	Cat b = new Cat("Tubbs", "Nyan!");
	a.play(); // Nyan + " I'm " + Cream + " the cat!"
	b.play(); // Nyan + " I'm " + Tubbs + " the cat!"
	Cat.anger();
	a.calm();
	a.play(); // nyan + " I'm " + Cream + " the cat!"
	b.play(); // nyan + " I'm " + Tubbs + " the cat!"
}