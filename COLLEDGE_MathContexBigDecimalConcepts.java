import java.math.*; // OR import java.math.BigDecimal;

public class COLLEDGE_MathContexBigDecimalConcepts {
    public static void main(String[] args){
        // Big Decimal Processes...
        double BigDecimalNum1 = 21.096437;
        double BigDecimalNum2 = 1.005422;
        // using MathContext...
        MathContext decimalNo = new MathContext(5);
        // Changing to Big Decimal...
        BigDecimal num1 = new BigDecimal(BigDecimalNum1, decimalNo);
        BigDecimal num2 = new BigDecimal(BigDecimalNum2, decimalNo);
        BigDecimal sumNum1Num2 = num1.add(num2);
        System.out.println("Big Decimal Add: "+sumNum1Num2); // Precision level of Big Decimal is more than any other...
        // Normal Methode Precision 4...
        System.out.printf("Normal Add P4: %.4f\n", BigDecimalNum1 + BigDecimalNum2);
        // Normal methode Precision 3...
        System.out.printf("Normal Add P3: %.3f", BigDecimalNum1 + BigDecimalNum2);
    }
}
