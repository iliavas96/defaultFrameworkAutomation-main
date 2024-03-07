package api.Pojo.Post.unsuccessfulLogin;

public class UnsuccessfulLoginRequest {
    private String email;

    public UnsuccessfulLoginRequest(String email) {
        this.email = email;
    }

    public UnsuccessfulLoginRequest() {
    }

    public String getEmail() {
        return email;
    }
}
