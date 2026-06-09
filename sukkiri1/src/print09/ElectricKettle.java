package print09;

public class ElectricKettle {

	//フィールド 

	private double waterTemperature; // 現在の水温 

	private double targetTemperature; // 設定温度 

	private boolean isOn; // ポットの電源状態 

	public ElectricKettle(double targetTemperature) {
		this.waterTemperature = 25;
		this.targetTemperature = targetTemperature;
		this.isOn = false;
	}

	/* * コンストラクタ 
	 * * 引数：設定温度 
	 * * 処理：初期の現在の水温は25℃ 
	 * * 設定温度は引数の値 
	 * * ポットの電源状態はfalse 
	 * 
	 * */
	public void turnOn() {
		System.out.println("ポットの電源をオンにしました");
		this.isOn = true;
		heatWater();

	}
	/* 
	 * メソッド名：turnOn 
	 * 引数：なし 
	 * 戻り値：なし 
	 * 処理：①「ポットの電源をオンにしました」を表示 
	 * ②ポットの電源状態をtrueにする 
	 * ③湯を沸かすメソッドを呼び出す 
	 * */

	public void turnOff() {
		System.out.println("ポットの電源をオフにしました。");
		this.isOn = false;
	}

	/* メソッド名：turnOff
	 * 引数：なし 
	 *  戻り値：なし 
	 *   処理：①「ポットの電源をオフにしました。」を表示 
	 *    ②ポットの電源状態をfalseにする 
	 *    
	 */

	private void heatWater() {

		//① 
		if (this.isOn == true) {
			while (isOn&&this.waterTemperature < this.targetTemperature) {
				//② 
				this.waterTemperature++;
				//③
				System.out.println("現在の水温:"+waterTemperature+"℃");
				//④ 
				if (this.targetTemperature <= this.waterTemperature) {
					this.isOn = false;
					System.out.println("水が設定温度に達しました。電源をオフにします。\n"
							+ "ポットの電源をオフにしました。");
				}
				//⑤ 

				try {
					Thread.sleep(1000); // 1000ミリ秒 (1秒) の停止 

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/* 
	 * メソッド名：heatWater （湯を沸かすメソッド） 
	 *  引数：なし * 戻り値：なし 
	 *  処理：①電源がオンで、現在温度が設定温度未満の場合は繰り返す 
	 *  ②水温を1度ずつ上昇させる 
	 *  ③現在温度を表示する 
	 *  ④設定温度に達したら電源をオフにする 
	 *  ⑤1秒ごとに処理を止める 
	 */

}