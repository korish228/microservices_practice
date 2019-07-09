package microservices.book.multiplication.domain;


import java.util.Objects;

public class Multiplication{
   private int factorA;
   private int factorB;

   private int result;

   public Multiplication() {
   }

      public Multiplication(int factorA, int factorB) {
      this.factorA = factorA;
      this.factorB = factorB;
      this.result = factorA * factorB;
   }

   public int getFactorA() {
      return factorA;
   }

   public int getFactorB() {
      return factorB;
   }

   public int getResult() {
      return result;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multiplication that = (Multiplication) o;
        return factorA == that.factorA &&
                factorB == that.factorB &&
                result == that.result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(factorA, factorB, result);
    }

    @Override
   public String toString() {
      return "Multiplication{" +
              "factorA=" + factorA +
              ", factorB=" + factorB +
              ", result=" + result +
              '}';
   }
}