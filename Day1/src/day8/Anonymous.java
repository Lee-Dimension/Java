package day8;

public class Anonymous {
	Transactions field = new Transactions() {
		@Override
		public void deposit() {
			System.out.println("입금합니다.");
		}
		@Override
		public void withdrawal() {
			System.out.println("출금합니다.");
		}
	};
	
	void method1() {
		Transactions localVar = new Transactions() {
			@Override
			public void deposit() {
				System.out.println("입금합니다.");
			}
			@Override
			public void withdrawal() {
				System.out.println("출금합니다.");
			}
		};
		localVar.deposit();
	}
	void method2(Transactions rc) {
		rc.deposit();
	}

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.field.deposit();
		anony.method1();
		anony.method2(
			new Transactions() {
				@Override
				public void deposit() {
					System.out.println("저축계좌에 입금합니다.");
				}
				@Override
				public void withdrawal() {
					System.out.println("저축계좌에 출금합니다.");
				}
			});
	}
}