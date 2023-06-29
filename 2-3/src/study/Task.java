package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator{
	


    /**
     * タスクの実行
     */
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
//    
    	   
            Calculator calculator = new Calculator();
            int sumValue1 = calculator.plus(10);
            int sumValue2 = calculator.plus(10, 20);
            int sumValue3 = calculator.plus(10, 20, 70);
            System.out.println("pulsメソッドの引数が１つの場合:" + sumValue1);
            System.out.println("pulsメソッドの引数が２つの場合:" + sumValue2);
            System.out.println("pulsメソッドの引数が３つの場合:" + sumValue3);
        }
    	
    	

    }

