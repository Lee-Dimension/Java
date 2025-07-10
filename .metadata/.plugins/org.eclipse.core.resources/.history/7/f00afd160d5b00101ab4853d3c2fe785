package NumberBaseBall;
import java.util.Random;
import java.util.Scanner;


class BaseballGame{
	private int[] storage = new int[3]; //정답 숫자
	private int[][] candidates = new int[720][3]; //후보 숫자들
	private int can_count = 0; //후보 수
	private int try_count =0;//시도 횟수
	private Scanner sc = new Scanner(System.in);
	
	public BaseballGame() {
		generateRandNum();
		generateCandidates();
	}
	
	public void generateRandNum() {
		Random random = new Random();
		int count = 0;
		
		while(count<3) {
			int temp=random.nextInt(10);
			int i=0;
			//안에 존재하면? 다시 시행.
			for(;i<count;i++) {if(storage[i] ==temp) {break;}}
			
			if(i==count) {
				storage[count]=temp;
				count++;
			}
		}
	}
	
	public void generateCandidates() {
		can_count=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(i==j)
					continue;
				for(int k=0;k<10;k++) {
					if(k==i || k==j)
						continue;
					candidates[can_count][0] = i;
					candidates[can_count][1] = j;
					candidates[can_count][2] = k;
					can_count++;
				}
			}
		}
	}
	
	public int[] getUserNum() {
		//맨 앞의 숫자를 기준으로 시작
		int[] guess = new int[3];
		guess[0] = candidates[0][0];
		guess[1] = candidates[0][1];
		guess[2] = candidates[0][2];
		
		//방금 추측한 숫자 3자리의 -> 체크결과 -> 실제 결과
		int[] result = checkResult(guess);

		//정답 후보 저장
		int[][] nextCandidates= new int[720][3];
		int next_count=0; //후보 갯수
		
		//후보 중에 실제 결과와 일치하는 애들만 남김. -> 즉, 이전 비교에서 겹치면 남고, 아니면 다 버림
		// 이전꺼가 1S 1B -> 후보들 사이에서, 이거는 만족하는 애들만 남긴다는 것.
		//이번 추측에서 나온 힌트와 동일한 힌트는 줄 수 있는 후보만 남김
		//정답 [4,7,9]일 때, 
		//guess = 0,1,2 -> 0S 0B임
		//후보들은 이것들과 비교했을 때, 0S 0B을 만족 -> 0,1,2와 하나도 안 겹치는 애들만 남김
		for(int i=0;i<can_count;i++) {
			int[] can = candidates[i]; //후보 숫자 하나씩
			int[] res = new int[2]; //res0 = strike, res1 = ball
			
			for(int x=0;x<3;x++) {
				for(int y=0;y<3;y++) {
					if(guess[x] == can[y]) {
						if(x==y) res[0]++; // 위치,숫자 같으면 strike
						else res[1]++; //숫자만 같으면 ball
					}
				}
			}
			
			//추측이 같은(res) 것을 후보로 남김.
			if(res[0]==result[0] && res[1] == result[1]) {
				nextCandidates[next_count][0] = can[0];
				nextCandidates[next_count][1] = can[1];
				nextCandidates[next_count][2] = can[2];
				next_count++;
			}
		}
		
		//후보 업데이트
		for(int i=0;i<next_count;i++) {
			candidates[i][0] = nextCandidates[i][0];
			candidates[i][1] = nextCandidates[i][1];
			candidates[i][2] = nextCandidates[i][2];
			
		}
		can_count=next_count;
		
		return guess;
	}
	
	
	//체크하기(기존과 동일)
	public int[] checkResult(int[] user) {
		int[] res = new int[2];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				//있는지 검사
				if(user[i]==storage[j]) {
					//같은 인덱스면 strike
					if(i==j) {res[0]++;}
					else {res[1]++;}
				}
			}
		}
		return res;
	}
	
	
	//유저 숫자 뽑아서 체크해보고 맞으면 끝, 아니면 횟수 증가
	public int start() {
		 while (true) {
	            int[] user = getUserNum();
	            int[] result = checkResult(user);
	            try_count++;
	            
	            if (result[0] == 3) {
	                break;
	            }
		 }
		 return try_count;
	}
}

public class Tc {

	public static void main(String[] args) {
		int gameCount=0;
		int total = 0;
		while(gameCount<1000) {
			BaseballGame game = new BaseballGame();
			int try_count = game.start();
			total+= try_count;
			gameCount++;
		}
		double avg = (double)total/gameCount;
		System.out.printf("%.2f 의 평균 시도 횟수\n",avg);
	}
}