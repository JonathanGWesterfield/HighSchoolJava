public class Zoo
{
	private Animal[] animals = new Animal[10];
	private int count = 0;
	
	public static void main (String[] args) {
    	Zoo z = new Zoo();
    	z.output();	
    }
    
    public Zoo() {
     	animals[count++] = new Animal("Cat");
		animals[count++] = new Animal("Bat");
		animals[count++] = new Cat("Fluffy");
		animals[count++] = new Lion();
    }
    
	public void output() {
		System.out.println("--- At the Zoo ---\n");
		for (int i = 0; i < count; i++)
		{
			animals[i].speak();
			if (animals[i] instanceof Lion)
			{
				Lion bigCat = (Lion) animals[i];
					bigCat.goHunting();
			}
			System.out.println();
		}
	}
}