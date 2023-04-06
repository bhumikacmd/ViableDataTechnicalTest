$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/LocationPage.feature");
formatter.feature({
  "line": 2,
  "name": "Test Functionality of LocationPage",
  "description": "",
  "id": "test-functionality-of-locationpage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10796604200,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "User to navigate to location page",
  "description": "",
  "id": "test-functionality-of-locationpage;user-to-navigate-to-location-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "User click on Location link",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "User to verify number of images present for existing locations",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepdefs.userIsOnHomepage()"
});
formatter.result({
  "duration": 805993400,
  "status": "passed"
});
formatter.match({
  "location": "LocationPageStepdefs.userClickOnLocationLink()"
});
formatter.result({
  "duration": 537237100,
  "status": "passed"
});
formatter.match({
  "location": "LocationPageStepdefs.userToVerifyNumberOfImagesPresentForExistingLocations()"
});
formatter.result({
  "duration": 2066717100,
  "status": "passed"
});
formatter.after({
  "duration": 148000,
  "status": "passed"
});
});