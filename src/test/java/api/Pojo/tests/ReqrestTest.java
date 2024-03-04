package api.Pojo.tests;

import api.Pojo.Get.colorData.ColorsData;
import api.Pojo.Get.listUsers.UserData;
import api.Pojo.Post.create.CreateRequest;
import api.Pojo.Post.create.CreateResponce;
import api.Pojo.Post.registrations.Registration;
import api.Pojo.Post.registrations.SuccessRegistration;
import api.Pojo.Post.unLogin.UnLogResponse;
import api.Pojo.Post.unLogin.UnLoginRequest;
import api.Pojo.Post.unRegistration.UnSuccessRegistration;
import api.Pojo.Put.userTime.UserTime;
import api.Pojo.Put.userTime.UserTimeResponse;
import api.Pojo.specifications.Specifications;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Clock;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class ReqrestTest {

    private static final String URL = "https://reqres.in";

    @Test
    public void checkAvatarAndIdTest() {
        Specifications.instalSpecification(Specifications.requestSpec(URL),
                Specifications.responseSpec200());
        List<UserData> users = given()
                .when()
                .get("/api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        users.forEach(x -> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
        Assert.assertTrue(users.stream().allMatch(x -> x.getEmail().endsWith("@reqres.in")));

        List<String> avatars = users.stream().map(UserData::getAvatar).collect(Collectors.toList());
        List<String> ids = users.stream().map(x -> x.getId().toString()).collect(Collectors.toList());
        List<String> emails = users.stream().map(UserData::getEmail).collect(Collectors.toList());

        for (int i = 0; i < avatars.size(); i++) {
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }
        for (int i = 0; i < emails.size(); i++) {
            Assert.assertTrue(emails.get(i).endsWith("@reqres.in"));
        }
    }

    @Test
    public void successRegistrationTest() {
        Specifications.instalSpecification(Specifications.requestSpec(URL),
                Specifications.responseSpec200());

        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";

        Registration user = new Registration("eve.holt@reqres.in", "pistol");
        SuccessRegistration successRegistration = given()
                .body(user)
                .when()
                .post("/api/register")
                .then().log().all()
                .extract().as(SuccessRegistration.class);

        Assert.assertNotNull(successRegistration.getId());
        Assert.assertNotNull(successRegistration.getToken());

        Assert.assertEquals(id, successRegistration.getId());
        Assert.assertEquals(token, successRegistration.getToken());
    }

    @Test
    public void UnSuccessRegistration() {
        Specifications.instalSpecification(Specifications.requestSpec(URL),
                Specifications.responseError400());

        Registration user = new Registration("eve.holt@reqres.in", "");
        UnSuccessRegistration unSuccessRegistration = given()
                .body(user)
                .when()
                .post("/api/register")
                .then().log().all()
                .extract().as(UnSuccessRegistration.class);

        Assert.assertEquals("Missing password", unSuccessRegistration.getError());
    }

    @Test
    public void sortedYearsTest() {
        Specifications.instalSpecification(Specifications.requestSpec(URL),
                Specifications.responseSpec200());
        List<ColorsData> colorsData = given()
                .when()
                .get("/api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ColorsData.class);

        List<Integer> years = colorsData.stream().map(ColorsData::getYear).collect(Collectors.toList());
        List<Integer> sortedYears = years.stream().sorted().collect(Collectors.toList());
        Assert.assertEquals(sortedYears, years);
    }

    @Test
    public void deleteTest() {
        Specifications.instalSpecification(Specifications.requestSpec(URL),
                Specifications.responseUnique(204));
        given()
                .when()
                .delete("/api/users/2")
                .then().log().all();
    }

    @Test
    public void TimeTest() {
        Specifications.instalSpecification(Specifications.requestSpec(URL),
                Specifications.responseUnique(200));
        UserTime user = new UserTime("morpheus", "zion resident");
        UserTimeResponse response = given()
                .body(user)
                .when()
                .put("/api/users/2")
                .then().log().all()
                .extract().as(UserTimeResponse.class);

        String regex = "(.{7})$";
        String regex2 = "(.{13})$";

        String currentTime = Clock.systemUTC().instant().toString().replaceAll(regex2, "");
        Assert.assertEquals(currentTime, response.getUpdatedAt().replaceAll(regex, ""));
    }

    @Test
    public void singleUserTest() {
        Specifications.instalSpecification(Specifications.requestSpec(URL),
                Specifications.responseSpec200());
        UserData user = new UserData(2, "janet.weaver@reqres.in", "Janet", "Weaver", "https://reqres.in/img/faces/2-image.jpg");
        UserData userData = given()
                .when()
                .get("api/users/2")
                .then().log().all()
                .extract().body().jsonPath().getObject("data", UserData.class);
        Assert.assertEquals(user.getId(), userData.getId());

    }

    @Test
    public void createUser() {
        Specifications.instalSpecification(Specifications.requestSpec(URL),
                Specifications.responseSpec201());
        String name = "morpheus";
        String job = "leader";
        CreateRequest request = new CreateRequest(name, job);
        CreateResponce response = given()
                .body(request)
                .when()
                .post("api/users")
                .then().log().all()
                .extract().as(CreateResponce.class);
        Assert.assertEquals(name, response.getName());
        Assert.assertEquals(job, response.getJob());
        Assert.assertNotNull(response.getId());
        Assert.assertNotNull(response.getCreatedAt());

    }

    @Test
    public void unLogin() {
        Specifications.instalSpecification(Specifications.requestSpec(URL),
                Specifications.responseError400());
        UnLoginRequest request = new UnLoginRequest("peter@klaven");
        String error = "Missing password";
        UnLogResponse unLog = given()
                .body(request)
                .when()
                .post("api/login")
                .then().log().all()
                .extract().as(UnLogResponse.class);
        Assert.assertEquals(error, unLog.getError());
    }
}