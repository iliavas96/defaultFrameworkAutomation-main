package api.Pojo.Post.create;

public class CreateRequest {
    private String name;
    private String job;

    public CreateRequest() {
    }

    public CreateRequest(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

}
