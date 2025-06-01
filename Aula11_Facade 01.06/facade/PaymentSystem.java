
package facade;

import facade.models.PaymentInfo;

public class PaymentSystem {
    public double calculateFinalPrice(double subtotal, PaymentInfo paymentInfo) {
        double finalPrice = subtotal;

        switch (paymentInfo.getMethod().toLowerCase()) {
            case "pix":
                finalPrice *= 0.9; // 10% de desconto
                break;
            case "boleto":
                finalPrice *= 0.95; // 5% de desconto
                break;
            case "crédito":
                if (paymentInfo.getInstallments() > 1) {
                    double interest = 0.0399 * (paymentInfo.getInstallments() - 1);
                    finalPrice *= (1 + interest);
                }
                break;
            case "débito":
                // Sem alterações
                break;
            default:
                throw new IllegalArgumentException("Método de pagamento inválido");
        }

        return finalPrice;
    }
}