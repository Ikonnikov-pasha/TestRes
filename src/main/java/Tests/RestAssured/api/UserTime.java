package Tests.RestAssured.api;

public record UserTime(String name, String job) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public String job() {
        return job;
    }
}
