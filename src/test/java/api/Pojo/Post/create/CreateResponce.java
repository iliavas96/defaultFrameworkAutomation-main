package api.Pojo.Post.create;

import java.util.Date;
import java.util.Objects;

public class CreateResponce {
    private String name;
    private String job;
    private String id;
    private String createdAt;

    public CreateResponce(String name, String job, String id, String createdAt) {
        this.name = name;
        this.job = job;
        this.id = id;
        this.createdAt = createdAt;
    }
    public CreateResponce(){}

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

}
