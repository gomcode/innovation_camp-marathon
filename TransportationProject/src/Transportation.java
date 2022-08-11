public abstract class Transportation {

    int carNumber;

    int gasGauge = 100;

    void changeGasGauge(int changeAmount) {
        gasGauge += changeAmount;
        if (gasGauge < 10) {
            System.out.println("주유 필요");
        }
    }

    int speed = 0;

    void changeSpeed(int changeAmount) {
        speed += changeAmount;
    }

    int maxPassengers;
    int currentPassengers = 0;

    void changeCurrentPassengers(int changeAmount) {
        if (maxPassengers < (currentPassengers + changeAmount)) {
            System.out.println("최대 승객 수 초과");
        } else if (0 < changeAmount) { //승객 탑승

        } else {

        }
        currentPassengers += changeAmount;

    }

    int fee;
    boolean isRunning = true;
    abstract String status();


/*
    abstract int carNumber();
    boolean isRunning = true;  // true == 운행 상태(최초상태) ,  false == 차고지행 상태
    int speed = 0;
    int gasAmount = 100; //초기 주유량 초기화
    int currentPassengers = 0;
    int maxPassengers;
    int fee;

    void changeMode() {
        if(isRunning == true) {
            isRunning = false;
        }
    }
    void changeGasAmount(int i) {

    }

    void gasGauge() {
        System.out.println(gasAmount());
    }

    void startRunning() {
        isRunning = true;

    }

    boolean isAvailable(boolean isRunning, int currentPassengers, int maxPassengers) {
        if (isRunning == true && currentPassengers() < maxPassengers()) {
            return true;
        } else {
            System.out.println("최대 승객 수 초과");
            return false;
        }
    }

    void gasCheckAlert() {
        if (gasAmount < 10) {
            System.out.println("주유 필요");
        }


    }


 */
}
