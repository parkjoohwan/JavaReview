	class GolfClub{
		int num;
		String name;
		
		public GolfClub() {
			num = 7;
			name = "아이언";
		}
		
		GolfClub(int a){
			this.num = a;
			name = "아이언";
		}
		
		GolfClub(String t){
			this.name = t;
		}
		
		void print() {
			if(name == "아이언")
				System.out.println(num + "번 " + name + "입니다.");
			else
				System.out.println(name + "입니다.");
		}
	}
	public class Ex10 {
	
		public static void main(String[] args) {
			GolfClub g1 = new GolfClub();
			g1.print();
			
			GolfClub g2 = new GolfClub(8);
			g2.print();
			
			GolfClub g3 = new GolfClub("퍼터");
			g3.print();
	
		}
	
	}
