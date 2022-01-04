package mc.ys.lesson6;

public class Studio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studio studio = new Studio();
		studio.onAir();
	}
	
	public void onAir() {
		LottoMachine machine = this.readyLottoMachine();
		System.out.println("지금부터 로또 추첨을 시작합니다.");
		machine.startMachine();
		System.out.println("지금까지 로또 추첨이었습니다.\n감사합니다.");
	}
	
	public LottoMachine readyLottoMachine() {
		LottoMachine machine = null;
		LottoBall newBalls = new LottoBall();
		System.out.println("로또 공을 생성합니다.");
		System.out.println("로또 공을 머신에 주입합니다.");
		machine = new LottoMachine(newBalls);
		return machine;
	}

}
