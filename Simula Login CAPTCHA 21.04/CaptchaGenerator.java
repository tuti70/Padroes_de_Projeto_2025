import java.util.Random;

public class CaptchaGenerator {
    private String captcha;
    
    public CaptchaGenerator() {
        generateNewCaptcha();
    }
    
    public void generateNewCaptcha() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < 6; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        
        this.captcha = sb.toString();
    }
    
    public String getCaptcha() {
        return captcha;
    }
    
    public boolean validateCaptcha(String input) {
        return input.equals(this.captcha);
    }
}