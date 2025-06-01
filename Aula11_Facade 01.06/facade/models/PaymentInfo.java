
package facade.models;

public class PaymentInfo {
    private String method;
    private int installments;

    public PaymentInfo(String method, int installments) {
        this.method = method;
        this.installments = installments;
    }

    // Getters
    public String getMethod() {
        return method;
    }

    public int getInstallments() {
        return installments;
    }
}