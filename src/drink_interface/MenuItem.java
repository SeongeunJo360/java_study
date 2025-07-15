package drink_interface;

public class MenuItem implements Menu{
	//Field
		String name;
		int price;
		int no;
		//Constructor
		public MenuItem() {}
		public MenuItem(int no, String name, int price) {
			this.no = no;
			this.name = name;
			this.price = price;
		}
		
		//Method
		@Override
		public String getName() {
			return name;
		}
		@Override
		public int getPrice() {
			return price;
		}
		@Override
		public int getNo() {
			return no;
		}

}
