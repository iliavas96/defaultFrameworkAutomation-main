package api.Pojo.Post.unLogin;

public class UnLoginRequest {
    private String email;

    public UnLoginRequest(String email) {
        this.email = email;
    } public UnLoginRequest() {
    }

    public String getEmail() {
        return email;
    }
}
