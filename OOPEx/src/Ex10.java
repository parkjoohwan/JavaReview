	class GolfClub{
		int num;
		String name;
		
		public GolfClub() {
			num = 7;
			name = "���̾�";
		}
		
		GolfClub(int a){
			this.num = a;
			name = "���̾�";
		}
		
		GolfClub(String t){
			this.name = t;
		}
		
		void print() {
			if(name == "���̾�")
				System.out.println(num + "�� " + name + "�Դϴ�.");
			else
				System.out.println(name + "�Դϴ�.");
		}
	}
	public class Ex10 {
	
		public static void main(String[] args) {
			GolfClub g1 = new GolfClub();
			g1.print();
			
			GolfClub g2 = new GolfClub(8);
			g2.print();
			
			GolfClub g3 = new GolfClub("����");
			g3.print();
	
		}
	
	}
