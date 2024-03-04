package api.Pojo.Post.unLogin;

public class UnLogResponse {
    private String error;

    public UnLogResponse(String error) {
        this.error = error;
    }
    public UnLogResponse() {}

    public String getError() {
        return error;
    }
}
