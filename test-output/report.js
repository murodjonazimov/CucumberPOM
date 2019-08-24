$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM Home Page test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user logs in to app",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_opens_browser()"
});
formatter.result({
  "duration": 3941516759,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 19962096,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2289405266,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_home_page_title()"
});
formatter.result({
  "duration": 4979610,
  "status": "passed"
});
});