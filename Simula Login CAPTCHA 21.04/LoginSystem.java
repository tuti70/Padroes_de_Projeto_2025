public class LoginSystem {
    private static LoginSystem instance;
    private CaptchaGenerator captchaGenerator;
    
    private LoginSystem() {
        this.captchaGenerator = new CaptchaGenerator();
    }
    
    public static LoginSystem getInstance() {
        if (instance == null) {
            instance = new LoginSystem();
        }
        return instance;
    }
    
    public boolean login(String username, String password, String captchaInput) {
        if (!captchaGenerator.validateCaptcha(captchaInput)) {
            captchaGenerator.generateNewCaptcha();
            return false;
        }
        
        // Verificação simples de usuário e senha
        if ("admin".equals(username) && "12345".equals(password)) {
            captchaGenerator.generateNewCaptcha();
            return true;
        }
        
        captchaGenerator.generateNewCaptcha();
        return false;
    }
    
    public String getCaptcha() {
        return captchaGenerator.getCaptcha();
    }
}