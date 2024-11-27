package Tests.RestAssured.api;

public record UserTimeResponse(String name, String job, String updatedAt) {

    @Override
    public String name() {
        return name;
    }

    @Override
    public String job() {
        return job;
    }

    @Override
    public String updatedAt() {
        return updatedAt;
    }
}
