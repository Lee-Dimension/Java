package day8;

import java.util.Scanner;

abstract class Memory{
	protected int [] arr = new int[5];
	protected int head = 0, tail = 0;
	//푸시 구현
	public void push(int i) {
		if(head == tail) {
			head = 0;
			tail = 0;
		}
		if(head == 5) {
			System.out.print("더 이상 공간이 없습니다.");
			return;
		}
		arr[head] = i;
		head = head + 1;
	}
	abstract public int pop();
}

class MyStack extends Memory{
	//팝 구현
	@Override
	public int pop() {
		if (head!=0&&head == tail) {
			System.out.print("아무것도 없습니다.");
			return -1;
		}
		head--;
		int out = arr[head];
	    return out;
	}
}

class MyQueue extends Memory{
	//팝 구현
	@Override
	public int pop() {
		if (head!=0&&head == tail) {
			System.out.print("아무것도 없습니다.");
			return -1;
		}
	    int out = arr[tail];
	    tail++;
	    return out;
	}
}
public class StackQueue2 {
	Scanner sc = new Scanner(System.in);
	//스택 실행하는 메소드
	public void run(Memory mm){
		while(true) {
			System.out.println("\nStack===================");
			System.out.println("1.PUSH 2.POP 3.돌아가기");
			System.out.print("Input : ");
			int selectNum = sc.nextInt();
			if(selectNum == 1){
				System.out.println("PUSH를 선택하셨습니다. 숫자를 입력하세요.");
				System.out.print("Input : ");
				int inputNum = sc.nextInt();
				mm.push(inputNum);
			}else if(selectNum == 2) {
				System.out.println("POP을 선택하셨습니다.");
				System.out.println("출력 : "+mm.pop()+"\n");
			}else if(selectNum ==3){
				System.out.println("돌아가기를 선택하셨습니다.");
				System.out.println("메인화면으로 돌아갑니다.");
				break;
			}else{
				System.out.println("1,2,3 중에 선택하세요.");
			}
		}
	}
	public static void main(String[] args) {
		StackQueue2 in = new StackQueue2();
		Memory mm;
		while(true) {	
			System.out.println("\n========================");
			System.out.println("원하는 자료 구조를 선택하세요.");
			System.out.println("1.Stack 2.Queue 3.종료");
			System.out.print("Input : ");
			int selectNum = in.sc.nextInt();
			if(selectNum == 1) {
				//실행	
				mm = new MyStack();
				in.run(mm);
			}else if(selectNum == 2) {
				mm = new MyQueue();
				in.run(mm);
			}
			else if(selectNum == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("1 2 3 중에 입력하세요.");
			}
		}
	}
}
